package ClassTestAnswer;

import java.util.Scanner;

public class TestRep1 {
    public static void main(String[] args) {
            int x;
            int y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        x = sc.nextInt();
        System.out.println("Enter second number: ");
        y = sc.nextInt();

        System.out.println("Product is: " + x*y);
    }
}
