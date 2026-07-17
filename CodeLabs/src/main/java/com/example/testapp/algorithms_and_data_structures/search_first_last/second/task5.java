package com.example.testapp.Algorithms_and_data_structures.search_first_last.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task5 {
    /**
     * Поиск K ближайших элементов
     * сложно
     * <p>
     * Дан массив nums, а также числа k и target.
     * Нужно вернуть k ближайших чисел к target из массива nums,
     * отсортированных в возрастающем порядке.
     * <p>
     * Число a считается ближе к target, чем число b, если:
     * <p>
     * |a - target| < |b - target|
     * |a - target| == |b - target|, но a < b
     * Если k <= 0 или k > len(nums), то нужно вернуть пустой массив в качестве ответа.
     * <p>
     * Пример 1:
     * Ввод: nums = [1,3,5,6,8,9], target = 2, k = 3
     * Вывод: [1,3,5]
     * <p>
     * Пример 2:
     * Ввод: nums = [2,3,3,4,5,6,7], target = 3, k = 3
     * Вывод: [2,3,3]
     * Объяснение: 4 > 2, поэтому берем [2,3,3], а не [3,3,4]
     */
    public static void main(String[] args) {
        List<Integer> before = Arrays.asList(1,3,5,6,8,9);
        System.out.println(before);

        makeTask(before, 2, 3);
    }

    private static void makeTask(List<Integer> nums, int target, int count) {

        List<Integer> resultList = new ArrayList<>();
        int p1 = 0;
        int p2 = nums.size() - 1;
        int targetPosition = -1;
        while (p1 < p2) {
            int m = p1 + ((p2 - p1) / 2);
            if (nums.get(m) < target) {
                p1 = m + 1;
                targetPosition = m + 1;
            } else {
                p2 = m - 1;
                targetPosition = m;
            }
        }

        p1 = targetPosition - 1;
        p2 = targetPosition;

        while(resultList.size() < count){
            if(p1 >=0 && Math.abs(nums.get(p1) - target) <= Math.abs(nums.get(p2) - target)){
                resultList.add(0, nums.get(p1));
                p1--;
            } else {
                resultList.add(nums.get(p2));
                p2++;
            }
        }

        System.out.println("finish");
    }


}
