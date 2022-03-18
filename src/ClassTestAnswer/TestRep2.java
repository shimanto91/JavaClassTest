package ClassTestAnswer;

public class TestRep2 {
    public static void main(String[] args) {

        float x = 25.5f;
        float y = 3.5f;
        float z = 40.5f;
        float w = 4.5f;

        float r1 = x - y;
        float r2 = y * y;
        float r3 = z - w;

        float res1 = r1 - r2;

        double res = res1 / r3;

        System.out.println("Result is: " + res);
    }
}
