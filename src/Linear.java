/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author tylerliu
 */
public class Linear extends Topic {
    
    public Linear(String name) {
        super(name);
    }
    
    @Override
    public Question getQuestion() {
        int r = 1 + (int) (Math.random() * 2);
        Question s = null;
        System.out.println(r);
        if (r == 1) {
          s = LinSlope();
        }
        else if (r == 2) {
          s = LinIntersect();
        }
        return(s);
  }
    public static Question LinSlope() {
    int a = 1 + (int) (Math.random() * 10);
    int b = 1 + (int) (Math.random() * 10);
    int c = 1 + (int) (Math.random() * 10);
    String ans = null;
    int gcf = 0;
    String q = "Please find the slope of "  + a + "x " + "+ " + b + "y " + "= " + c + ".";
    if ( a % b == 0) {
      ans = "-" + (a/b);
    }
    else {
      ArrayList<Integer> divis = new ArrayList<Integer>();
      for (int i = 1; i <= 10; i++) {
        if ((a % i == 0) && (b % i == 0)) {
          divis.add(i);
          gcf = divis.get(divis.size() - 1);
        }
      }
      a = a/gcf;
      b = b/gcf;
      ans = "-" + a + "/" + b;
    }
    int type = 1;
    Topic topic = new Linear("Linear");
    return new Question(q, type, ans, topic);
    }
    public static Question LinIntersect() {
        int a = 1 + (int) (Math.random() * 10);
        int b = 1 + (int) (Math.random() * 10);
        int c = 1 + (int) (Math.random() * 10);
        int d = 1 + (int) (Math.random() * 10);
        int e = 1 + (int) (Math.random() * 10);
        int f = 1 + (int) (Math.random() * 10);
        String q = "Please find the intersection between the lines " + a + "x " + "+ " + b + "y " + "= " + c + " and "  + d + "x " + "+ " + e + "y " + "= " + f + ".";
        int type = 2;
        Topic topic = new Linear("Linear");
        double x = (double) ( ((float)f/e) - ((float)c/d) ) / ( ((float)d/e) - ((float)a/b) );
        double y = (double) ((-1) * ((float)a/b) * x) + ((float)c/b);
        String ans = "(" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ")";
        return new Question(q, type, ans, topic);
      }
}
