package com.hambrospecial.quizub.model;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String question;
    private String answer;
    private HashSet<String> options;

    public Quiz(String question, String answer, HashSet<String> options) {
        this.question = question;
        this.answer = answer;
        this.options = options;
    }

}


