package main_hilel;

public class task3 {
    public static void main(String[] args) {
        int a = 24;
        int b = 89;
        int c = 6;

        int g = Math.abs (a-b);
        System.out.println(g);

        int s = a+b;

        double h = Math.pow(s,3);
        System.out.println(h);

        double q = Math.sqrt(c);
        System.out.println(q);

        double j = (h - q);
        System.out.println(j);
        double y = g / j;
        System.out.println(y);
    }
}
