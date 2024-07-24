package com.velan.restapp.serviceimp;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.velan.restapp.model.Question;
import com.velan.restapp.repository.QuestionRepo;
import com.velan.restapp.service.QuestionService;

@Service
public class QuestionServiceImp implements QuestionService {

	QuestionRepo repo;
	public QuestionServiceImp(QuestionRepo repo) {
		this.repo = repo;
	}

	@Override
	public void addQuestion(Question que) {	
		repo.save(que);
	}

	@Override
	public Question getQuestion(int id) {
	    Optional<Question> questionOptional = repo.findById(id);
	    return questionOptional.orElse(null);
	}

	@Override
	public List<Question> getAllQuestions() {	
		return repo.findAll();
	}

	@Override
	public void updateQuestion(Question cus) {	
		repo.save(cus);		
	}

	@Override
	public void deleteQuestion(int id) {		
		repo.deleteById(id);		
	}

}

