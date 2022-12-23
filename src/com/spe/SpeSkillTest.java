package com.spe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpeSkillTest {

    private static boolean narcissistic(int n) {
        String st = String.valueOf(n);

        int sum = 0;
        int len = st.length();

        for (int i = 0; i < len; i++) {
            sum = sum + (int)Math.pow(st.charAt(i) - '0', len);
        }

        int number = Integer.parseInt(st);

        if (number == sum)
            return true;
        else
            return false;
    }

    private static String parityOutlier(int[] numbers) {
        List<Integer> evenArr = new ArrayList<>();
        List<Integer> oddArr = new ArrayList<>();

        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] % 2 == 0){
                evenArr.add(numbers[i]);
            }else{
                oddArr.add(numbers[i]);
            }
        }

        if(oddArr.size() == 1) {
            return "the only odd number";
        }
        if(evenArr.size() == 1) {
            return "the only even number";
        }
        if(oddArr.size() == numbers.length || evenArr.size() == numbers.length) {
            return "all odd integer, no outlier";
        }
        if(oddArr.size() == numbers.length || evenArr.size() == numbers.length) {
            return "all even integer, no outlier";
        }

        return null;
    }

    private static int findNeedle(String[] stArr, String st) {
        return Arrays.asList(stArr).indexOf(st);
    }

    private static List<Integer> blueOcean(int[] numbers, int[] rmNumbers) {
        List<Integer> newNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < rmNumbers.length; j++) {
                if (numbers[i] != rmNumbers[j]) {
                    newNumbers.add(numbers[i]);
                }
            }
        }

        return newNumbers;
    }

    public static void main(String[] args) {
        boolean isNarcissistic = narcissistic(153);
        System.out.println(isNarcissistic);
        String parityOutlier = parityOutlier(new int[] {2, 4, 0, 100, 4, 11, 2602, 36});
        System.out.println(parityOutlier);
        int findNeedle = findNeedle(new String[] {"red", "blue", "yellow"}, "blue");
        System.out.println(findNeedle);
        List<Integer> blueOcean = blueOcean(new int[]{1, 5, 5, 5, 5, 3}, new int[]{5});
        System.out.println(blueOcean);
    }
}
