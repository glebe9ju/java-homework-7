package homework7;
/*
3. Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Input name : ");// Enter Hetal
        String name = obj.next();//Input the name of the student
        System.out.print("Input roll number :");// Enter single digit
        int roll = obj.nextInt();//Input the roll number of the student
        System.out.print("Input Marks for Maths : ");//Enter even number
        double Maths = obj.nextDouble();//Input the subject results
        if (Maths > 100 || Maths < 0) {//Error handling
            System.out.println("Invalid Input, Marks should be between 0 and 100");

        }
        // Science
        System.out.print("Input Marks for Science :");//Enter even digit
        double Science = obj.nextDouble();
        //Error Handling
        if (Science > 100 || Science < 0) {
            System.out.println("Invalid Input, Marks should be between 0 and 100");

        }

        //English
        System.out.print("Marks for English :");
        Double English = obj.nextDouble();
        //Error Handling
        if (English > 100 || English < 0) {
            System.out.println("Invalid Input, Marks should be between 0 and 100");
        }
        double total = Maths + Science + English;

        double percentage = total / 3;

        //Grading
        String Result = "0";
        if (percentage >= 35) {
            Result = "pass";
        } else {
            Result = "fail";
        }
        //Grade
        String Grade = "0";
        if (percentage >= 80) {
            Grade = "A + ";
        } else if (percentage >= 60) {
            Grade = "A";

        } else if (percentage >= 50) {
            Grade = "B";
        } else if (percentage >= 35) {
            Grade = "C";
        }
        //Dsplay the data
        System.out.println("|-----------Mark Sheet------------------|");
        System.out.println("|---------------------------------------|");
        System.out.println("|    Name        :   " + name +"              |");
        System.out.println("|    Roll No     :   " + roll +"                  |");
        System.out.println("|---------------------------------------|");
        System.out.println("|    Subjects    :        Marks         |");
        System.out.println("|---------------------------------------|");
        System.out.println("|    Maths       :   " + Maths +"               |");
        System.out.println("|    Science     :   " + Science +"               |");
        System.out.println("|    English     :   " + English +"               |");
        System.out.println("|---------------------------------------|");
        System.out.println("|    Total       :   " +  total +"              |");
        System.out.println("|---------------------------------------|");
        System.out.println("|  Percentage    :   " + percentage +"               |");
        System.out.println("|  Resutl        :   " +  Result +"               |");
        System.out.println("|  Grade         :   " + Grade  +"                  |");
        System.out.println("|---------------------------------------|");

    }


}
