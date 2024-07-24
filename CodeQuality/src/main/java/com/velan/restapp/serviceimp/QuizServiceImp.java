package com.velan.restapp.serviceimp;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.velan.restapp.model.Quiz;
import com.velan.restapp.repository.QuizRepo;
import com.velan.restapp.service.QuizService;

@Service
public class QuizServiceImp implements QuizService {

	QuizRepo repo;
	public QuizServiceImp(QuizRepo repo) {
		this.repo = repo;
	}

	@Override
	public void addQuiz(Quiz quiz) {		
		repo.save(quiz);
	}

	@Override
	public Quiz getQuiz(int id) {		
		Optional<Quiz> quizOptional=repo.findById(id);
		return quizOptional.orElse(null);	
	}

	@Override
	public List<Quiz> getAllQuiz() {		
		return repo.findAll();
	}

	@Override
	public void updateQuiz(Quiz quiz) {		
		repo.save(quiz);		
	}

	@Override
	public void deleteQuiz(int id) {		
		repo.deleteById(id);		
	}
	
	@Override
	public List<Integer> getAllId(){	
		return repo.getIdList();
	}

}
