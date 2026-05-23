package com.example.testapp.two_pointers.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task22 {
    /*
        Односторонняя разница
        легко
        # решено

        Даны два массива nums1 и nums2,
        отсортированные по возрастанию.

        Необходимо вернуть все элементы из nums1,
        которые не встречаются в nums2,
        в отсортированном по возрастанию порядке.

        Пример 1:

        Ввод: nums1 = [1,2,3,4,5], nums2 = [4,5,6]
        Вывод: [1,2,3]

        Пример 2:

        Ввод: nums1 = [1,2,2,3,3,4], nums2 = [0,0,0,3]
        Вывод: [1,2,2,4]
    * */

    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(1,2,2,3,3,4);
        List<Integer> nums2 = Arrays.asList(0,0,0,3);
        System.out.println(nums1);
        System.out.println(nums2);
        System.out.println(mergeArrays(nums1, nums2));
    }

    static List<Integer> mergeArrays(List<Integer> nums1, List<Integer> nums2) {
        int pNums1 = 0;
        int pNums2 = 0;
        List<Integer> result = new ArrayList<>();
        while (pNums1 < nums1.size() && pNums2 < nums2.size() ) {
            int num1 = nums1.get(pNums1);
            int num2 = nums2.get(pNums2);

            if(num1 == num2){
                pNums1++;
                pNums2++;
                continue;
            }

            if(num1 < num2){
                pNums1++;
                result.add(num1);
                continue;
            }

            if(num2 < num1){
                pNums2++;
                result.add(num2);
            }
        }
        return result;
    }
}
