package com.example.testapp.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Scratch1 {
    public static void main(String[] args) {
        // nums1 = [-3,2,2,5,8,19,31],
        // nums2 = [1,2,2,2,6,19,52]4
        List<Integer> nums1 = Arrays.asList(-3, 2, 2, 5, 8, 19, 31);
        List<Integer> nums2 = Arrays.asList(1, 2, 2, 2, 6, 19, 52);

        System.out.println(nums1);
        System.out.println(nums2);


        System.out.println(doSomething(nums1, nums2));
    }



    /*
    * Даны два отсортированных по возрастанию массива nums1 и nums2.
    * Необходимо вернуть новый массив nums3,
    * который содержит все общие элементы из nums1 и nums2.

        Результат должен быть также отсортирован по возрастанию.
        * Если элементы встречаются в массивах несколько раз,
        * то их нужно продублировать в ответе.

        Пример 1:

        Ввод: nums1 = [-3,2,2,5,8,19,31], nums2 = [1,2,2,2,6,19,52]
        Вывод: [2,2,19]
    * */

    private static List<Integer> doSomething(List<Integer> nums1, List<Integer> nums2) {
        List<Integer> result = new ArrayList<>();
        int num1begin = 0;
        int num2begin = 0;
        while (num1begin < nums1.size() && num2begin < nums2.size()) {
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