package com.example.testapp.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Дан отсортированный массив nums и число target. Нужно вернуть позиции двух чисел, которые дают в сумме target, при этом ответ гарантированно присутствует и он единственный.
 * <p>
 * Нужно вернуть сначала меньший индекс, а потом больший (индексы не могут быть равными). При этом индексация в массиве начинается с единицы, а не с нуля.
 * <p>
 * ВАЖНО: реши за O(1) по памяти
 * <p>
 * Пример 1:
 * <p>
 * Ввод: nums = [-2,1,6,9,12], target=18
 * Вывод: [3,5]
 * Объяснение: 18 = 6 + 12, 6-ка имеет индекс 3, а 12 - индекс 5
 */

class Scratch {
    public static void main(String[] args) {
        int target = 18;
        List<Integer> before = Arrays.asList(-2, 1, 6, 9, 12);
        System.out.println(before);


        System.out.println(doSomething(before, target));
    }

    private static List<Integer> doSomething(List<Integer> before, int target) {
        List<Integer> result = new ArrayList<>();
        int p1 = 0;
        int p2 = before.size() - 1;

        while (p1 <= p2) {
            System.out.println(before.get(p1));
            System.out.println(before.get(p2));
            if ((before.get(p1) + before.get(p2)) == target) {
                result.add(p1+1);
                result.add(p2+1);
                return result;
            }

            if (before.get(p1) > target || (before.get(p1) + before.get(p2)) < target) {
                p1++;
            }
            if (before.get(p2) > target || (before.get(p1) + before.get(p2)) > target) {
                p2--;
            }
            System.out.println("===================");
        }

        return Arrays.asList(0, 0);
    }


}