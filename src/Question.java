/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tylerliu
 */
public class Question {
    private String question;
    private int typeQuestion;
    private Topic topic;
    
    public Question(String q, int t, Topic top) {
        question = q;
        typeQuestion = t;
        topic = top;
    }
    
    public String getQuestionText() {
        return question;
    }
    
    public int getTypeQuestion() {
        return typeQuestion;
    }
    
    public Topic getTopic() {
        return topic;
    }
}
