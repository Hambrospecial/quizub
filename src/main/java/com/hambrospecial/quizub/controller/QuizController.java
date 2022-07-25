package com.hambrospecial.quizub.controller;

import com.hambrospecial.quizub.model.Quiz;
import com.hambrospecial.quizub.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class QuizController {

    private final QuizService quizService;

    @GetMapping("/quizzes")
    public String findAll(Model model){
        int numberOfQuizzesPerRound = 4;
        model.addAttribute("data", quizService.getQuizzesPerRound(numberOfQuizzesPerRound));
        return "quiz_page";
    }

    @PostMapping("/quiz")
    public String addQuiz(Quiz quiz){
        quizService.addQuiz(quiz);
        return "String";
    }

    @GetMapping("/addQuiz")
    public String getQuiz(){
        return "quiz_collector";
    }

}
