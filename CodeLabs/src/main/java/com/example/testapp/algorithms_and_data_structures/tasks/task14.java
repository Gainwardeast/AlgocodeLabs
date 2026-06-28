package com.example.testapp.algorithms_and_data_structures.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Scratch3 {
    public static void main(String[] args) {

        List<List<Integer>> before = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3)
        );
        System.out.println(before);

        doSomething(before);
    }
    /*
    * Декартово произведение
    средне
    Дан список целочисленных массивов nums.
    * Верните все возможные комбинации элементов,
    * взяв из каждого массива ровно один элемент. Порядок комбинаций не важен.

    Пример 1:

    Ввод: nums = [[1,2],[3]]
    Вывод: [[1,3],[2,3]]

    Пример 2:

    Ввод: nums = [[5],[6],[7]]
    Вывод: [[5,6,7]]
    * */


    private static void doSomething(List<List<Integer>> nums) {

        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>(), result);
        System.out.println(result);
    }

    static void dfs(List<List<Integer>> nums, int level, List<Integer> current, List<List<Integer>> result) {
        // Базовый случай: дошли до конца
        if (level == nums.size()) {
            result.add(new ArrayList<>(current)); // сохраняем копию
            return;
        }

        // Перебираем все элементы на текущем уровне
        for (int num : nums.get(level)) {
            current.add(num);        // выбираем элемент
            dfs(nums, level + 1, current, result); // идем глубже
            current.remove(current.size() - 1); // возвращаемся (backtracking)
        }
    }
}