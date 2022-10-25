package lesson12;

public class Triangle {
    public static void main(String[] args) {
        sqrt(3, 4, 5);
        System.out.println(sqrt(3,4, 5));
    }

    public static double sqrt(double a, double b, double c) {

        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }
}
