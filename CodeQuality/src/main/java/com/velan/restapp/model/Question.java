package com.velan.restapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int qid;
	@Column
	private String que;
	@Column
	private String choice;
	@Column
	private int score;

	@OneToOne(targetEntity = Quiz.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "tid")
	private Quiz quiz;

	public Question() {
		super();
	}

	public Question(int qid, String que, String choice, int score, Quiz quiz) {
		super();
		this.qid = qid;
		this.que = que;
		this.choice = choice;
		this.score = score;
		this.quiz = quiz;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", que=" + que + ", choice=" + choice + ", score=" + score + ", quiz=" + quiz
				+ "]";
	}

}
