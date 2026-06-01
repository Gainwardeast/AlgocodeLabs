package com.example.testapp.hash_table.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Task13 {

    /*
        Общий префикс без учета кратности
        средне
        Даны два массива целых чисел nums1 и nums2 одинаковой длины.
        Для каждого префикса нужно посчитать
        число общих элементов без учета кратности.
        "Без учета кратности" - это значит,
        что присутствие одного и того же числа в префиксах
        считается только один раз независимо от количества повторов.
        Пример 1:
        Ввод: nums1 = [2,2,3,4], nums2 = [3,2,4,2]
        Вывод: [0,1,2,3]
        Объяснение:
        0 = [2] и [3] имеют 0 общих элементов
        1 = [2,2] и [3,2] имеют 1 общий элемент (2)
        2 = [2,2,3] и [3,2,4] имеют 2 общих элемента (2,3)
        3 = [2,2,3,4] и [3,2,4,2] имеют 3 общих элемента (2,3,4)
        (0,1,2,3)
        Пример 2:
        Ввод:
        nums1 = [3,2,2],
        nums2 = [2,1,2]
        Вывод: [0,1,1]
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