package kr.co.kokono.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 숫자_카드게임_hsg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> nm = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int n = nm.get(0);
        int m = nm.get(1);

        int result = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> data = Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            if (data.size() > m) {
                System.out.println("입력 값 초과!");
                return;
            }

            //리스트에서 최소값 구하기
            int minVal = data.stream().min(Integer::compareTo).get();
            //System.out.println("minVal = " + minVal);

            result = Math.max(result, minVal);
        }
        System.out.println("result = " + result);

    }
}
