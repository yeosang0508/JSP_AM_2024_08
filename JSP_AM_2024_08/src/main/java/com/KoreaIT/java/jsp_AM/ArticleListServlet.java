package com.KoreaIT.java.jsp_AM;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@WebServlet("/article/list")
public class ArticleListServlet extends HttpServlet {
	
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		// DB 연결
		try {
				Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
		
		response.getWriter().append("123");
		
		String url = "jdbc:mysql://127.0.0.1:3306/24_08_JAM?useUnicode=true&characterEncoding=utf8&autoReconnect=true&serverTimezone=Asia/Seoul";

		String user = "root";
		String password = "";

		Connection conn = null;
		
		try {
			
				conn = DriverManager.getConnection(url, user, password);
				response.getWriter().append("연결 성공!");
				
				DBUtil dbUtil = new DBUtil(request, response);
				
				String sql = "SELECT * FROM article ORDER BY id DESC";
				
				List<Map<String, Object>> articleRows = dbUtil.selectRows(conn, sql);
					
				request.setAttribute("articleRows", articleRows);
				
				request.getRequestDispatcher("/jsp/article/list.jsp").forward(request, response);
		
		}catch(SQLException e) {
			System.out.println("에러 1 : " + e);
		}finally {
			
			try {
				if(conn != null && !conn.isClosed()) {
					conn.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}

}
