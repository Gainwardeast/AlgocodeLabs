package com.example.testapp.two_pointers.first;

import java.util.Arrays;
import java.util.List;

class Scratch22 {
    public static void main(String[] args) {
        List<Integer> before = Arrays.asList(0, 0, 3, 4);
        System.out.println(before);

        List<Integer> after = sortedArray(before, 0);
        System.out.println(after);
    }

    /*
        Дан отсортированный массив nums и число target.
        Нужно вернуть позиции двух чисел, которые дают в сумме target,
        при этом ответ гарантированно присутствует и он единственный.

        Нужно вернуть сначала меньший индекс,
        а потом больший (индексы не могут быть равными).
        При этом индексация в массиве начинается с единицы, а не с нуля.
    */

    static List<Integer> sortedArray(List<Integer> nums, int target) {
        // 1, 3, 4, 90   {5}
        int begin = 0;
        int end = nums.size() - 1;
        while (begin != (end)) {
            int first = nums.get(begin);
            int second = nums.get(end);
            System.out.println("begin =>" + begin + " end =>" + end + " first =>" + first + " second =>" + second);

            if ((first + second) == target) {
                return Arrays.asList(begin + 1, end + 1);
            }

            if ((first > target) || ((first + second) < target)) {
                begin++;
            }

            if ((second > target) || ((first + second) > target)) {
                end--;
            }
        }
        return Arrays.asList(0, 0);
    }

}