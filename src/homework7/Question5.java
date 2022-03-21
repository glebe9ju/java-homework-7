package homework7;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String eName = scr.nextLine();
        System.out.print("Enter Employee ID :");
        int eID=scr.nextInt();
        System.out.print("Enter Basic Salary :");
        int eSalary=scr.nextInt();
        double gross=eSalary+(eSalary*0.1)+(eSalary*0.08)+(eSalary*0.09)-(eSalary*0.2);

        System.out.println("|--------------------------------------|");
        System.out.println("|            Salary Slip               |");
        System.out.println("|--------------------------------------|");
        System.out.println("| Employee ID            :"+eID+"            |");
        System.out.println("| Employee Name          :"+eName+"        |" );
        System.out.println("|--------------------------------------|");
        System.out.println("| Basic Salary           :"+eSalary+"           |");
        System.out.println("| HR 10%                 :"+(eSalary*0.1)+"          |  ");
        System.out.println("| TA   8%                :"+(eSalary*0.08)+"         |");
        System.out.println("| DA  9%                 :"+(eSalary*0.09)+"        |");
        System.out.println("| PF                     :"+(-eSalary*0.2)+"        |");
        System.out.println("|--------------------------------------|");
        System.out.println("| Gross Salary            :"+gross+"       |");
        System.out.println("|--------------------------------------|");




    }



}
