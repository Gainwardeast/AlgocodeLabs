package com.example.testapp.arrays_and_matrix.good_and_simple.second;

import java.util.Arrays;
import java.util.List;

public class task9 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,-6,-4,10,-5);

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
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int number: nums){
            min1 = Math.min(min1, number);
            min2 = Math.min(min1, number);
            min1 = Math.min(min1, number);
            min1 = Math.min(min1, number);
        }


        System.out.println("finish");
    }
}