package com.saeyan.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.DefaultBoundedRangeModel;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.saeyan.dao.ProductDAO;
import com.saeyan.dao.productDAO;
import com.saeyan.dto.ProductVo;
import com.saeyan.dto.productVo;

/**
 * Servlet implementation class ProductUpdateServlet
 */
@WebServlet("/productupdate.do")
public class ProductUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String code = request.getParameter("code");
		ProductDAO pdao = ProductDAO.getInstance();
		ProductVo pVo = pdao.selectProductByCode(code);
		request.setAttribute("product", pVo);
		RequestDispatcher dispatcher = request.getRequestDispatcher("product/productUpdate.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//한글 깨짐 방지 하는것 
		request.setCharacterEncoding("UTF-8");
		//
		ServletContext context = getServletContext();
		String path = context.getRealPath("upload");		
		String encType = "UTF-8";
		int sizelmit = 20 * 1024*1024;
		
		MultipartRequest multi = new MultipartRequest(request, path, sizelmit,
				encType, new DefaultFileRenamePolicy());
		//상품  가져오기
		String code = multi.getParameter("code");
		String name = multi.getParameter("name");
		int price = Integer.parseInt(multi.getParameter("price"));
		String description = multi.getParameter("description");
		String pictureUrl = multi.getFilesystemName("pictureUrl");
		
		if (pictureUrl == null) {
			pictureUrl = multi.getParameter("nonmakeImg");
		}
		//db처리를 위해 사용 
		ProductVo pVo = new ProductVo();
		pVo.setCode(Integer.parseInt(code));
		pVo.setName(name);
		pVo.setPrice(price);
		pVo.setDesoription(description);
		pVo.setPictureurl(pictureUrl);
		
		//가져와서 저장하기
		ProductDAO pDao = ProductDAO.getInstance();
		//입력받은 상품 저장하기 
		pDao.updateProduct(pVo);
		response.sendRedirect("productList.do");
		
	
	}

}
