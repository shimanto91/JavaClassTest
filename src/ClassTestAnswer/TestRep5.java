package ClassTestAnswer;

import java.util.Scanner;

public class TestRep5 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        x = sc.nextInt();

        if (x < 33 && x >=0) {
            System.out.println("Grade is: F");
        } else if (x >= 33 && x < 40) {
            System.out.println("Grade is: D");
        } else if (x >= 40 && x < 50) {
            System.out.println("Grade is: C");
        } else if (x >= 50 && x < 60) {
            System.out.println("Grade is: B");
        } else if (x >= 60 && x < 70) {
            System.out.println("Grade is: A-");
        } else if (x >= 70 && x < 80) {
            System.out.println("Grade is: A");
        } else if (x >= 80 && x < 101) {
            System.out.println("Grade is: A+");
        } else {
                System.out.println("Invalid Input");
        }
    }
}
