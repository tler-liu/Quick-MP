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
    @Override
    public Question getQuestion(int r) {
       Question s = null;
        if (r == 1) {
            s = LinSlope();
        }
        if (r == 2) {
            s = LinIntersect();
        }
        
        return s;
       
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
    ArrayList<String> sol = solSlope(a, b, c);
    return new Question(q, type, ans, topic, sol);
    }
    public static Question LinIntersect() {
        int a = 1 + (int) (Math.random() * 10);
        int b = 1 + (int) (Math.random() * 10);
        int c = 1 + (int) (Math.random() * 10);
        int d = 1 + (int) (Math.random() * 10);
        int e = 1 + (int) (Math.random() * 10);
        int f = 1 + (int) (Math.random() * 10);
        String q = "Please find the intersection between the lines " + a + "x " + "+ " + b + "y " + "= " + c + " and "  + d + "x " + "+ " + e + "y " + "= " + f + ". If there is not only 1 intersection, write all or none";
        int type = 2;
        String ans;
        Topic topic = new Linear("Linear");
        if ((float) a/b == (float) d/e) {
            if ((float) f/e == (float) c/b) {
               ans = "all"; 
            }
            else {
                ans = "none";
            }
        }
        else {
            double x = (double) ( ((float)f/e) - ((float)c/b) ) / ( ((float)d/e) - ((float)a/b) );
            double y = (double) ((-1) * ((float)a/b) * x) + ((float)c/b);
            ans = "(" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ")";
        }
        
        ArrayList<String> sol = solIntersect(a, b, c, d, e, f);
        return new Question(q, type, ans, topic, sol);
      }
    public static ArrayList<String> solSlope(int a, int b, int c) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("The given equation is in standard form. We will need to convert it to slope-intercept form (y = mx + b).");
        arr.add("To isolate y, we will move the x term to the right side and flip the sign");
        arr.add(b + "y = -" + a + "x + " + c);
        if (a < 0) {
          arr.add("Cancel the minus sign");
          arr.add(b + "y = " + (double) (-1)*a + "x + " + (double) c);
        }
        arr.add("Divide both sides of the equation by y's coefficient " + b);
        arr.add("y = -" + (double) ((-1)*a)/b + "x + " + (double) c/b);
          arr.add("The coefficient of x is the slope of the equation: " + (double) ((-1)*a)/b);
          return arr;
      }
    public static ArrayList<String> solIntersect(int a, int b, int c, int d, int e, int f) {
        ArrayList<String> arr = new ArrayList<String>();
        if ((float) a/b == (float) d/e) {
            arr.add("Notice that the slopes of the 2 lines are the same.");
            arr.add("y = " + (float) ((-1)*a)/b + "x + " + (float) c/b + "         " + "y = " + (float) ((-1)*d)/e + "x + " + (float) f/e);
            if ((float) f/e == (float) c/b) {
               arr.add("The y-intercepts of these lines are the same as well. This means that they are the same line");
               arr.add("The intersection of these lines is all real numbers.");
            }
            else {
                arr.add("The y-intercepts of these lines are different. This means they will never intersect");
                
            }
        }
        else {
        
            arr.add("First, we isolate variable y in both equations.");
            arr.add("y = " + (float) ((-1)*a)/b + "x + " + (float) c/b + "         " + "y = " + (float) ((-1)*d)/e + "x + " + (float) f/e);
            arr.add("Since y is equal to the RHS od both equations, we can set them equal to each other.");
            arr.add((float) (-1)*a/b + "x + " + (float) c/b + " = " + (float) (-1)*d/e + "x + " + (float) f/e);
            arr.add("We can now isolate x by moving all of its terms to one side and dividing.");
            arr.add("(" + (float) ((float)(d/e) - (float)(a/b)) + ")x = " +  (float) ((float)(f/e) - (float)(c/b)));
            double x = (double) ( ((float)f/e) - ((float)c/b) ) / ( ((float)d/e) - ((float)a/b) );
            arr.add("x = " + String.format("%.2f", x));
            arr.add("Then, we can plug x back into either equation to solve for y.");
            double y = (double) ((-1) * ((float)a/b) * x) + ((float)c/b);
            arr.add("y = " + String.format("%.2f", y));
            arr.add("The intersection between the lines is (" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ")");
            
        }
        return arr;
    }
}
          
        
      


