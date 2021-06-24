package com.te.quizdao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.quizhibernate.QuizQuestions;

import com.te.quizhibernate.Results;

public class Play implements Quiz {

	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	EntityTransaction transaction = null;


	@Override
	public QuizQuestions questions(int id) {

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("quiz");
			entityManager = entityManagerFactory.createEntityManager();
			QuizQuestions questions = entityManager.find(QuizQuestions.class, id);
			return questions;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (entityManagerFactory != null) {
					entityManagerFactory.close();
				}
				if (entityManager != null) {
					entityManager.close();
				}
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}
		return null;
	}// End of the Method

	@Override
	public void results(Results results) {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("quiz");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(results);
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			try {
				if (entityManagerFactory != null) {
					entityManagerFactory.close();
				}
				if (entityManager != null) {
					entityManager.close();
				}
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}

	}// End of the Method

	@Override
	public Results getResults(Date date) {
		Results results = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("quiz");
			entityManager = entityManagerFactory.createEntityManager();
			results = entityManager.find(Results.class, date);
			return results;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (entityManagerFactory != null) {
					entityManagerFactory.close();
				}
				if (entityManager != null) {
					entityManager.close();
				}
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}
		return results;
	}// End of the Method
}// End of the Class
