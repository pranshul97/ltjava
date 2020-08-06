package com.lti.model;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Question.Difficulty;

public class QuestionBankLoader {

	public List<Question> loadQuestionsOnJava() {
		String subjectName="Java";
		QuestionBank qb=new QuestionBank();
		qb.addNewSubject(subjectName);
		
		Question q=new Question("What is Java?",Difficulty.EASY);
		List<Option> ops=new ArrayList<Option>();
		ops.add(new Option("Java is a DataBase",false));
		ops.add(new Option("Java is a Programming Language",true));
		ops.add(new Option("Java is a OS",false));
		ops.add(new Option("Java is a Laptop",false));
		
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q=new Question("What is G1?",Difficulty.EASY);
		ops=new ArrayList<Option>();
		ops.add(new Option("G1 is a Garbage Collector in Java",true));
		ops.add(new Option("G1 is a English Word gor Jeevan",false));
		ops.add(new Option("G1 is a OS",false));
		ops.add(new Option("G1 is a Laptop",false));
		
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q=new Question("What is Collections in java?",Difficulty.MEDIUM);
		ops=new ArrayList<Option>();
		ops.add(new Option("Collections is a DataBase",false));
		ops.add(new Option("Collections is a Programming Language",false));
		ops.add(new Option("Collections is a Framework",true));
		ops.add(new Option("Collections is a Garbage Collector",false));
		
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q=new Question("What is a String in Java?",Difficulty.EASY);
		ops=new ArrayList<Option>();
		ops.add(new Option("String is a DataBase",false));
		ops.add(new Option("String is a Class",true));
		ops.add(new Option("String is a datatype",false));
		ops.add(new Option("String is a framework",false));
		
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		return qb.getQuestionsFor(subjectName);
	}
}
