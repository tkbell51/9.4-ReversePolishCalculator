package com.company;
import java.util.Stack;

/**
 * Created by TKB on 7/20/17.
 */
public class ReversePolishCalc {

    // You'll need a variable here to keep track of the top of the stack
    private Stack<Double> top = new Stack();
    // The array of the input string split up
    private String[] tokens;

    // The stack
//    private String[] stack;

    public double calculate(String input) {

        // 1. Use the String split method to split the string into tokens at the commas
        tokens = input.split(",");

        // 2. Allocate a stack as big as the number of tokens
//        stack = new Stack(tokens.length);

        // 3. write the algorithm
        for(String token: tokens) {
        switch(token){
            case "+":
                System.out.println("Operation Addition!");
                top.push(top.pop() + top.pop());
                break;

            case "-":
                    System.out.println("Operation Subtraction");
                    top.push(-top.pop() + top.pop());
                    break;

            case "*":
                System.out.println("Operation Multiplication");
                top.push(top.pop()*top.pop());
                break;

            case "/":
                System.out.println("Operation Division");
                double divisor = top.pop();
                top.push(top.pop()/divisor);
                break;
            default:
                double dToken = Double.parseDouble(token);
                top.push(dToken);
                break;
        }
            // calls to push() and pop() and do the math here

        }
        System.out.println("The result is: " + top.peek());
        // 4. return the result
        return top.peek();
    }

//    private void push(String number) {
//        // push on the stack
//    }
//
//    private void push(double d) {
//        // change the double to a string and then push it on the stack
//    }
//
//    private double pop() {
//        // remove the string from the top of the stack and convert it to a double and return it
//    }
}
