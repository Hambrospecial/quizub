package com.hambrospecial.quizub.service.serviceimpl;

import com.hambrospecial.quizub.model.Quiz;
import com.hambrospecial.quizub.repository.QuizRepository;
import com.hambrospecial.quizub.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;

    @Override
    public Quiz getQuizById(long id) {
        return quizRepository.findById(id).orElseThrow(
                ()->new RuntimeException("Quiz with id " + id + " not found!")
        );
    }

    @Override
    public String addQuiz(Quiz quiz) {
        quizRepository.save(quiz);
        return "Successfully save";
    }

    @Override
    public List<Quiz> addQuizes(List<Quiz> quizes) {
        return quizRepository.saveAll(quizes);
    }

    @Override
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    @Override
    public List<Quiz> getQuizzesPerRound(int numberOfQuizzes) {

        Set<Long> randomGeneratedQuizNumbers = new HashSet<>();
        Random r = new Random();
        int high = quizRepository.findAll().size();
        while (randomGeneratedQuizNumbers.size() <= numberOfQuizzes){
            long result = r.nextInt(high) + 1;
            randomGeneratedQuizNumbers.add(result);
        }

        List<Quiz> generatedQuizzes = new ArrayList<>();
        for (Long num : randomGeneratedQuizNumbers) {
            generatedQuizzes.add(quizRepository.findById(num).get());
        }

        return generatedQuizzes;
    }
}
