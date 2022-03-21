package homework7;
/*
9. Same as above program-8 using switch statement.
 */

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter any Alphabet : ");

        char city = scr.next().charAt(0);

        switch (city){
            case 'a':
                System.out.println("Ahmedabad");
                break;
            case 'b':
                System.out.println("Baroda");
                break;
            case 'c':
                System.out.println("Chennai");
                break;
            case 'd':
                    System.out.println("Delhi");
                    break;
            case 'e':
                System.out.println("Ellora");
                break;
            case 'f':
                System.out.println("Fatehpur");
                break;
            default:
                System.out.println("Invalid Entry");


        }
    }
}
