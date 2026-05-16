package com.example.testapp.two_pointers.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    /*
    * Сортировка элементов в квадрате
    Дан массив nums, отсортированный в неубывающем порядке.
    * Нужно вернуть отсортированный массив,
    * состоящий из всех элементов массива nums,
    * возведенных в квадрат.
    Неубывающий порядок – порядок,
    * где каждый следующий элемент больше или равен предыдущему.
    *
    *
    *   Ввод: nums = [-3,-2,0,1,3,5]
        Вывод: [0,1,4,9,9,25]
    * */

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-5,-3,-1);
        System.out.println(nums);
        System.out.println(makeSort(nums));
    }

    static List<Integer> makeSort(List<Integer> nums){
        List<Integer> result = new ArrayList();
        int p1 = 0;
        int p2 = nums.size()-1;
        while(p1 <= p2){
            int num1 = Math.abs(nums.get(p1));
            int num2 = Math.abs(nums.get(p2));
            if(num1 > num2){
                result.add(0, num1*num1);
                p1++;
            }else {
                result.add(0, num2* num2);
                p2--;
            }
        }
        return result;
    }
}
