package com.example.testapp.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Scratch {
    public static void main(String[] args) {

        List<Integer> nums1 = Arrays.asList(2,2,3,4);
        List<Integer> nums2 = Arrays.asList(3,2,4,2);

        // Ввод: nums1=[1,2,3], nums2=[1,2,3]


        System.out.println("-----------input------------");
        System.out.println(nums1);
        System.out.println(nums2);
        System.out.println("-----------------------");

        System.out.println(doSomething(nums1, nums2));
    }

    /**
     Даны два массива целых чисел nums1 и nums2 одинаковой длины.
     Для каждого префикса нужно посчитать число
     общих элементов без учета кратности.

     "Без учета кратности" - это значит, что присутствие
     одного и того же числа в префиксах считается
     только один раз независимо от количества повторов.

     Пример 1:

     Ввод:
     nums1 = [2,2,3,4],
     nums2 = [3,2,4,2]
     Вывод: [0,1,2,3]
     Объяснение:
     0 = [2] и [3] имеют 0 общих элементов
     1 = [2,2] и [3,2] имеют 1 общий элемент (2)
     2 = [2,2,3] и [3,2,4] имеют 2 общих элемента (2,3)
     3 = [2,2,3,4] и [3,2,4,2] имеют 3 общих элемента (2,3,4)
     (0,1,2,3)
     */

    public static List<Integer> doSomething(List<Integer> nums1, List<Integer> nums2) {

        List<Integer> result = new ArrayList<>();
        // HashMap<Integer, Integer> commonElements = new HashMap<>();
        int[] nums1Array = new int[9];
        //        2,2,3,4
        //        3,2,4,2
        // result   0,1,2,3
        int commonElementsCounter = 0;
        int p1 = 0;
        while (p1 < nums1.size()) {
            System.out.println("----------");
            nums1Array[nums1.get(p1)] = nums1Array[nums1.get(p1)] + 1;
            nums1Array[nums2.get(p1)] = nums1Array[nums2.get(p1)] + 1;

            // commonElements.put(nums1.get(p1), commonElements.getOrDefault(nums1.get(p1), 0) + 1);
//            if (commonElements.getOrDefault(nums1.get(p1), 0) > 1) {
//                commonElementsCounter++;
//            }

            // commonElements.put(nums2.get(p1), commonElements.getOrDefault(nums2.get(p1), 0) + 1);
//            if (commonElements.getOrDefault(nums2.get(p1), 0) > 1) {
//                commonElementsCounter++;
//            }
            System.out.println(Arrays.toString(nums1Array));
            result.add(commonElementsCounter);
            p1++;
        }
        return result;
    }
}