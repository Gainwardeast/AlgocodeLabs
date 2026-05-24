package com.example.testapp.arrays_and_matrix.capacity_arrays;

import java.util.Arrays;
import java.util.List;

class Scratch1112 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(7, -1, 4, 3, 5, 5);
        int index = doSomething(nums);
        System.out.println(index);
    }

    public static int doSomething(List<Integer> nums) {
        int numsSum = calcSum(nums);
        int sumLeft = 0;
        int p1 = 0;
        while(p1 < nums.size()){
            int sumRight = numsSum - sumLeft - nums.get(p1);
            if(sumRight == sumLeft){
                return p1;
            }

            sumLeft += nums.get(p1);
            p1++;
        }
        return -1;
    }

    public static int calcSum(List<Integer> nums) {
        int sum = 0;
        int p1 = 0;
        while(p1 < nums.size()){
            sum +=nums.get(p1);
            p1++;
        }
        return sum;
    }

    /**
     Минимальное произведение 
     Дан массив nums. Нужно найти минимальное произведение двух элементов массива.

     Пример 1:
     Ввод: nums = [2,-6,-4,10,-5]
     Вывод: -60
     Объяснение: 10 * -6 = -60

     Пример 2:
     Ввод: [3, 10, 1, 7, 2]
     Вывод: 2
     Объяснение: 1 * 2 = 2
     */


}