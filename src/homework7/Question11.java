package homework7;
/*
11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.
 */

public class Question11 {
    public static void main(String[] args) {
        System.out.println("Number divided by 3 are : ");
        for (int i = 0; i <= 100; i++)
        {
            if (i % 3 == 0)
            {
                System.out.print(i + "\t");
            }
        }
        System.out.println("\nNumber divide by 5 are : ");
        for (int j = 0; j <= 100; j++)
        {
            if (j % 5 == 0)
            {
                System.out.print(j + "\t");
            }

        }
    }

}
