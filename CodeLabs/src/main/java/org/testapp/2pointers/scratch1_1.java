package com.example.testapp

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Scratch {
    public static void main(String[] args) {
        List<Integer> before = Arrays.asList(-3, -2, 0, 1, 3, 5);
        System.out.println(before);


        System.out.println(doSomething(before));
    }

    private static List<Integer> doSomething(List<Integer> before) {
        List<Integer> result = new ArrayList<>();
        int p1 = 0;
        int p2 = before.size() - 1;

        while (p1 <= p2) {
            if (Math.abs(before.get(p1)) > Math.abs(before.get(p2))) {
                int value = before.get(p1) * before.get(p1);
                result.add(0, value);
                p1++;
            } else {
                int value = before.get(p2) * before.get(p2);
                result.add(0, value);
                p2--;
            }
        }

        return result;
    }

    /**
     * Сортировка элементов в квадрате
     * легко
     * # решено
     *
     * Дан массив nums, отсортированный в неубывающем порядке.
     * Нужно вернуть отсортированный массив,
     * состоящий из всех элементов массива nums, возведенных в квадрат.
     *
     * Неубывающий порядок – порядок,
     * где каждый следующий элемент больше или равен предыдущему.
     *
     * Ввод: nums = [-3,-2,0,1,3,5]
     * Вывод: [0,1,4,9,9,25]
     */
}