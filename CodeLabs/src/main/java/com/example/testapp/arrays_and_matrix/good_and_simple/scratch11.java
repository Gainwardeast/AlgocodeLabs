package com.example.testapp.arrays_and_matrix.good_and_simple;

import java.util.Arrays;
import java.util.List;

class Scratch1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 8, 7, 15, 21, 22, 1, 7, 2);



        doSomething(nums);
    }

    /**
     * Дан массив nums.
     * Нужно вернуть длину самой длинной непрерывной возрастающей подпоследовательности.
     *
     * Непрерывная возрастающая подпоследовательность –
     * подряд идущие элементы, где каждый следующий элемент строго больше предыдущего.
     *
     * Пример 1:
     *
     * Ввод: nums = [1,8,7,15,21,22,1,7,2]
     * Вывод: 4
     * Объяснение: [7,15,21,22]
     */
    private static void doSomething(List<Integer> nums) {
        int p1 = 1;
        int currentLength = 1;
        int maxLength = 1;
        while (p1 < nums.size() ) {
            if(nums.get(p1) > nums.get(p1-1)){
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
            p1++;
        }
        System.out.println("finish");
    }
}