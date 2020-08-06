package com.lti.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.model.Option;
import com.lti.model.Question;


@WebServlet("/CheckAnswerServlet")
public class CheckAnswerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		Question qs= (Question) session.getAttribute("nextQS");
		int opno=Integer.parseInt(request.getParameter("op"));
		
		Option selectedOption=qs.getOptions().get(opno);
		
		Integer score=(Integer) session.getAttribute("score");
		 if(score == null) {
			 score=0;
		 }
		 if(selectedOption.isRightAnswer()) {
			 score++;
		 }
		 
		 session.setAttribute("score", score);
		 
		 response.sendRedirect("QuestionLoaderServlet?q=next");
		 
	}

}
