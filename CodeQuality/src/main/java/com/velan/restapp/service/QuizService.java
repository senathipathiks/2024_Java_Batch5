package com.velan.restapp.service;

import java.util.List;
import com.velan.restapp.model.Quiz;

public interface QuizService {
	public void addQuiz(Quiz quiz);
	public Quiz getQuiz(int id);
	public List<Quiz> getAllQuiz();
	public void updateQuiz(Quiz quiz);
	public void deleteQuiz(int id);
	public List<Integer> getAllId();
}
