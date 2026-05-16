package com.example.testapp.two_pointers.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    /*
        Сумма в сортированном массиве
        легко
        # решено

        Дан отсортированный массив nums и число target.
        Нужно вернуть позиции двух чисел,
        которые дают в сумме target,
        при этом ответ гарантированно присутствует и он единственный.

        Нужно вернуть сначала меньший индекс,
        а потом больший (индексы не могут быть равными).
        При этом индексация в массиве начинается с единицы, а не с нуля.

        ВАЖНО: реши за O(1) по памяти

        Пример 1:

        Ввод: nums = [-2,1,6,9,12], target=18
        Вывод: [3,5]
        Объяснение: 18 = 6 + 12, 6-ка имеет индекс 3, а 12 - индекс 5
    * */

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-2,1,6,9,12);
        int target = 18;
        System.out.println(nums);
        System.out.println(makeSort(nums, target));
    }

    static List<Integer> makeSort(List<Integer> nums, int target){
        List<Integer> result = new ArrayList();
        int p1 = 0;
        int p2 = nums.size()-1;
        while(p1 != p2){
            int num1 = nums.get(p1);
            int num2 = nums.get(p2);

            if((num1 + num2) == target) {
                result.add(p1+1);
                result.add(p2+1);
                return result;
            }

            if((num2) > target || (num1 + num2) > target){
                p2--;
            } else if ((num1) > target||(num1 + num2) < target){
                p1++;
            }
        }
        return result;
    }
}
