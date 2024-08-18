package Beginner.q1005;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        double A, B, media;

        while (s.hasNext()) {
            A = s.nextFloat();
            B = s.nextFloat();
            media = (A * 3.5 + B * 7.5) / 11;
            System.out.println("MEDIA = " + String.format("%.5f", media));
        }
    }
}
