package com.example.testapp.two_pointers.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Самый большой контейнер
 * средне
 * # решено
 * <p>
 * Дан массив целых чисел nums, nums[i] – высота линии.
 * Нужно найти максимальную площадь, которую может заполнить вода между двумя линиями.
 * <p>
 * ВАЖНО: площадь воды считается как min(nums[i], nums[j]) * (j - i),
 * где i – индекс первой линии, а j - номер второй.
 * <p>
 * Ввод: nums = [1,8,6,2,5,4,8,3,7]
 * Вывод: 49
 * Объяснение: 7 * (8 - 1) = 49, "1" -  индекс первой линии, "8" -  второй
 */

class Scratch2 {
    public static void main(String[] args) {
        List<Integer> before = Arrays.asList(2,3,4,5);
        System.out.println(before);


        System.out.println(doSomething(before));
    }

    private static Integer doSomething(List<Integer> before) {
        int p1 = 0;
        int p2 = before.size() - 1;

        int maxResult = 0;

        while (p1 <= p2) {
            System.out.println(before.get(p1));
            System.out.println(before.get(p2));
//            if ((before.get(p1) + before.get(p2)) == target) {
//                result.add(p1+1);
//                result.add(p2+1);
//                return result;
//            }
            int value1 = before.get(p1);
            int value2 = before.get(p2);

            int sum = Math.min(before.get(p1), before.get(p2)) * (p2 - p1);
            maxResult = Math.max(sum, maxResult);

            if (value1 < value2) {
                p1++;
            } else {
                p2--;
            }
            System.out.println("=================maxResult = "+maxResult);
        }

        return maxResult;
    }


}