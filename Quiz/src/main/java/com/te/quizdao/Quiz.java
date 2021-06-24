package com.te.quizdao;

import java.util.Date;

import com.te.quizhibernate.QuizQuestions;

import com.te.quizhibernate.Results;

interface Quiz {

	
	abstract QuizQuestions questions(int id);
	
	abstract void results(Results results);
	
	abstract Results getResults(Date date);

}
