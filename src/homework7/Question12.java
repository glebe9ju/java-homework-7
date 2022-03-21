package homework7;
/*
12. Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter any Character : ");
        char ch = scr.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'z')) {
            System.out.println(ch + " is an Alphabet. ");
        } else if((ch>='0' && ch<='9')){
            System.out.println(ch + " is a Number." );
                    }else{
            System.out.println(ch + " is a Symol." );
        }
    }


}
