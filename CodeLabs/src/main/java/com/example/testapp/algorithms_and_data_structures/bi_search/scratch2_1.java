package com.example.testapp.algorithms_and_data_structures.bi_search;

import java.util.Arrays;
import java.util.List;

class Scratch4 {
    public static void main(String[] args) {
        int target = 12;
        List<Integer> before = Arrays.asList(-100,1,3,12,35,134);
        System.out.println(before);


        System.out.println("findFirstIndex = "+findFirstIndex(before, target));
        System.out.println("findLastIndex = "+findLastIndex(before, target));
    }


    /**
     * Дан массив nums, отсортированный в неубывающем порядке,
     * и число target. Нужно вернуть начальную и
     * конечную позицию числа target в массиве nums.
     * Если число target отсутствует, вернуть [-1, -1].
     * <p>
     * Пример 1:
     * <p>
     * Ввод: nums = [1,2,2,2,2,2,5,5,8,19], target = 2
     * Вывод: [1,5]
     * Объяснение: индексация элементов начинается с нуля
     * <p>
     * -100,1,3,12,35,134], target = 12
     */
    private static Integer findLastIndex(List<Integer> before, int target) {

        int resultIndex = -1;

        int p1 = 0;
        int p2 = before.size()-1;

        while (p1 < p2) {

            int middle = (p1 + p2) / 2;

            System.out.println(p1);
            System.out.println(p2);
            System.out.println(middle + " = " + before.get(middle));
            System.out.println("====================");

            if (before.get(middle) ==  target) {
                p1 = middle+1;
            } else if(before.get(middle) > target) {
                p2 = middle -1 ;
            } else {
                p1 = middle +1;
            }
            resultIndex = middle;
        }
        return resultIndex;
    }

    private static Integer findFirstIndex(List<Integer> before, int target) {

        int resultIndex = -1;

        int p1 = 0;
        int p2 = before.size()-1;

        while (p1 < p2) {

            int middle = (p1 + p2) / 2;

            System.out.println(p1);
            System.out.println(p2);
            System.out.println(middle + " = " + before.get(middle));
            System.out.println("====================");

            if (before.get(middle) ==  target) {
                p2 = middle-1;
            } else if(before.get(middle) > target) {
                p2 = middle -1 ;
            } else {
                p1 = middle +1;
            }
            resultIndex = middle;
        }
        return resultIndex;
    }

}