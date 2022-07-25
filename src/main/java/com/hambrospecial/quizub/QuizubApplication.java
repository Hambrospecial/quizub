package com.hambrospecial.quizub;

import com.hambrospecial.quizub.model.Quiz;
import com.hambrospecial.quizub.repository.QuizRepository;
import com.hambrospecial.quizub.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class QuizubApplication implements CommandLineRunner {

	@Autowired
	QuizService quizService;

	public static void main(String[] args) {
		SpringApplication.run(QuizubApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		quizService.addQuiz(new Quiz("Which country is the giant of Africa?", "Nigeria" , new HashSet<>(Set.of("Ghana", "Cameroun", "Nigeria", "Togo"))));
		quizService.addQuiz(new Quiz("In what continent is Nigeria?", "Africa" , new HashSet<>(Set.of("Africa", "Asia", "Europe"))));
		quizService.addQuiz(new Quiz("How many states are in Nigeria?", "36" , new HashSet<>(Set.of("40", "36", "72", "12"))));
		quizService.addQuiz(new Quiz("Where is the capital of Nigeria located?", "Abuja" , new HashSet<>(Set.of("Lagos", "Abuja"))));
		quizService.addQuiz(new Quiz("Who is the head of the family?", "Father" , new HashSet<>(Set.of("Mother", "Father", "Sister", "GrandPa"))));
		quizService.addQuiz(new Quiz("Which country is the giant of Africa?", "Nigeria" , new HashSet<>(Set.of("Ghana", "Cameroun", "Nigeria", "Togo"))));
		quizService.addQuiz(new Quiz("In what continent is Nigeria?", "Africa" , new HashSet<>(Set.of("Africa", "Asia", "Europe"))));
		quizService.addQuiz(new Quiz("How many states are in Nigeria?", "36" , new HashSet<>(Set.of("40", "36", "72", "12"))));
		quizService.addQuiz(new Quiz("Where is the capital of Nigeria located?", "Abuja" , new HashSet<>(Set.of("Lagos", "Abuja"))));
		quizService.addQuiz(new Quiz("Who is the head of the family?", "Father" , new HashSet<>(Set.of("Mother", "Father", "Sister", "GrandPa"))));

	}
}
