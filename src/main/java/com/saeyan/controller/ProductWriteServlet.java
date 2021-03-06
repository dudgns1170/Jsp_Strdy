package com.saeyan.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.saeyan.dao.ProductDAO;
import com.saeyan.dto.ProductVo;

/**
 * Servlet implementation class ProductWriteServlet
 */
@WebServlet("/productWrite.do")
public class ProductWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("product/productWrite.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		

		request.setCharacterEncoding("UTF-8");
		 response.setContentType("text/html; charset=UTF-8");
		ServletContext context =getServletContext();
		String path = context.getRealPath("upload");
		String enType = "UTF-8";
		int sizeLimit =20*1024*1024;
		//파일업로드를 위한 클레스 
		MultipartRequest multi = new MultipartRequest(request, path,sizeLimit, enType, new DefaultFileRenamePolicy());
		//데이터 정보 가져오기 
		String name = multi.getParameter("name");
		
		int price = Integer.parseInt(multi.getParameter("price"));
		String description = multi.getParameter("description");
		String pictureUrl = multi.getFilesystemName("pictureUrl");
		//데이터 정보값을 넘겨주기 위해 셋팅 
		ProductVo pVo = new ProductVo();
		pVo.setName(name);
		pVo.setPrice(price);
		pVo.setDesoription(description);
		pVo.setPictureurl(pictureUrl);
		
		ProductDAO pDao =ProductDAO.getInstance();
		//객체화하여 함수를 가져와 사용 
		pDao.insertProduct(pVo);
		//등록 후 페이지 넘어가는 곳 지정 
		response.sendRedirect("productList.do");
		
	}

}
