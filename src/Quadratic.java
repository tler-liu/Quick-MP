/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tylerliu
 */
import java.text.*;
import java.util.ArrayList;
import java.util.Random;

public class Quadratic extends Topic {
    
    public Quadratic(String name) {
        super(name);
    }
    // topic 1 - quadratic formula
    // topic 2 - factoring 

    public static int[] getQuadraticNums() {
        int a = (int) (Math.random() * 2) + 1; 
        int b = (int)(Math.random() * 5) + 1;
        int c = (int)(Math.random() * 25) + 1; 
        double determinant = b * b - 4 * a * c;
        while (determinant <= 0) {
            a = (int) (Math.random() * 2) + 1; 
            b = (int) (Math.random() * 5) + 1;
            c = (int) (Math.random() * 25) + 1; 
            determinant = b * b - 4 * a * c;
        }
        int nums[] = {a, b, c};
        return nums;
    }

    public static String makeQuadratic(int[] a) {
        String equation = "";
        if (a[0] > 1) {
            equation += a[0] + "x^2 + ";
        }
        else { 
            equation += "x^2 + ";
        }
        equation += a[1] + "x + " + a[2];
        
        return equation;
    } 

    public static String getQuadraticAnswer(int[] x) {
        // v1 = value 1, v2 = value2...
        int a = x[0];
        int b = x[1];
        int c = x[2];
        double determinant = (b * b) - 4 * a * c;
        double temp = 0;

        double x1, x2;
        String answer = "";

        // System.out.println(a + "..." + b + "..." + c + "..." + determinant);
        
        if (determinant > 0) {
            x1 = (-b + Math.sqrt(determinant)) / (2 * a);
            x2 = (-b - Math.sqrt(determinant)) / (2 * a);
            if (x2 < x1) {
                temp = x1;
                x1 = x2;
                x2 = temp;
            }
            String ans1 = new DecimalFormat("#.##").format(x1);
            String ans2 = new DecimalFormat("#.##").format(x2);
            answer += ans1 + ", " + ans2;
            // System.out.println(answer);
            return answer;

        }
        else if (determinant == 0) {
            x1 = x2 = -b / (2 * a);
            String ans1 = new DecimalFormat("#.##").format(x1);
            String ans2 = new DecimalFormat("#.##").format(x2);
            answer += ans1 + ", " + ans2;
            // System.out.println(answer);
            return answer;
        }
        else
            return "error";
    }

    public static String getFactorsAnswer(int[] x) {
        int a = x[0];
        int b = x[1];
        int c = x[2];
        double determinant = b * b - 4 * a * c;
        double temp = 0;

        double x1, x2;
        String answer; 
        if (a > 1) {
            answer = a + "";
        }
        else
            answer = "";

        // System.out.println(a + "..." + b + "..." + c + "..." + determinant);
        
        if (determinant > 0) {
            x1 = (-b + Math.sqrt(determinant)) / (2 * a);
            x2 = (-b - Math.sqrt(determinant)) / (2 * a);
            
            // putting smaller number first 
            if (x2 < x1) {
                temp = x1;
                x1 = x2;
                x2 = temp;
            }
            double ans1 = Double.parseDouble(String.format("%.2f", x1));
            double ans2 = Double.parseDouble(String.format("%.2f", x2));

            if (ans1 < 0 && ans2 < 0) {
                answer += "(x + " + -ans1 + ")(x + " + -ans2 + ")";
            }
            else if (ans1 > 0 && ans2 < 0) {
                answer += "(x - " + ans1 + ")(x + " + -ans2 + ")";
            }
            else if (ans1 < 0 && ans2 > 0) {
                answer += "(x + " + -ans1 + ")(x - " + ans2 + ")";
            }
            else
                answer += "(x - " + ans1 + ")(x - " + ans2 + ")";
            System.out.println(answer);
            return answer;

        }
        else if (determinant == 0) {
            x1 = x2 = -b / (2 * a);
            String ans1 = new DecimalFormat("#.##").format(x1);
            String ans2 = new DecimalFormat("#.##").format(x2);
            if (x1 < 0) {
            answer += "(x + " + ans1 + ")(x + " + ans2 + ")";
            }
            else if (x1 > 0) {
                answer += "(x - " + ans1 + ")(x - " + ans2 + ")";
            }
            System.out.println(answer);
            return answer;
        }
        else
            return "error";
        
    }

    public static ArrayList<String> quadraticSteps(int[] nums) {
        ArrayList<String> steps = new ArrayList<>();

        steps.add("Step 1: Notice the values of a, b, and c within the equation.");
        steps.add("Step 2: The values a, b, and c typically correspond the x^2, x, and the constant respectively within a quadratic equation.");
        steps.add("Step 3: After noting the values of a, b, and c, just use the quadratic formula to find the values of x.");
        steps.add("Step 4: The quadratic formula is (-b +/- sqrt(b^2 - 4ac)) / 2");
        steps.add("Step 5: In the case of this specific problem, a is equal to " + nums[0] + " b is equal to " + nums[1] + " and c is equal to " + nums[2]);
        steps.add("Step 6: Once you have the equation, just use a calculator, and be sure to solve for both plus and minus equations.");
        steps.add("Step 7: After plugging in all of the numbers, your answers should come out to " + getQuadraticAnswer(nums));

        return steps;
    }

    public static ArrayList<String> factorSteps(int[] nums) {
        ArrayList<String> steps = new ArrayList<>();

        steps.add("Step 1: Notice the values of a, b, and c within the equation.");
        steps.add("Step 2: The values a, b, and c typically correspond the x^2, x, and the constant respectively within a quadratic equation.");
        steps.add("Step 3: After noting the values of a, b, and c, just use the quadratic formula to find the values of x.");
        steps.add("Step 4: The quadratic formula is (-b +/- sqrt(b^2 - 4ac)) / 2");
        steps.add("Step 5: In the case of this specific problem, a is equal to " + nums[0] + " b is equal to " + nums[1] + " and c is equal to " + nums[2]);
        steps.add("Step 6: Once you have the equation, just use a calculator, and be sure to solve for both plus and minus equations.");
        steps.add("Step 7: After plugging in all of the numbers, your answers should come out to " + getFactorsAnswer(nums));
        steps.add("Step 8: When putting the answer into the correct form, be sure to note when a number is negative, as it will change the final answer");

        return steps;
    }

    @Override
    public Question getQuestion() {
        String equation = "";
        Topic topic = this;
        Random num = new Random();
        int type = num.nextInt(2) + 1;
        // type 1 - quadratics
        // type 2 - factors
        if (type == 1) {
            int[] nums = getQuadraticNums();
            equation = "Please find the values of x to the following equation: " + makeQuadratic(nums) + 
                        "\nPlease round the answer to the nearest hundredth place. " + 
                        "Respond in the form x1, x2 with the smaller number first";
            String answer = getQuadraticAnswer(nums);
            return new Question(equation, type, answer, topic, quadraticSteps(nums));
        }
        else if (type == 2) {
            int[] nums = getQuadraticNums();
            equation = "Please find the factors of the following equation: " + makeQuadratic(nums) +
                       "\nPlease find the factors in the format of (ax + b)(ax + b), with the bigger numbers first" 
                       + "\nNote the spaces, and round to the nearest hundredth, or tenth if the second decimal is 0.";
            String answer = getFactorsAnswer(nums);
            return new Question(equation, type, answer, topic, factorSteps(nums));
        }
        // System.out.println(type);
        return null;
    }

    // testing file
    //  public static void main(String[] args) {
    //     int[] nums = {1, -5, 3};
    
    // }

}
