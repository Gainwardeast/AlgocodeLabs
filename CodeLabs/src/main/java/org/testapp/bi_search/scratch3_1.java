package com.example.testapp

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Scratch {
    public static void main(String[] args) {
        // nums1 = [-3,2,2,5,8,19,31],
        // nums2 = [1,2,2,2,6,19,52]4
        List<Integer> before = Arrays.asList(5, 6, 9, 7, 5, -1, 8, 11, 2);

        System.out.println(before);


        System.out.println(doSomething(before));
    }

    /*
        Дан массив temperature, где temperature[i] — температура в i-й день.
        Нужно вернуть массив result,
        где result[i] — количество дней,
        через которое температура станет выше,
        чем в i-й день.
        Если потепления не будет, result[i] = 0.

        Дни с одинаковой температурой не считаются потеплением.

        Пример 1:

        Ввод: temperature = [5,6,9,7,5,-1,8,11,2]
        Вывод: [1,1,5,3,2,1,1,0,0]
    * */

    private static List<Integer> doSomething(List<Integer> before) {
        Stack<Integer> stack = new Stack<>();
        Integer[] result = new Integer[before.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = 0;
        }

        int p1 = 0;
        while (p1 < before.size()) {
            if (stack.empty()) {
                stack.push(p1);
                p1++;
                continue;
            }

            if (!stack.isEmpty() && before.get(p1) > before.get(stack.peek())) {
                while (!stack.isEmpty() && before.get(p1) > before.get(stack.peek())) {
                    result[stack.peek()] = p1 - stack.peek();
                    stack.pop();
                }
                stack.push(p1);
            } else {
                stack.push(p1);
            }

            p1++;
        }
        return Arrays.asList(result);
    }
}