package com.te.quizhibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class QuizQuestions implements Serializable {

	@Id
	@Column
	private int id;
	@Column
	private String question1;
	@Column
	private String question2;
	@Column
	private String question3;
	@Column
	private String question4;
	@Column
	private String question5;
	@Column
	private String answer1;
	@Column
	private String answer2;
	@Column
	private String answer3;
	@Column
	private String answer4;
	@Column
	private String answer5;
	@Column
	private String option1;
	@Column
	private String option2;
	@Column
	private String option3;
	@Column
	private String option4;
	@Column
	private String option5;

}
