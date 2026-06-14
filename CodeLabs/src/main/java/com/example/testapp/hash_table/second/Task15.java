package com.example.testapp.hash_table.second;

import java.util.Arrays;
import java.util.List;

class Task15 {

    /*
        Индекс Хирша

        Дан массив целых чисел citations,
        где citations[i] — число цитирований,
        полученных исследователем для его i-й статьи.
        Нужно найти h-индекс исследователя.

        H-индекс (индекс Хирша) определяется
        как максимальное значение h,
        при котором данный исследователь опубликовал не менее h статей,
        каждая из которых была процитирована не менее h раз.

        Пример 1:
        Ввод: citations=[10,1,8,0,3]
        Вывод: 3
        Объяснение: есть 3 статьи, которые были процитированы >= 3 раз (для 4 уже нет)

        Пример 2:
        Ввод: citations=[100,200]
        Вывод: 2
        Объяснение: есть 2 статьи, которые были процитированы >= 2 раз

        */

    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(10, 1, 8, 0, 3);
        // List<Integer> nums1 = Arrays.asList(100, 200);

        makeTask(nums1);
    }

    static void makeTask(List<Integer> nums1) {
        int n = nums1.size();
        int[] buckets = new int[n+1];
        for(int number: nums1){
            if(number > n){
                buckets[n]++;
            }else{
                buckets[number]++;
            }
        }

        int totalH = 0;
        for(int h = n; n>=0; h--){
            totalH = totalH + buckets[h];
            if(totalH >= h) {
                break;
            }
        }

        System.out.println("finish totalH => "+totalH);

//        for (int h = 1; h <= nums1.size(); h++) {
//            int result = 0;
//            for (int p = 0; p < nums1.size(); p++) {
//                if (h <= nums1.get(p)) {
//                    result++;
//                }
//            }
//            if(result >= h){
//                System.out.println("h => "+ h);
//                break;
//            }
//        }

        // System.out.println(nums3);
    }
}