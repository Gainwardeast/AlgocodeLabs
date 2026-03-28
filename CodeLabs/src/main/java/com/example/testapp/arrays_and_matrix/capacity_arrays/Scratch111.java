package com.example.testapp.arrays_and_matrix.capacity_arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Scratch111 {
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
     Дан массив целых чисел nums.
     Нужно найти индекс элемента,
     такой что суммы всех элементов справа
     и слева от этого элемента равны.

     Если индекс указывает на самый первый
     элемент массива, то считаем сумму всех элементов
     слева равной нулю.
     Это правило также применимо к последнему индексу.
     Если в массиве нет такого индекса,
     то нужно вернуть -1.

     Пример 1
     Ввод: nums = [7, -1, 4, 3, 5, 5]
     Вывод: 3
     Объяснение: 7 + (-1) + 4 = 5 + 5

     Пример 2
     Ввод: nums = [0, 0, 0]
     Вывод: 0
     Объяснение: Ответом может быть 0, 1 или 2, но возвращаем наименьший индекс.

     */


}