package com.example.testapp.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Scratch {
    public static void main(String[] args) {

//        List<Integer> nums1 = Arrays.asList(2, 1, 3, 4, 5);
//        List<Integer> nums2 = Arrays.asList(3, 1, 2, 5, 4);

        List<Integer> nums1 = Arrays.asList(1, 2, 3);
        List<Integer> nums2 = Arrays.asList(1, 2, 3);

        // Ввод: nums1=[1,2,3], nums2=[1,2,3]


        System.out.println("-----------input------------");
        System.out.println(nums1);
        System.out.println(nums2);
        System.out.println("-----------------------");

        System.out.println(doSomething(nums1, nums2));
    }

    /**
     * Даны два целочисленных массива nums1 и nums2 длины n.
     * Оба массива содержат только числа от 1 до n включительно,
     * при этом каждое число обязательно встречается ровно один раз в каждом из массивов.
     * <p>
     * Нужно найти общий префиксный массив для nums1 и nums2.
     * <p>
     * Префиксный массив nums1иnums2— это массив nums3,
     * такой что nums3[i] равен количеству чисел,
     * которые присутствуют на индексе i или до него
     * как в nums1, так и в nums2.
     * <p>
     * Пример 1:
     * <p>
     * Ввод: nums1=[2,1,3,4,5], nums2=[3,1,2,5,4]
     * Вывод: [0,1,3,3,5]
     * Объяснение:
     * 0 = [2] и [3] имеют 0 общих элементов
     * 1 = [2,1] и [3,1] имеют 1 общий элемент (1)
     * 3 = [2,1,3] и [3,1,2] имеют 3 общих элемента (1,2,3)
     * 3 = [2,1,3,4] и [3,1,2,5] имеют 3 общих элемента (1,2,3)
     * 5 = [2,1,3,4,5] и [3,1,2,5,4] имеют 5 общих элементов (1,2,3,4,5)
     */

    public static List<Integer> doSomething(List<Integer> nums1, List<Integer> nums2) {

        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> commonElements = new HashMap<>();
//        2, 1, 3, 4, 5
//        3, 1, 2, 5, 4
        int commonElementsCounter = 0;
        int p1 = 0;
        while (p1 < nums1.size()) {

            commonElements.put(nums1.get(p1), commonElements.getOrDefault(nums1.get(p1), 0) + 1);
            if (commonElements.getOrDefault(nums1.get(p1), 0) > 1) {
                commonElementsCounter++;
            }

            commonElements.put(nums2.get(p1), commonElements.getOrDefault(nums2.get(p1), 0) + 1);
            if (commonElements.getOrDefault(nums2.get(p1), 0) > 1) {
                commonElementsCounter++;
            }

            result.add(commonElementsCounter);
            p1++;
        }
        return result;
    }
}