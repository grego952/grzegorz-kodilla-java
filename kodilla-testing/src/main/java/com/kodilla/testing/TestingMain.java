package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        Calculator calculator = new Calculator();
        int addResult = calculator.add(6,2);
        if (addResult == 8) {
            System.out.println("Add Test OK");
        } else {
            System.out.println ("Error");
        }
        int subtractResult = calculator.subtract(5,4);
        if (subtractResult == 1) {
            System.out.println("Subtract test Ok");
        } else {
            System.out.println("Error");
        }
    }
}