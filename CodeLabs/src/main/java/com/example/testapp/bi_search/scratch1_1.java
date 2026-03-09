package com.example.testapp.bi_search;

import java.util.Arrays;
import java.util.List;

class Scratch {
    public static void main(String[] args) {
        int target = 12;
        List<Integer> before = Arrays.asList(-100, 1, 3, 12, 35, 134);
        System.out.println(before);

        biSearch(before, target);
    }


    /**
     * Дан массив nums,
     * отсортированный по возрастанию,
     * и число target.
     * Нужно вернуть индекс числа target в массиве nums
     * или -1, если такого числа нет.
     * <p>
     * Пример 1:
     * Ввод: nums = [-100,1,3,12,35,134], target = 12
     * Вывод: 3
     * Объяснение: индексация элементов начинается с нуля
     */
    private static Integer biSearch(List<Integer> before, int target) {

        int resultIndex = -1;

        int p1 = 0;
        int p2 = before.size() - 1;

        while (p1 < p2) {

            int middle = p1 + ((p2 - p1) / 2);

            System.out.println(p1);
            System.out.println(p2);
            System.out.println(middle);
            System.out.println(before.get(middle));
            System.out.println("====================");

            if(before.get(middle) == target){
                return middle;
            }

            if(before.get(middle) < target){
                p1++;
            }
            if(before.get(middle) > target){
                p2++;
            }
        }
        return resultIndex;
    }
}