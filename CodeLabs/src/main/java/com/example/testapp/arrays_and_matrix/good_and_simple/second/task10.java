package com.example.testapp.arrays_and_matrix.good_and_simple.second;

import java.util.Arrays;
import java.util.List;

public class task10 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,5,5,5,8);

        doSomething(nums);
    }

    /*
        К ближайших чисел
        легко
        Дан массив nums, отсортированный в неубывающем порядке,
        индекс idx и число k.
        Нужно найти k ближайших к значению nums[idx]
        чисел в массиве и вернуть в любом порядке.
        При равных расстояниях предпочтение отдаётся меньшим числам.
        Пример 1:
        Ввод: nums = [2,5,5,5,8], idx = 2, k = 4
        Вывод: [2,5,5,5]
        Объяснение: ответ [2,5,5,5], а не [5,5,5,8], потому что 2 < 8 при abs(8-5) = abs(2-5)
        Пример 2:
        Ввод: nums = [-100,1,2,5,8,9], idx = 4, k = 2
        Вывод: [8,9]
    * */

    private static void doSomething(List<Integer> nums, int idx, int kNumber) {
        int result = 0;

        System.out.println("finish");
    }
}