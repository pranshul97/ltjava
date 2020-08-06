package com.lti.model;

import java.util.List;

public class Question {

	private String questions;
	private Difficulty difficulty;
	private List<Option> options;
	
	public Question() {
		
	}

	public Question(String questions, Difficulty difficulty) {
		super();
		this.questions = questions;
		this.difficulty = difficulty;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public static enum Difficulty{
		EASY, MEDIUM, HARD;
	}
}
