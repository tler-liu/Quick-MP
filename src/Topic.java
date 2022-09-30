/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

/**
 *
 * @author tylerliu
 */
public class Topic {
    
    private String name;
    
    public Topic(String name) {
        
    }
    
    public Question getQuestion() {
        return null;
    }
    
    public Quiz getQuiz() {
        ArrayList<Question> questions = new ArrayList<Question>();
        for (int i = 0; i < 10; i++) {
            questions.add(getQuestion());
        }
        return new Quiz(questions);
    }
}
