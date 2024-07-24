package com.velan.restapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.velan.restapp.model.Quiz;
import com.velan.restapp.serviceimp.QuizServiceImp;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/quiz")
@CrossOrigin("http://localhost:3000")
public class QuizController {

	@Autowired
	QuizServiceImp service;
	
	static final String SUCCESS="Success";
	static final String FAILURE="Failure";
	
	@PostMapping
	public String insertQuiz(@RequestBody Quiz quiz) {
		String msg = "";
		try {
			service.addQuiz(quiz);
			msg = SUCCESS;
		}
		catch (Exception e) {
			msg = FAILURE;
		}
		return msg;
	}

	@GetMapping("{id}")
	public Quiz getQuizById(@PathVariable("id") int id) {
		return service.getQuiz(id);
	}

	@GetMapping("/all")
	public List<Quiz> getQuiz() {
		return service.getAllQuiz();
	}
	
	@PutMapping()
	public String updateQuiz(@RequestBody Quiz quiz) {
		String msg = "";
		try {
			service.updateQuiz(quiz);
			msg = SUCCESS;
		}
		catch (Exception e) {
			msg = FAILURE;
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteQuizById(@PathVariable("id")int id) {
		String msg="";
		try {
			service.deleteQuiz(id);
			msg=SUCCESS;
		} 	
		catch (Exception e) {
			msg=FAILURE;
		}
		return msg;
	}
	
	@GetMapping("/idlist")
	public List<Integer> getIdList() {	
		return service.getAllId();
	}
}
