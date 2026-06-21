package com.example.testapp.algorithms_and_data_structures.stack.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Task8copy1 {
    /**
     * Прогноз потеплений
     * средне
     * Дан массив temperature, где temperature[i] — температура в i-й день.
     * Нужно вернуть массив result, где result[i] — количество дней,
     * через которое температура станет выше, чем в i-й день.
     * Если потепления не будет, result[i] = 0.
     * Дни с одинаковой температурой не считаются потеплением.
     * Пример 1:
     * Ввод: temperature = [5,6,9,7,5,-1,8,11,2]
     * Вывод: [1,1,5,3,2,1,1,0,0]
     * Пример 2:
     * Ввод: temperature = [5,4,3]
     * Вывод: [0,0,0]
     * Пример 3:
     * Ввод: temperature = [2,3,4,5]
     * Вывод: [1,1,1,0]
     */
    public static void main(String[] args) {
        List<Integer> before = Arrays.asList(5, 6, 9, 7, 5, -1, 8, 11, 2);
        System.out.println(before);

        makeTask(before);
    }

    private static void makeTask(List<Integer> nums) {
        //   * [5,6,9,7,5,-1,8,11,2]
        //   * [1,1,5,3,2,1,1,0,0]
        Stack<Integer> numsStack = new Stack<>();
        int[] result = new int[nums.size()];


        for (int p1 = 0; p1 < nums.size(); p1++) {
            while (!numsStack.isEmpty()) {
                if (nums.get(numsStack.peek()) < nums.get(p1)) {

                    result[numsStack.peek()] = p1 - numsStack.peek();
                } else {
                    break;
                }
            }
            numsStack.push(p1);
        }

        printResult(result);
    }

    private static void printResult(int[] result) {
        List<Integer> resultList = new ArrayList<>();
        for (int i : result) {
            resultList.add(i);
        }
        System.out.println(resultList);
    }
}