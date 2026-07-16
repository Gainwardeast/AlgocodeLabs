package com.example.testapp.arrays_and_matrix.training;

import java.util.Arrays;
import java.util.List;

public class task9 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 10, 1, 7, 2);

        doSomething(nums);
    }

    /*
        Минимальное произведение
        легко
        Дан массив nums.
        Нужно найти минимальное произведение двух элементов массива.

        Пример 1:
        Ввод: nums = [2,-6,-4,10,-5]
        Вывод: -60
        Объяснение: 10 * -6 = -60
        Пример 2:
        Ввод: [3, 10, 1, 7, 2]
        Вывод: 2
        Объяснение: 1 * 2 = 2
    * */

    private static void doSomething(List<Integer> nums) {
        int result = 0;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        // 2,-6,-4,10,-5
        for (int number : nums) {
            if (number < min1) {
                min2 = min1;
                min1 = number;
            } else if (number < min2 && number > min1) {
                min2 = number;
            }

            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2 && number < max1) {
                max2 = number;
            }
        }

        if (min1 < 0 && max1 > 0) {
            result = min1 * max1;
        } else if (min1 > 0) {
            result = min1 * min2;
        }


        System.out.println("finish");
    }
}