package com.te.quizmain;

import java.util.Scanner;

import com.te.quizfactory.Factory;

public class App 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

			Factory factory = new Factory();

			
			factory.playQuiz();
	}
}
