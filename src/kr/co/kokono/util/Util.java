package kr.co.kokono.util;

import java.util.*;
import java.util.stream.Collectors;

public class Util {

    private static Scanner sc = new Scanner(System.in);

    public static List<Integer> getMultiInput() {
        return Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
