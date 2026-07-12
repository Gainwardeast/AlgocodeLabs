package com.example.testapp.arrays_and_matrix.capacity_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task6 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 5, 7);

        doSomething(nums, 7);
    }

    /*
        Последовательность с суммой K
        легко
        Дан неотсортированный массив nums целых чисел, необходимо определить,
        существует ли такая непрерывная последовательность,
        сумма элементов которой равна k.
        Нужно вернуть индекс последнего элемента
        первой встретившейся последовательности, иначе -1.
        Пример 1:
        Ввод: nums = [1, 2, 3], k = 5
        Вывод: 2
        Пример 2:
        Ввод: nums = [1, 2, 3], k = 7
        Вывод: -1
        Пример 3:
        Ввод: nums = [1, 2, 5, 7], k = 7
        Вывод: 2
        Объяснение: существует 2 непрерывных последовательности,
        в сумме равные 7 [2, 5] и [7] в качестве ответа возвращаем последний индекс последовательности [2, 5],
        так как она встретилась раньше.
    * */

    private static void doSomething(List<Integer> nums, int sum) {
        int resultIndex = 0;
        List<Integer> numsSum = new ArrayList<>();
        numsSum.add(0);
        for (int p = 0; p < nums.size(); p++) {
            numsSum.add(nums.get(p) + numsSum.get(p - 1));
        }

        for (int p = (numsSum.size()-1); p > 0; p--) {
            if(numsSum.get(p) - numsSum.get(0) == sum){
                resultIndex = p;
                break;
            }
        }

        System.out.println("finish");
    }
}