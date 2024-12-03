package com.map;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question {

	@Id
	@Column(name="question_id")
	private int questionId;
	
	private String question;
//	
//	@OneToOne
//	@JoinColumn(name="a_id")
//	private Answer answer;
	
	@OneToMany(mappedBy = "q", fetch=FetchType.EAGER)
	private List<Answer> answers;
	
	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return answers;
	}

	public void setAnswer(List<Answer> answer) {
		this.answers = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionId, String question, List<Answer> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}	
}
