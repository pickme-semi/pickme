package com.auth.model.service.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.auth.model.vo.User;

import static com.common.JDBCTemplate.*;

public class UserDao {
	
	private Properties prop;
	
	public UserDao() {
		prop = new Properties();
		String filePath = UserDao.class
				.getResource("/config/user-query.properties").getPath();
		try {
			prop.load(new FileReader(filePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int joinUser(Connection con, User u) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("joinUser");
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, u.getUserId());
			pstmt.setString(2, u.getUserPass());
			pstmt.setString(3, u.getUserEmail());
			pstmt.setString(4, u.getUserName());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(con);
		}
		
		return result;
	}

}
