package homework7;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);//object of scanner class
        System.out.print("Enter Year : ");
        int year = scr.nextInt();//reads year entered by user in console
        System.out.println("Leap Year : " + isLeapYear(year));
        System.out.print("Enter Month : ");
        int m = scr.nextInt();//reads month entered by user in console
        getDaysInMonth(m, year);//no.of days in specific month & year entered by user

    }

    public static void getDaysInMonth(int month, int year) {
        boolean b;
        b = isLeapYear(year);

        switch (month) {
            case 1:
                System.out.println("31 days in January");
                break;
            case 2:
                if (b) {
                    System.out.println("29 days in February ");
                } else {
                    System.out.println("28 days in February");
                }
                break;
            case 3:
                System.out.println("31 days in March");
                break;
            case 4:
                System.out.println("30 days in April");
                break;
            case 5:
                System.out.println("31 days in May");
                break;
            case 6:
                System.out.println("30 days in June");
                break;
            case 7:
                System.out.println("31 days in July");
                break;
            case 8:
                System.out.println("31 days in August");
                break;
            case 9:
                System.out.println("30 days in September");
                break;
            case 10:
                System.out.println("31 days in October");
                break;
            case 11:
                System.out.println("30 days on November");
                break;
            case 12:
                System.out.println("31 days in December");
            default:
                System.out.println("-1");

        }
    }

    public static boolean isLeapYear(int year) {
        boolean leap;
        if (year <= 1 || year >= 9999) {//defines range of user input
            return false;
        } else {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {//if year is divided by 4 or not
                return true;
            }
            return false;
        }
    }


}