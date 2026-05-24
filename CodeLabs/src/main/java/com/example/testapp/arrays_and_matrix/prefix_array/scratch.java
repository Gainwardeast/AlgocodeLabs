package com.example.testapp.arrays_and_matrix.prefix_array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Scratch11 {
    public static void main(String[] args) {
        doSomething(Arrays.asList(1, 4, 5, -3, 7, 2), 3, 5);
    }

    // 1, 4, 5, -3, 7, 2
    // 1, 5, 10, 7, 14, 16

    /**
     * Реализуй структуру данных,
     * которая позволяет быстро находить сумму всех
     * элементов на отрезке [l, r] (включая границы).
     * При этом массив не изменяется.
     * <p>
     * Другими словами, нужно реализовать:
     * <p>
     * Конструктор (вызывается один раз).
     * Метод sum (вызывается многократно, поэтому он должен быть максимально быстрым).
     * <p>
     * Ввод: nums = [1, 4, 5, -3, 7, 2]
     * l = 0, r = 2
     * l = 0, r = 5
     * l = 3, r = 5
     * <p>
     * Вывод:
     * 10
     * 16
     * 6
     */

    static void doSomething(List<Integer> nums, int left, int right) {
        List<Integer> sums = new ArrayList<>();
        sums.add(0);
        int p1 = 0;
        int sum = 0;
        while (p1 < nums.size()) {
            sum += nums.get(p1);
            sums.add(sum);
            p1++;
        }
        System.out.println("result");
        int sumresult = sums.get(right+1) - sums.get(left);
        System.out.println("sumresult "+ sumresult);
    }

}