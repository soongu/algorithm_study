package kr.co.kokono.greedy;

import java.util.*;
import java.util.stream.Collectors;

public class 큰수의_법칙_book {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        String[] nmk = sc.nextLine().split(" ");
        int n = Integer.parseInt(nmk[0].trim());
        int m = Integer.parseInt(nmk[1].trim());
        int k = Integer.parseInt(nmk[2].trim());

        String[] datas = sc.nextLine().split(" ");
        if (datas.length > n) {
            System.out.printf("입력값 개수[%d] 초과!\n");
            return;
        }

        List<Integer> numList = Arrays.stream(datas)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        long start = System.currentTimeMillis();

        //algorithm
        Collections.sort(numList, Collections.reverseOrder()); //내림차 정렬
        int first = numList.get(0);  //가장 큰수
        int second = numList.get(1); //두번째 큰수

        //가장 큰수가 더해지는 횟수 계산
        int addCount = (m / (k + 1) * k) + (m % (k + 1));

        int sum = 0;
        sum += addCount * first;
        sum += (m - addCount) * second;

        System.out.println("최대 총합: " + sum);
        long end = System.currentTimeMillis();
        System.out.println("소요시간: " + (end - start) * 0.001 + "초");
    }
}
