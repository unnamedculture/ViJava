package main_hilel;

public class lesson3types {
    public static void main(String[] args) {

        double a = 1.0;
        double b = 0.5;
        double c = 0.2;

        double z = (double) 4 / 3;
        double n = z * Math.PI * Math.pow(a, 3);
        double v = z * Math.PI * Math.pow(b, 3);
        double x = z * Math.PI * Math.pow(c, 3);
        double q = n + v + x;


        System.out.println(q);
    }
}
