/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tylerliu
 */
public class PythagoreanTheorem extends Topic {
    public PythagoreanTheorem(String name) {
        super(name);
    }
    
    

    @Override
    public Question getQuestion() {
        return new Question("question", 1, "answer", this, null);
    }
    
    @Override
    public Question getQuestion(int type) {
        return new Question("question", type, "answer", this, null);
    }
}
