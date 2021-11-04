package com.fastcampus.biz.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fastcampus.biz.common.JDBCUtil;

public class GetBoardClient {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			DriverManager.registerDriver(new org.h2.Driver());
			conn = JDBCUtil.getConnection();
			

			
			String sql = "select * from board where seq = ?";
			
			stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, Integer.parseInt(args[0]));
			
			rs = stmt.executeQuery();
			
			
			
			if(rs.next()) {
				System.out.print(rs.getInt("SEQ")+" : ");
				System.out.print(rs.getString("TITLE")+" : ");
				System.out.print(rs.getString("WRITER")+" : ");
				System.out.print(rs.getString("CONTENT")+" : ");
				System.out.print(rs.getString("REGDATE")+" : ");
				System.out.println(rs.getInt("CNT")+" : ");
			}
		
					
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			//resultset도 close해줘야함
			JDBCUtil.close(rs, stmt, conn);
		}
		
	}

}

