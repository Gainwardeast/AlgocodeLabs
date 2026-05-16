package com.example.testapp.two_pointers.first;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Scratch6 {
    public static void main(String[] args) {
        // nums1 = [-3,2,2,5,8,19,31],
        // nums2 = [1,2,2,2,6,19,52]4
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> nums2 = Arrays.asList(4, 5, 6);

        System.out.println(nums1);
        System.out.println(nums2);


        System.out.println(doSomething(nums1, nums2));
    }

    /*
        Даны два массива nums1 и nums2, отсортированные по возрастанию.

        Необходимо вернуть все элементы из nums1,
        которые не встречаются в nums2, в отсортированном по возрастанию порядке.

        Пример 1:

        Ввод: nums1 = [1,2,3,4,5], nums2 = [4,5,6]
        Вывод: [1,2,3]
    * */

    private static List<Integer> doSomething(List<Integer> nums1, List<Integer> nums2) {
        Set<Integer> result = new HashSet<>();
        int num1begin = 0;
        int num2begin = 0;
        while (num1begin < nums1.size() && num2begin < nums2.size()) {
            if (nums1.get(num1begin) != nums2.get(num2begin)) {
                result.add(nums1.get(num1begin));
                num1begin++;
                num2begin++;
            } else {
                num1begin++;
                num2begin++;
            }
        }

        return result.stream().toList();
    }
}