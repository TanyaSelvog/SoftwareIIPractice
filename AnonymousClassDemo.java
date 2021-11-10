// from 10.10 Anonymous Inner Classes
// This program demonstrates an anonymous inner class

import java.util.Scanner;

public class AnonymousClassDemo
{
    public static void main(String[] args){

        int num;

        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Create an object that implements IntCalculator
        IntCalculator square = new IntCalculator(){
            public int calculate(int number)
            {
                return number * number;
            }};

        // Get a number from user
        System.out.println("Enter an integer: ");
        num = keyboard.nextInt();

        // Display the square of the number
        System.out.println("The square is " + square.calculate(num));
    }
}

