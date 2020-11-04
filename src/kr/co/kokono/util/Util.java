package kr.co.kokono.util;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Util {

    private static Scanner sc = new Scanner(System.in);

    public static List<Integer> getMultiInput() {

        return Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static <T> T[] remove(T[] array, int delIdx) {
        for (int i = delIdx; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        return Arrays.copyOf(array, array.length-1);
    }



}
