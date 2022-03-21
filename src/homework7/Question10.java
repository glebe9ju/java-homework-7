package homework7;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

/*
10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
 */
public class Question10 {

    public static void main(String[] args) {
        char ch;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = scr.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = scr.nextInt();

        System.out.print("Enter the symbol you want +, - , /, * ");
        ch = scr.next().charAt(0);

        if (ch == '+') {
            System.out.println("Addition of " + num1 + " + " + num2 + "=" + (num1 + num2));
        } else if (ch == '-') {
            System.out.println("Subtraction of " + num1 + " - " + num2 + "=" + (num1 - num2));
        } else if (ch == '*') {
            System.out.println("Multiplication of " + num1 + " * " + num2 + "=" + (num1 * num2));
        } else if (ch == '/') {
            System.out.println("Divison of " + num1 + " / " + num2 + " = " + (num1 / num2));
        }

    }

}
