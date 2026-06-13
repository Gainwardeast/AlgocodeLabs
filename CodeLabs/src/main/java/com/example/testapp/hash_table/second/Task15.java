package com.example.testapp.hash_table.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Task15 {

    /*
        Индекс Хирша
        сложно

        Дан массив целых чисел citations, где citations[i] — число цитирований, полученных исследователем для его i-й статьи. Нужно найти h-индекс исследователя.

        H-индекс (индекс Хирша) определяется как максимальное значение h, при котором данный исследователь опубликовал не менее h статей, каждая из которых была процитирована не менее h раз.

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
        // Ввод: s="hello", t="lolhe"
        // 2,1,3,4,5
        // 3,1,2,5,4
        List<Integer> nums1 = Arrays.asList(3,2,2);
        List<Integer> nums2 = Arrays.asList(2,1,2);

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
            commonNumbers.put(nums1Number, commonNumbers.getOrDefault(nums1Number, 0) + 1);
            if (commonNumbers.get(nums1Number) == 2) {
                commonCount++;
            }

            int nums2Number = nums2.get(p1);
            commonNumbers.put(nums2Number, commonNumbers.getOrDefault(nums2Number, 0) + 1);
            if (commonNumbers.get(nums2Number) == 2) {
                commonCount++;
            }


            nums3.add(commonCount);
        }

        System.out.println(nums3);
    }
}