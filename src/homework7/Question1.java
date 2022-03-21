package homework7;
/*
1. Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
 */


import java.util.Scanner;

public class Question1 {


        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            System.out.print("Please enter a number :");
            int num = scr.nextInt();

            if(num % 2 == 0)
                System.out.println(num + "is even");
            else
                System.out.println(num + " is odd");

        }
    }

