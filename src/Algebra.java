/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tylerliu
 */
public class Algebra extends Topic {
    
    public Algebra(String name) {
        super(name);
    }
    
    /**
     * 1 = quadratic, type 1
     * 2 = quadratic, type 2
     * 3 = linear, type 1
     * 4 = linear, type 2
     * 
     * @return 
     */
    public Question getQuestion() {
        int rand = ((int) (Math.random() * 4)) + 1;
        Quadratic quad = new Quadratic("Quadratic");
        Linear lin = new Linear("Linear");
        Question q = null;
        if (rand == 1) {
             q = quad.getQuestion(1);
             //q.setTopic(this);
        }
        else if (rand == 2) {
            q = quad.getQuestion(2);
            //q.setTopic(this);
        }
        else if (rand == 3) {
            q = lin.getQuestion(1);
            //q.setTopic(this);
        }
        else {
            q = lin.getQuestion(2);
            //q.setTopic(this);
        }
        return q;
    }
    
    public Question getQuestion(int rand) {
        Quadratic quad = new Quadratic("Quadratic");
        Linear lin = new Linear("Linear");
        Question q = null;
        if (rand == 1) {
             q = quad.getQuestion(1);
             //q.setTopic(this);
        }
        else if (rand == 2) {
            q = quad.getQuestion(2);
            //q.setTopic(this);
        }
        else if (rand == 3) {
            q = lin.getQuestion(1);
            //q.setTopic(this);
        }
        else {
            q = lin.getQuestion(2);
            //q.setTopic(this);
        }
        return q;
    }
}
