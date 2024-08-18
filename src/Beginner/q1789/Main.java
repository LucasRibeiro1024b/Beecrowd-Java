package Beginner.q1789;

import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()){
            int numberOfSlugs = s.nextInt();
            int[] slugSpeeds = new int[numberOfSlugs];
            for (int i = 0; i < numberOfSlugs; i++) {
                slugSpeeds[i] = s.nextInt();
            }

            int fastestSlugLevel = speedLevel(slugSpeeds[0]);
            for (int i = 0; i < numberOfSlugs; i++) {
                int sl = speedLevel(slugSpeeds[i]);
                if (sl > fastestSlugLevel) {
                    fastestSlugLevel = sl;
                }
            }

            System.out.println(fastestSlugLevel);
        }
    }

    public static int speedLevel(int speed){
        int speedLevel;
        if (speed < 10) {
            speedLevel = 1;
        } else if (speed < 20) {
            speedLevel = 2;
        }
        else {
            speedLevel = 3;
        }

        return speedLevel;
    }
}
