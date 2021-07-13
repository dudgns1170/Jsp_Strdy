package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.saeyan.dto.ProductVo;

import util.DBManger;

public class ProductDAO {
	private ProductDAO()
	{
	}	
	private static ProductDAO  instance = new ProductDAO();
	public static ProductDAO getInstance()
	{
		return instance;
	}

	
	
	public List<ProductVo> selectAIIProducts()
	{
		//최근 등록한 상품 먼저 출력하기
		String sql ="select * from product order by code desc";
		List<ProductVo> list = new ArrayList<ProductVo>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		try {
			conn= DBManger.getConnection();
			pstmt= conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				ProductVo pVo= new ProductVo();
				pVo.setCode(rs.getInt("code"));
				pVo.setName(rs.getString("name"));
				pVo.setPrice(rs.getInt("price"));
				pVo.setPictureurl(rs.getString("pictureurl"));
				pVo.setDesoription(rs.getString("desoription"));
				list.add(pVo);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBManger.close(conn, rs, pstmt);
		}
		return list;
		
	}
	
	public void insertProduct(ProductVo pVo)
	{
		String sql = "insert into product values(product_sep,nextval,?,?,?,?)";
		Connection conn =null;
		PreparedStatement pstmt = null;
		try {
			conn= DBManger.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pVo.getName());
			pstmt.setInt(2, pVo.getPrice());
			pstmt.setString(3, pVo.getPictureurl());
			pstmt.setString(4, pVo.getDesoription());
			pstmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBManger.close(conn, pstmt);
		}
	}
	

}
