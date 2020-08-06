package com.lti.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.model.Question;
import com.lti.model.QuestionBankLoader;

/**
 * Servlet implementation class QuestionLoaderServlet
 */
@WebServlet("/QuestionLoaderServlet")
public class QuestionLoaderServlet extends HttpServlet {
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		Integer qno=(Integer) session.getAttribute("qno");
		
		QuestionBankLoader qbLoader=new QuestionBankLoader();
		List<Question> listOfQuestions=qbLoader.loadQuestionsOnJava();
		
		Question nextQuestion=null;
		String q=request.getParameter("q");
		
		if(qno!=null && qno==3 && q!=null && q.equals("next")) {
			System.out.println("Question no.="+qno);
			response.sendRedirect("viewResult.jsp");
		}
		else if(q!=null && q.equals("next")) {
			qno+=1;
			nextQuestion=listOfQuestions.get(qno);
			session.setAttribute("nextQS", nextQuestion);
			session.setAttribute("qno", qno);
			response.sendRedirect("viewQuestion.jsp");
		}
		else if(q!=null && q.equals("prev")) {
			qno=qno-1;
			nextQuestion=listOfQuestions.get(qno);
			session.setAttribute("nextQS", nextQuestion);
			session.setAttribute("qno", qno);
			response.sendRedirect("viewQuestion.jsp");
		}
		else {
			qno=0;
			nextQuestion=listOfQuestions.get(qno);
			session.setAttribute("nextQS", nextQuestion);
			session.setAttribute("qno", qno);
			response.sendRedirect("viewQuestion.jsp");
		}

		
			
	}

}
