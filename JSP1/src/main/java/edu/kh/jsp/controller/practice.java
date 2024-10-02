package edu.kh.jsp.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup_result")
public class practice extends HttpServlet {
	
	//post
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String inputId = req.getParameter("inputId");
		String inputPw = req.getParameter("inputPw");
		String checkPw = req.getParameter("checkPw");
		String inputName = req.getParameter("inputName");
		String inputAge = req.getParameter("inputAge");
		
		System.out.println(inputId);
		System.out.println(inputPw);
		System.out.println(checkPw);
		System.out.println(inputName);
		System.out.println(inputAge);
		
		// 2) 요청 발송자 얻어오기
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/signup_result.jsp");
				
		// 3) 요청 위임(forward)
		dispatcher.forward(req, resp);
		
		
	}

}
