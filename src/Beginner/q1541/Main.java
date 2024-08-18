package Beginner.q1541;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int A,B,C;
        Scanner s = new Scanner(System.in);

        A = s.nextInt();
        while (A != 0) {
            B = s.nextInt();
            C = s.nextInt();

            int houseArea = A * B;
            double totalArea = (double) (houseArea * 100) / C;
            double landSide = Math.sqrt(totalArea);

            System.out.println((int) landSide);

            A = s.nextInt();
        }
    }
}
