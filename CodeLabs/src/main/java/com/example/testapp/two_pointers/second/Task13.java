package com.example.testapp.two_pointers.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13 {
    /*
        Самый большой контейнер
        средне
        # решено

        Дан массив целых чисел nums,
        nums[i] – высота линии.
        Нужно найти максимальную площадь,
        которую может заполнить вода между двумя линиями.

        ВАЖНО: площадь воды считается как min(nums[i], nums[j]) * (j - i),
        где i – индекс первой линии, а j - номер второй.

        Ввод: nums = [1,8,6,2,5,4,8,3,7]
        Вывод: 49
        Объяснение: 7 * (8 - 1) = 49, "1" -  индекс первой линии, "8" -  второй
    * */

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,8,6,2,5,4,8,3,7);
        System.out.println(nums);
        System.out.println(findMaxSum(nums));
    }

    static Integer findMaxSum(List<Integer> nums){
        int p1 = 0;
        int p2 = nums.size()-1;
        int maxResult = 0;
        while(p1 < p2){
            int num1 = nums.get(p1);
            int num2 = nums.get(p2);
            int result = (p2-p1)* Math.min(num1, num2);
            maxResult = Math.max(maxResult, result);

            if(num1 < num2 ){
                p1++;
            } else {
                p2--;
            }
        }
        return maxResult;
    }
}
