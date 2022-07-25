package com.hambrospecial.quizub.service;

import com.hambrospecial.quizub.model.Quiz;

import java.util.List;
import java.util.Optional;

public interface QuizService {
    Quiz getQuizById(long id);
    String addQuiz(Quiz quiz);
    List<Quiz> addQuizes(List<Quiz> quizes);
    List<Quiz> getAllQuizzes();

    List<Quiz> getQuizzesPerRound(int numberOfQuizzes);
}

