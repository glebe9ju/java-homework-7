package homework7;
/*
7. Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter Seller's Name : ");
        String sName = scr.nextLine();
        System.out.print("Enter Sales ID : ");
        int sID = scr.nextInt();
        System.out.print("Enter Sales Amount : ");
        int sales = scr.nextInt();
        System.out.print("Enter Basic Salary : ");
        int salary = scr.nextInt();
        double comm;

        if (sales >= 50000) {
            System.out.println("Sales Commissions " + (salary * 0.35));
        } else if (sales >= 30000 && sales < 50000) {
            System.out.println("Sales Commission = " + (salary * 0.2));
        } else if (sales >= 20000 && sales < 30000) {
            System.out.println("Sales Commission = " + (salary * 0.10));
        } else if (sales >= 10000 && sales < 20000) {
            System.out.println("Sales Commission = " + (salary * 0.05));
        }else{
            System.out.println("Sales Commission " + (salary * 0.02));
        }


    }
}
