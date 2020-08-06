<%@page import="java.util.List"%>
<%@page import="com.lti.model.Question"%>
<%@page import="com.lti.model.Option"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Questions</title>
</head>
<body>
<form action="CheckAnswerServlet">
<%
	int opno=0;
	Question qs= (Question) session.getAttribute("nextQS");
%>

<h2>Question <%= qs.getQuestions() %></h2><br />
<%
	List<Option> option=qs.getOptions();
	for(Option op : option){
%>
<input type="radio" name="op" value="<%= opno++ %>" /><%= op.getOption() %><br />
<%
	}
%>
<button type="submit" >Submit and Next</button>
<h4><a href="QuestionLoaderServlet?q=next">Next Question</a></h4>
<h4><a href="QuestionLoaderServlet?q=prev">Previous Question</a></h4>
</form>
</body>
</html>