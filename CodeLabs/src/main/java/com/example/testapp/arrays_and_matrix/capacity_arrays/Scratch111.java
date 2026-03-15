package com.example.testapp.arrays_and_matrix.capacity_arrays;


import java.util.ArrayList;
import java.util.List;

class Scratch111 {
    public static void main(String[] args) {
        
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
     Пример 1:
     Ввод: nums = [7,3,4,5,5]
     Вывод: 2
     Объяснение: 7+3 = 5+5
     */

    class SuperClass{
        List<Integer> nums = new ArrayList<>();
        List<Integer> preSum = new ArrayList<>();
        SuperClass(List<Integer> nums){
            nums.addAll(nums);
        }

        void sum(int left, int right){

        }
    }
}