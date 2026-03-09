package com.example.testapp.bi_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Scratch3 {
    public static void main(String[] args) {
        int target = 2;
        int kTarget = 3;
        List<Integer> before = Arrays.asList(1, 3, 5, 6, 8, 9);
        System.out.println(before);


        System.out.println(findKTarget(before, target, kTarget));
    }


    /**
     * Дан массив nums, а также числа k и target.
     * Нужно вернуть k ближайших чисел к target из массива nums,
     * отсортированных в возрастающем порядке.
     * Число a считается ближе к target, чем число b, если:
     * |a - target| < |b - target|
     * |a - target| == |b - target|, но a < b
     * Если k <= 0 или k > len(nums), то нужно вернуть пустой массив в качестве ответа.
     * Пример 1:
     * Ввод: nums = [1,3,5,6,8,9], target = 2, k = 3
     * Вывод: [1,3,5]
     */
    private static List<Integer> findKTarget(List<Integer> before, int target, int kTarget) {

        List<Integer> result = new ArrayList<Integer>();

        int p1 = 0;
        int p2 = before.size() - 1;

        int targetIndex = 0;
        while (p2 - p1 > 1) {
            int middle = (p1 + p2) / 2;
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(middle + " = " + before.get(middle));
            System.out.println("====================");
            if (before.get(middle) > target) {
                p2 = middle;
            } else {
                p1 = middle;
            }
            targetIndex = middle;
        }

        System.out.println("====================");
        System.out.println("firstIndex "+ targetIndex);
        System.out.println("====================");


//          * |a - target| < |b - target|
//          * |a - target| == |b - target|, но a < b


        int minus = targetIndex -1;
        int plus  = targetIndex;
        if((before.get(minus) - target) < (before.get(plus) - target)){
            targetIndex = minus;
        } else {
            targetIndex = plus;
        }
        int counter = 0;
        while(result.size() < kTarget){
            result.add(before.get(targetIndex+ counter));
            counter ++;
        }

        return result;
    }

//    private static Integer findFirstIndex(List<Integer> before, int target) {
//
//        int resultIndex = -1;
//
//        int p1 = 0;
//        int p2 = before.size()-1;
//
//        while (p1 < p2) {
//
//            int middle = (p1 + p2) / 2;
//
//            System.out.println(p1);
//            System.out.println(p2);
//            System.out.println(middle + " = " + before.get(middle));
//            System.out.println("====================");
//
//            if (before.get(middle) ==  target) {
//                p2 = middle-1;
//            } else if(before.get(middle) > target) {
//                p2 = middle -1 ;
//            } else {
//                p1 = middle +1;
//            }
//            resultIndex = middle;
//        }
//        return resultIndex;
//    }

}