package com.example.testapp.arrays_and_matrix.prefix_array;


import java.util.ArrayList;
import java.util.List;

class Scratch11 {
    public static void main(String[] args) {
        
    }

    /**
     * Реализуй структуру данных,
     * которая позволяет быстро находить сумму всех
     * элементов на отрезке [l, r] (включая границы).
     * При этом массив не изменяется.
     *
     * Другими словами, нужно реализовать:
     *
     *     Конструктор (вызывается один раз).
     *     Метод sum (вызывается многократно, поэтому он должен быть максимально быстрым).
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