package com.example.testapp.arrays_and_matrix.capacity_arrays;

import java.util.Arrays;
import java.util.List;

public class task8 {
        //    Индекс равных сумм
        //            средне
        //        # решено
        //    Дан массив целых чисел nums.
        //    Нужно найти индекс элемента,
        //    такой что суммы всех элементов справа и слева
        //    от этого элемента равны.
        //    Если индекс указывает на самый первый элемент массива,
        //    то считаем сумму всех элементов слева равной нулю.
        //    Это правило также применимо к последнему индексу.
        //    Если в массиве нет такого индекса, то нужно вернуть -1.
        //    Пример 1:
        //    Ввод: nums = [7,3,4,5,5]
        //    Вывод: 2
        //    Объяснение: 7+3 = 5+5
        //
        //    Пример 2:
        //    Ввод: nums = [3,5,-5]
        //    Вывод: 0
        //    Объяснение: 0 = 5+(-5)
        //
        //    Пример 3:
        //    Ввод: nums = [1,2,4,8]
        //    Вывод: -1

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,4,8);

        doSomething(nums);
    }

    private static void doSomething(List<Integer> nums) {
        int totalSum = 0;
        int targetIndex = -1;
        for (int p = 0; p < nums.size(); p++) {
            totalSum += nums.get(p);
        }

        int leftSum = 0;
        for (int p = 0; p < nums.size(); p++) {
            leftSum += nums.get(p);
            int rightSideSum = totalSum - leftSum;
            int leftSideSum = leftSum - nums.get(p);
            if (leftSideSum == rightSideSum) {
                targetIndex = p;
            }
        }

        System.out.println("result is " + targetIndex);
    }
}