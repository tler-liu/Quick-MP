/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author tylerliu
 */
public class Quiz {
    
    private ArrayList<Question> questions = new ArrayList<Question>();
    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
    }
    
    public ArrayList<Question> getQuestions() {
        return questions;
    }
}
