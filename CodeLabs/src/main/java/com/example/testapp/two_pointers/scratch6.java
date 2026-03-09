package com.example.testapp.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Scratch61 {
    public static void main(String[] args) {
        List<Integer> before1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> before2 = Arrays.asList(4, 5, 6);
        System.out.println(before1);
        System.out.println(before2);
        System.out.println("final result -> " + sortedArray(before1, before2));
    }

    /*
        Даны два массива nums1 и nums2,
        отсортированные по возрастанию.

        Необходимо вернуть все элементы из nums1,
        которые не встречаются в nums2,
        в отсортированном по возрастанию порядке.
    */

    static List<Integer> sortedArray(List<Integer> nums1, List<Integer> nums2) {
        int num1begin = 0;
        int num2begin = 0;

        List<Integer> result = new ArrayList<Integer>();

        while (num1begin < nums1.size()) {
            System.out.println("num1begin " + num1begin);
            System.out.println("num2begin " + num2begin);

            if (num2begin >= nums2.size()) {
                result.add(nums1.get(num1begin));
                num1begin++;
                continue;
            }

            if (nums1.get(num1begin) < nums2.get(num2begin)) {
                result.add(nums1.get(num1begin));
                num1begin++;
            } else if (nums1.get(num1begin) > nums2.get(num2begin)) {
                num2begin++;
            } else {
                num1begin++;
                int currentVal = nums1.get(num1begin);
                while (num2begin < nums2.size() && nums2.get(num2begin) == currentVal) {
                    num2begin++;
                }
            }
            System.out.println("result " + result);
        }

        return result;
    }

}