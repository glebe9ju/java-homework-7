package homework7;
/*
8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        char ch;
        System.out.print("Enter the alphabet between A to F : ");
        ch = scr.next().charAt(0);

        //String city = x ;
        if (ch == 'A') {
            System.out.print("A = Ahmedabad");
        } else if (ch == 'B') {
            System.out.print("B = Baroda");
        } else if (ch == 'C') {
            System.out.print("C = Chennai");
        } else if (ch == 'D') {
            System.out.print("D = Delhi");
        } else if (ch == 'E') {
            System.out.print("E = Ellora");
        } else if (ch == 'F') {
            System.out.print("F = Fatehpur");
        } else {
            System.out.print("Invalid Alphabet");
        }

    }
}
