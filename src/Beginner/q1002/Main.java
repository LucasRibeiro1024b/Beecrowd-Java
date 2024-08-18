package Beginner.q1002;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        double r = s.nextDouble();
        double A = areaOfCircumference(r);
        System.out.println("A=" + String.format("%.4f",A));
    }

    public static double areaOfCircumference(double ratio){
        return ratio * ratio * 3.14159;
    }
}
