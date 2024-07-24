package com.velan.restapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.velan.restapp.model.Question;
import com.velan.restapp.serviceimp.QuestionServiceImp;

@RestController
@RequestMapping("/question")
@CrossOrigin("http://localhost:3000")
public class QuestionController {

	@Autowired
    QuestionServiceImp service;

	static final String SUCCESS="Success";
	static final String FAILURE="Failure";
	
	@PostMapping
	public String insertQuestion(@RequestBody Question que) {
		String msg = "";
		try {
			service.addQuestion(que);
			msg = SUCCESS;
		}
		catch (Exception e) {
			msg = FAILURE;
		}
		return msg;
	}

	@GetMapping("{id}")
	public Question getQuestionById(@PathVariable("id") int id) {
		return service.getQuestion(id);
	}

	@GetMapping("/all")
	public List<Question> getQuestion() {
		return service.getAllQuestions();
	}
	
	@PutMapping()
	public String updateQuestion(@RequestBody Question que) {
		String msg = "";
		try {
			service.updateQuestion(que);
			msg = SUCCESS;
		}
		catch (Exception e) {
			msg = FAILURE;
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteQuestionById(@PathVariable("id")int id) {
		String msg="";
		try {
			service.deleteQuestion(id);
			msg=SUCCESS;
		} 
		catch (Exception e) {
			msg=FAILURE;
		}
		return msg;
	}
}
