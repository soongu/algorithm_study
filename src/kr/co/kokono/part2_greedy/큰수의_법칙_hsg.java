package kr.co.kokono.part2_greedy;

import java.util.*;

public class 큰수의_법칙_hsg {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //input
        String[] nmk = sc.nextLine().split(" ");
        int n = Integer.parseInt(nmk[0].trim());
        int m = Integer.parseInt(nmk[1].trim());
        int k = Integer.parseInt(nmk[2].trim());
        //System.out.println(n + " " + m + " " + k);

        String[] datas = sc.nextLine().split(" ");
        if (datas.length > n) {
            System.out.printf("입력값 개수[%d] 초과!\n");
            return;
        }

        long start = System.currentTimeMillis();

        //algorithm
        //find max number
        List<Integer> maxList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            maxList.add(Integer.parseInt(datas[i]));
        }
        //reverse sort
        Collections.sort(maxList);
        Collections.reverse(maxList);
        System.out.println(maxList);

        int first = maxList.get(0);
        int second = maxList.get(1);

        int sum = 0; //총합 저장
        int cnt = 0; //덧셈 횟수

        for (int i = 0; i < m; i++) {
            sum += first;
            cnt++;
            if (cnt == k) {
                sum += second;
                cnt = 0; i++;
            }
        }


        System.out.println("최대 총합: " + sum);
        long end = System.currentTimeMillis();
        System.out.println("소요시간: " + (end - start) * 0.001 + "초");
    }

}
