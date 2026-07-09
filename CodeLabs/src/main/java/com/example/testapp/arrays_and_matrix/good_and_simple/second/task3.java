package com.example.testapp.arrays_and_matrix.good_and_simple.second;

import java.util.Arrays;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,3,3);

        doSomething(nums);
    }

    /*
        Простой калькулятор
        средне
        # решено
        Дан массив s с положительными числами и знаками * и +.
        Нужно вернуть результат вычислений и важно,
        чтобы решение было за O(1) по дополнительной памяти.
        Пример 1:
        Ввод: s = ["2","*","3","*","1","+","2","+","2","+","2","*","0","*","13","+","1"]
        Вывод: 11
        Пример 2:
        Ввод: s = ["1","+","2","+","3"]
        Вывод: 6
    * */

    private static void doSomething(List<Integer> nums) {
        int currentMaxLength = 1;
        int maxLength = 1;
        for (int p1 = 1; p1 < nums.size();) {
            System.out.println(nums.get(p1 - 1));
            System.out.println(nums.get(p1));

            if (nums.get(p1) > nums.get(p1 - 1)) {
                currentMaxLength++;
                maxLength = Math.max(currentMaxLength, maxLength);
            } else {
                currentMaxLength = 1;
            }
            System.out.println("current max length = "+currentMaxLength);
            System.out.println("final max length = "+ maxLength);
            System.out.println("==================");
            p1++;
        }

        System.out.println(maxLength);
        System.out.println("finish");
    }
}
