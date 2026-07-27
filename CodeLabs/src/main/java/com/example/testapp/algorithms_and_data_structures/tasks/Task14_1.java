package com.example.testapp.algorithms_and_data_structures.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Task14_1 {

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

        List<Integer> beforeArray = new ArrayList<>();
        findAllPairs(result, inputNums, beforeArray, 0);

        System.out.println("finish");
    }

    /*
     *
     * Arrays.asList(1, 2),
     * Arrays.asList(3, 4)
     *
     * index = 0 -> currentArray = 1, 2 ; current = []
     * 1 -> current
     *       index = 1 -> currentArray = 3, 4 ; current = [1]
     *       3 -> current = [1, 3]
     *           index = 2 - > result.add([1, 3])
     *       current.remove(current.size() - 1); [1, 3] -> [1]
     *       4-> current = [1, 4]
     *           index = 2 - > result.add([1, 3])
     *
     *
     *
     * 2 -> current
     */

    static void findAllPairs(
            List<List<Integer>> result,
            List<List<Integer>> inputNums,
            List<Integer> beforeArray,
            int index) {

        if (index >= inputNums.size()) {
            result.add(new ArrayList<>(beforeArray));
            return;
        }

        List<Integer> targetArray = inputNums.get(index);
        for (Integer value : targetArray) {
            beforeArray.add(value);
            findAllPairs(result, inputNums, beforeArray, index + 1);
            beforeArray.remove(beforeArray.indexOf(value));
        }
    }
}