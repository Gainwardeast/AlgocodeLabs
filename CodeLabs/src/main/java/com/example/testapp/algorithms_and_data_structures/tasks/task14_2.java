package com.example.testapp.algorithms_and_data_structures.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class task14_2 {

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

        findAllCombinations(inputNums );

        System.out.println("finish");
    }

    static void findAllCombinations(List<List<Integer>> inputNums) {
        List<List<Integer>> result = new ArrayList<>();

        for(List<Integer> targetArray : inputNums){
            List<List<Integer>> newResult = new ArrayList<>();
            // 1,2;
            // 3,4
            // 1,3, 1,4, 2,3, 2,4 
            for(Integer value : targetArray){
                if(result.isEmpty()){
                    List<Integer> newCollection = new ArrayList<>();
                    newCollection.add(value);
                    newResult.add(newCollection);
                } else {
                    for(List<Integer> resultList : result){
                        List<Integer> newCollection = new ArrayList<>(resultList);
                        newCollection.add(value);
                        newResult.add(newCollection);
                    }
                }
            }
            result.removeAll(result);
            result.addAll(newResult);
        }

        System.out.println("finish");
    }
}