package com.mybatis.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.mybatis.member.dto.member;
import com.mybatis.member.service.MemberServiceImpl;

/**
 * Servlet implementation class MemberInsertServlet
 */
@WebServlet("/insert.me")
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		member m = new member();
		
		m.setUser_id(request.getParameter("userId"));
		m.setUser_pwd(request.getParameter("userPwd"));
		m.setUser_name(request.getParameter("userName"));
		m.setEmail(request.getParameter("email"));
		m.setBirthday(request.getParameter("birthday"));
		m.setGender(request.getParameter("gender"));
		m.setPhone(request.getParameter("phone"));
		m.setAddress(request.getParameter("address"));
		
		int result = new MemberServiceImpl().insertMember(m);
		
		if(result > 0) {
			response.sendRedirect(request.getContextPath());
		}
	}

}
