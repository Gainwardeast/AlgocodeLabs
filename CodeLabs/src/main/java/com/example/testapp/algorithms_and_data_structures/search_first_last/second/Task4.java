package com.example.testapp.algorithms_and_data_structures.search_first_last.second;

import java.util.Arrays;
import java.util.List;

class Task4 {
    /**
     * Поиск первой и последней позиции
     * средне
     * Дан массив nums, отсортированный в неубывающем порядке,
     * и число target. Нужно вернуть начальную и конечную позицию числа
     * target в массиве nums.
     * Если число target отсутствует, вернуть [-1, -1].
     * Пример 1:
     * Ввод: nums = [1,2,2,2,2,2,5,5,8,19], target = 2
     * Вывод: [1,5]
     * Объяснение: индексация элементов начинается с нуля
     * Пример 2:
     * Ввод: nums = [1,3,4,6,7], target = 5
     * Вывод: [-1,-1]
     * Пример 3:
     * Ввод: nums = [1,3,5], target = 5
     * Вывод: [2,2]
     */
    public static void main(String[] args) {
        int target = 2;
        List<Integer> before = Arrays.asList(1, 2, 2, 2, 2, 2, 5, 5, 8, 19);
        System.out.println(before);

        makeTask(before, target);
    }

    private static void makeTask(List<Integer> nums, int target) {

        findFirstPosition(nums, target);
        findLastPosition(nums, target);

        System.out.println("finish");
    }

    private static void findLastPosition(List<Integer> nums, int target) {
        int p1 = 0;
        int p2 = nums.size() - 1;
        while ((p2 - p1) > 1) {
            int m = (p1 + p2) / 2;
            System.out.println(m + "-" + nums.get(m));
            if (nums.get(m) <= target) {
                p1 = m;
            } else {
                p2 = m;
            }
        }
        System.out.println("last position " + p1);
    }

    private static void findFirstPosition(List<Integer> nums, int target) {
        int p1 = 0;
        int p2 = nums.size() - 1;
        while ((p2 - p1) > 1) {
            int m = (p1 + p2) / 2;
            System.out.println(m + "-" + nums.get(m));
            if (nums.get(m) < target) {
                p1 = m;
            } else {
                p2 = m;
            }
        }
        System.out.println("first position " + p2);
    }
}