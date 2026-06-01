package com.example.testapp.hash_table.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Task12 {

    /*
        Общий префикс двух массивов
        средне
        Даны два целочисленных массива nums1 и nums2 длины n.
        Оба массива содержат только числа от 1 до n включительно,
        при этом каждое число обязательно встречается
        ровно один раз в каждом из массивов.
        Нужно найти общий префиксный массив для nums1 и nums2.
        Префиксный массив nums1иnums2— это массив nums3,
        такой что nums3[i] равен количеству чисел,
        которые присутствуют на индексе i или до него как в nums1, так и в nums2.

        Пример 1:
        Ввод:
        nums1=[2,1,3,4,5],
        nums2=[3,1,2,5,4]
        Вывод: [0,1,3,3,5]
        Объяснение:
        0 = [2] и [3] имеют 0 общих элементов
        1 = [2,1] и [3,1] имеют 1 общий элемент (1)
        3 = [2,1,3] и [3,1,2] имеют 3 общих элемента (1,2,3)
        3 = [2,1,3,4] и [3,1,2,5] имеют 3 общих элемента (1,2,3)
        5 = [2,1,3,4,5] и [3,1,2,5,4] имеют 5 общих элементов (1,2,3,4,5)
        Пример 2:
        Ввод: nums1=[1,2,3], nums2=[1,2,3]
        Вывод: [1,2,3]
        */

    public static void main(String[] args) {
        // Ввод: s="hello", t="lolhe"
        // 2,1,3,4,5
        // 3,1,2,5,4
        List<Integer> nums1 = Arrays.asList(2, 1, 3, 4, 5);
        List<Integer> nums2 = Arrays.asList(3, 1, 2, 5, 4);

        makeTask(nums1, nums2);
    }

    static void makeTask(
            List<Integer> nums1,
            List<Integer> nums2
    ) {
        HashMap<Integer, Integer> commonNumbers = new HashMap();
        List<Integer> nums3 = new ArrayList<>();

        int commonCount = 0;
        for (int p1 = 0; p1 < nums1.size(); p1++) {
            int nums1Number = nums1.get(p1);
            int nums2Number = nums2.get(p1);
            commonNumbers.put(nums1Number, commonNumbers.getOrDefault(nums1Number, 0) + 1);
            if (commonNumbers.get(nums1Number) == 2) {
                commonCount++;
            }

            commonNumbers.put(nums2Number, commonNumbers.getOrDefault(nums2Number, 0) + 1);
            if (commonNumbers.get(nums2Number) == 2) {
                commonCount++;
            }

            nums3.add(commonCount);
        }

        System.out.println(nums3);
    }
}