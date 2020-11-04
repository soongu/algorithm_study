package kr.co.kokono.part2_greedy;

import kr.co.kokono.util.Util;

import java.util.List;

public class 숫자1이될때까지_hsg {

    public static void main(String[] args) {

        List<Integer> nk = Util.getMultiInput();
        int n = nk.get(0);
        int k = nk.get(1);

        int operationCnt = 0;
        int result = n;

        if (n > k) {
            while (result != 1) {

                if (result % k == 0) {
                    result /= k;
                } else {
                    result--;
                }
//            System.out.println("result = " + result);
                operationCnt++;

            }
        }
        System.out.println("operationCnt = " + operationCnt);


    }
}
