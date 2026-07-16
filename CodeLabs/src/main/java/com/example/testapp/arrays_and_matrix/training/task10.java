package com.example.testapp.arrays_and_matrix.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task10 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-100,1,2,5,8,9);

        doSomething(nums, 4, 2);
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
        int left = idx - 1;
        int right = idx + 1;
        List<Integer> result = new ArrayList<>();

        result.add(0, nums.get(idx));
        while (result.size() < kNumber) {
            if (left >= 0) {
                int distLeft = Math.abs(nums.get(left) - nums.get(idx));
                int distRight = Math.abs(nums.get(right) - nums.get(idx));
                if (distLeft <= distRight || nums.get(left) < nums.get(right)) {
                    result.add(0, nums.get(left));
                    left--;
                }
            } else if ( right < nums.size() ){
                result.add(nums.get(right));
                right++;
            }
            if (left <= 0 && right >= nums.size()) break;
            System.out.println("finish");
        }

        System.out.println("finish");
    }
}