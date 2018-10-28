package com.auth.model.service;

import com.auth.model.service.dao.UserDao;
import com.auth.model.vo.User;

import static com.common.JDBCTemplate.*;

import java.sql.Connection;

public class UserService {
	
	private UserDao uDao = new UserDao();

	public int JoinUser(User u) {
		Connection con = getConnection();
		
		int result = uDao.joinUser(con, u);
		
		if(result > 0 ) commit(con);
		else rollback(con);
		
		close(con);
		
		return result;
	}

}
