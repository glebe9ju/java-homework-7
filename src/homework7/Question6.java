package homework7;
/*
6. Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);//created scanner class object
        System.out.print("Enter the Number : ");
        int a = scr.nextInt();
        if (a % 2 == 0) {// if remainder is zero than even otherwise odd number
            System.out.println(a + " is an even number. ");
        } else {
            System.out.println(a + " is an odd number");
        }
    }

}
