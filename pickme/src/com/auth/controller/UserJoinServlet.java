package com.auth.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auth.model.service.UserService;
import com.auth.model.vo.User;

/**
 * Servlet implementation class UserJoinServlet
 */
@WebServlet("/userJoin.au")
public class UserJoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserJoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("userJoinServlet");
		
		String userId = request.getParameter("userId");
		String userPass = request.getParameter("userPass");
		String userEmail = request.getParameter("userEmail");
		String userName = request.getParameter("userName");
		
		UserService us = new UserService();
		
		User u = new User(userId, userPass, userEmail, userName);
		
		System.out.println("가입할 유저 정보 : " + u);
		
		if(us.JoinUser(u) > 0) {
			System.out.println("유저가입 성공 user : " + u);
			response.sendRedirect("/pickme");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
