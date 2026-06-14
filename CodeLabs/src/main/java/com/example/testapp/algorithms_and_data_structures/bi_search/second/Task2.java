package com.example.testapp.Algorithms_and_data_structures.bi_search.second;

import java.util.Arrays;
import java.util.List;

class Task2 {
    /**
     * Поиск в сортированном массиве
     * легко
     * # решено
     * <p>
     * Дан массив nums, отсортированный по возрастанию,
     * и число target. Нужно вернуть индекс числа target в массиве nums
     * или -1, если такого числа нет.
     * <p>
     * Пример 1:
     * Ввод: nums = [-100,1,3,12,35,134], target = 12
     * Вывод: 3
     * Объяснение: индексация элементов начинается с нуля
     * Пример 2:
     * Ввод: nums = [1,3,4,6,7], target = 5
     * Вывод: -1
     *
     * @param args
     */
    public static void main(String[] args) {
        int target = 12;
        List<Integer> before = Arrays.asList(-100, 1, 3, 12, 35, 134);
        System.out.println(before);

        makeTask(before, target);
    }

    private static void makeTask(List<Integer> nums, int target) {
        int p1 = 0;
        int p2 = nums.size() - 1;
        while(p1 < p2){
            int middleIndex = p1 + ((p1+p2)/2);
            int middleNumber = nums.get(middleIndex);
            if(middleNumber == target){
                System.out.println("finish middleIndex =>"+middleIndex);
                break;
            }

            if(middleNumber > target){
                p2--;
            }

            if(middleNumber < target){
                p1++;
            }
        }


        System.out.println("finish");
    }
}