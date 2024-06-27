import javax.lang.model.util.ElementScanner14;

public class ifelse {
    public static void main(String[] args) {
        // int age = 91;
        // if (age >= 18) {
        // System.out.println("You are an adult");
        // } else {
        // System.out.println("You are kid or teenager");
        // }
        // int marks = 91;
        // if (marks >= 0 && marks < 60) {
        // System.out.println("Average Student");
        // } else if (marks >= 60 && marks <= 80) {
        // System.out.println("Good Student");
        // } else {
        // System.out.println("Topper Student");
        // }
        int marks;
        marks = 95;
        if (marks >= 0 && marks <= 33) {
            System.out.println("Failed Student");
        } else if (marks > 33 && marks < 60) {
            if (marks > 33 && marks <= 40) {
                System.out.println("Just Passed Student");
            } else if (marks > 40 && marks <= 55) {
                System.out.println("Passed Student");
            } else {
                System.out.println("Third Class Passed Student");
            }
        } else if (marks > 60 && marks <= 80) {
            if (marks >= 60 && marks <= 70) {
                System.out.println("Second Class Passed Student");
            } else {
                System.out.println("First Class Passed Student");
            }
        } else if (marks > 80 && marks <= 95) {
            if (marks > 80 && marks < 90) {
                System.out.println("Bright Student");
            } else {
                System.out.println("Intelligent Student");
            }
        } else if (marks > 95 && marks <= 100) {
            if (marks > 95 && marks <= 99) {
                System.out.println("Amazing and Topper Student");
            } else {
                System.out.println("Jilla Top lagelu / Jilla Topper");
            }
        } else {
            System.out.println("Invalid Input");
        }

    }
}
