/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author tylerliu
 */
public class Question {
    private String question;
    private int typeQuestion;
    private Topic topic;
    private String answer;
    private ArrayList<String> solution;
    
    public Question(String q, int t, String ans, Topic top, ArrayList<String> sol) {
        question = q;
        typeQuestion = t;
        topic = top;
        answer = ans;
        solution = sol;
    }
    
    public String getQuestionText() {
        return question;
    }
    
    public int getQuestionType() {
        return typeQuestion;
    }
    
    public Topic getQuestionTopic() {
        return topic;
    }
    
    public String getQuestionAnswer() {
        return answer;
    }
    
    public ArrayList<String> getSolution() {
        return solution;
    }
}
