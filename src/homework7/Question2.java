package homework7;
/*
2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the year :");
        int year = scr.nextInt();//read the input

        if ((year % 400  == 0) || (year % 4 == 0) && (year % 100 != 0)){
            System.out.println(year + "This is leap year");
        }
        else
        {
            System.out.println(year + " This is not leap year");
        }

        }
    }





