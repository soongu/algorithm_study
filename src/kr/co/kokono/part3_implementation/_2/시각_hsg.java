package kr.co.kokono.part3_implementation._2;

import java.util.Scanner;

public class 시각_hsg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 N: ");
        int N = sc.nextInt();

        int count = 0;
        for (int hour = 0; hour <= N; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {
                    if (check(hour, minute, second)) count++;
                }
            }
        }
        System.out.println(count);

    }

    private static boolean check(int hour, int minute, int second) {
        return hour % 10 == 3 || minute / 10 == 3 || minute % 10 == 3 || second % 10 == 3 || second / 10 == 3;
    }
}
