package com.example.testapp.arrays_and_matrix.good_and_simple.second;

import java.util.Arrays;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,3,3);

        doSomething(nums);
    }

    /*
    * Возрастающая подпоследовательность
    легко
    # решено
    Дан массив nums.
    * Нужно вернуть длину самой длинной непрерывной
    * возрастающей подпоследовательности.
    Непрерывная возрастающая подпоследовательность –
    * подряд идущие элементы,
    * где каждый следующий элемент строго больше предыдущего.
    Пример 1:
    Ввод: nums = [1,8,7,15,21,22,1,7,2]
    Вывод: 4
    Объяснение: [7,15,21,22]
    Пример 2:
    Ввод: nums = [3,3,3]
    Вывод: 1
    Объяснение: возрастающая подпоследовательность не может включать равные элементы.
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
