/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

/**
 *
 * @author tylerliu
 */
public abstract class Topic {
    
    private String name;
    
    public Topic(String name) {
        this.name = name;
    }
    
    public abstract Question getQuestion();
    public abstract Question getQuestion(int type);
    
    public Quiz getQuiz() {
        ArrayList<Question> questions = new ArrayList<Question>();
        for (int i = 0; i < 5; i++) {
            questions.add(getQuestion());
        }
        return new Quiz(questions);
    }
    
    public Quiz getQuiz(int type) {
        ArrayList<Question> questions = new ArrayList<Question>();
        for (int i = 0; i < 5; i++) {
            questions.add(getQuestion(type));
        }
        return new Quiz(questions);
    }
    
    public String getName() {
        return name;
    }
}
