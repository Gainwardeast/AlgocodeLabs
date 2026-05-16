package com.example.testapp.two_pointers.first;


import java.util.Arrays;
import java.util.List;

class Scratch3 {
    public static void main(String[] args) {
        List<Integer> before = Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7);
        System.out.println(before);

        Integer result = sortedArray(before);
        System.out.println("final result -> " + result);
    }

    /*
        Дан массив целых чисел nums, nums[i] – высота линии.
        Нужно найти максимальную площадь,
        которую может заполнить вода между двумя линиями.

        ВАЖНО: площадь воды считается как min(nums[i], nums[j]) * (j - i),
        где i – индекс первой линии, а j - номер второй.

        Ввод: nums = [1,8,6,2,5,4,8,3,7]
        Вывод: 49
        Объяснение: 7 * (8 - 1) = 49, "1" -  индекс первой линии, "8" -  второй
    */

    static Integer sortedArray(List<Integer> nums) {
        int begin = 0;
        int end = nums.size() - 1;
        Integer maxResult = 0;
        while (begin <= end) {
            int first = nums.get(begin);
            int second = nums.get(end);
            System.out.println("begin => " + begin + " end => " + end);
            System.out.println("first => " + first + " second => " + second);
            int sum = (Math.min(first, second)) * (end - begin);
            System.out.println("sum => " + sum);
            maxResult = Math.max(sum, maxResult);
            if (first < second) {
                begin++;
            } else {
                end--;
            }
        }
        return maxResult;
    }

}