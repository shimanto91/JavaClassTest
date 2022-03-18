package ClassTestAnswer;

public class TestRep4 {
    public static void main(String[] args) {
        int max = 100;

        System.out.println("Expected Numbers Divisible by 3:");
        for (int i= 1; i<=max; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Expected Numbers Divisible by 5:");
        for (int i= 1; i<=max; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Expected Numbers Divisible by 3&5:");
        for (int i= 1; i<=max; i++) {
            if (i % 3 == 0 &&  i%5 == 0) {
                System.out.println(i);
            }
        }
    }
}
