package com.example.testapp.two_pointers.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Scratch0 {
    public static void main(String[] args) {
        List<Integer> before = Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7);
        List<Integer> after = sortedSquares(before);
        System.out.println(before);
        System.out.println(after);
    }

    // Дан массив nums, отсортированный в неубывающем порядке.
    // Нужно вернуть отсортированный массив,
    // состоящий из всех элементов массива nums, возведенных в квадрат.
    //    Ввод: nums = [-3,-2,0,1,3,5]
    //    Вывод: [0,1,4,9,9,25]

    static List<Integer> sortedSquares(List<Integer> nums) {
        int begin = 0;
        int end = nums.size() - 1;

        List<Integer> result = new ArrayList<>();
        while (begin <= end) {
            int first = Math.abs(nums.get(begin));
            int second = Math.abs(nums.get(end));
            System.out.println("first " + first + ";second " + second);
            if (first > second) {
                result.add(0, first);
                begin++;
            } else {
                result.add(0, second);
                end--;
            }
            System.out.println("result " + result);
        }

        return result;
    }

}