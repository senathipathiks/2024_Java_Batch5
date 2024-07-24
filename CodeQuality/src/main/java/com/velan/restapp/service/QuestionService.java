package com.velan.restapp.service;

import java.util.List;
import com.velan.restapp.model.Question;

public interface QuestionService {
	public void addQuestion(Question que);
	public Question getQuestion(int id);
	public List<Question> getAllQuestions();
	public void updateQuestion(Question que);
	public void deleteQuestion(int id);	
}
