package com.example.testapp.algorithms_and_data_structures.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Scratch3 {

    /**
     * Декартово произведение
     * средне
     * <p>
     * Дан список целочисленных массивов nums.
     * Верните все возможные комбинации элементов,
     * взяв из каждого массива ровно один элемент.
     * Порядок комбинаций не важен.
     * <p>
     * Пример 1:
     * <p>
     * Ввод: nums = [[1,2],[3,4]]
     * Вывод: [[1,3],[1,4],[2,3],[2,4]]
     * <p>
     * Пример 2:
     * <p>
     * Ввод: nums = [[5],[6],[7]]
     * Вывод: [[5,6,7]]
     */

    public static void main(String[] args) {

        List<List<Integer>> before = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4)
        );
        System.out.println(before);

        makeTask(before);
    }

    static void makeTask(List<List<Integer>> inputNums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(0, inputNums, current, result);
    }


    static void backtrack(int index, List<List<Integer>> nums, List<Integer> current, List<List<Integer>> result) {

        if (index == nums.size()) {
            result.add(new ArrayList<>(current));
            return;
        }
        List<Integer> currentArray = nums.get(index);
        for (int i = 0; i < currentArray.size(); i++) {
            int element = currentArray.get(i);
            current.add(element);
            backtrack(index + 1, nums, current, result);
            current.remove(current.size() - 1);
        }
    }
}