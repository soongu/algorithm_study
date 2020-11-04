package kr.co.kokono.part3_implementation._1;

import java.util.Scanner;

public class 상하좌우_hsg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("공간의 크기 입력: ");
        int N = sc.nextInt();
        sc.nextLine();

        //좌표 배열 생성
        int[][] map = createMap(N);

        System.out.print("이동 방향 입력: ");
        String[] directions = sc.nextLine().split(" ");

        long s = System.currentTimeMillis();

        //최종 위치 계산
        int[] finalIndexes = calculateFinishPositionNumber(directions, N);
        String temp = String.valueOf(map[finalIndexes[0]][finalIndexes[1]]);
        //최종 출력 데이터
        String finalData = String.format("(%s, %s)", temp.charAt(0), temp.charAt(1));
        System.out.println("최종 위치: " + finalData);

        long e = System.currentTimeMillis();
        long performedSecond = e - s;
        System.out.println("실행 시간: " + performedSecond + "ms");

    }

    private static int[] calculateFinishPositionNumber(String[] directions, int N) {
        int x = 0, y = 0;
        for (String direction : directions) {
            switch (direction.toUpperCase()) {
                case "U":
                    if (x > 0) x--;
                    break;
                case "D":
                    if (x < N - 1) x++;
                    break;
                case "R":
                    if (y < N - 1) y++;
                    break;
                case "L":
                    if (y > 0) y--;
                    break;
            }
        }
        return new int[] {x, y};
    }

    private static int[][] createMap(int n) {
        int x = 10, y = 1;
        int[][] map = new int[n][n];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = x + y++;
            }
            y = 1;
            x += 10;
        }
        return map;
    }
}
