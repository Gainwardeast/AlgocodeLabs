package com.example.testapp.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Scratch5 {
    public static void main(String[] args) {
        // Ввод: nums1 = [-3,2,2,5,8,19,31], nums2 = [1,2,2,2,6,19,52]
        List<Integer> before1 = Arrays.asList(-3, 2, 2, 5, 8, 19, 31);
        List<Integer> before2 = Arrays.asList(1, 2, 2, 2, 6, 19, 52);
        System.out.println(before1);
        System.out.println(before2);
        System.out.println("final result -> " + sortedArray(before1, before2));
    }

    /*
        Даны два отсортированных по возрастанию массива nums1 и nums2.
        Необходимо вернуть новый массив nums3,
        который содержит все общие элементы из nums1 и nums2.

        Результат должен быть также отсортирован по возрастанию.
        Если элементы встречаются в массивах несколько раз,
        то их нужно продублировать в ответе.
    */

    static List<Integer> sortedArray(List<Integer> nums1, List<Integer> nums2) {
        int num1begin = 0;
        int num2begin = 0;

        List<Integer> result = new ArrayList<Integer>();

        while ((num1begin < nums1.size()) && (num2begin < nums2.size())) {
            if (nums1.get(num1begin) < nums2.get(num2begin)) {
                num1begin++;
            } else if (nums1.get(num1begin) > nums2.get(num2begin)) {
                num2begin++;
            } else {
                result.add(nums1.get(num1begin));
                num1begin++;
                num2begin++;
            }
        }

        return result;
    }

}