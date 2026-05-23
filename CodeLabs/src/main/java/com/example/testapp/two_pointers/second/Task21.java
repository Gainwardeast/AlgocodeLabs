package com.example.testapp.two_pointers.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task21 {
    /*
            Общие элементы массивов
            легко
            # решено

            Даны два отсортированных по возрастанию массива nums1 и nums2.
            Необходимо вернуть новый массив nums3,
            который содержит все общие элементы из nums1 и nums2.

            Результат должен быть также отсортирован по возрастанию.
            Если элементы встречаются в массивах несколько раз,
            то их нужно продублировать в ответе.

            Пример 1:
            Ввод: nums1 = [-3,2,2,5,8,19,31],
            nums2 = [1,2,2,2,6,19,52]
            Вывод: [2,2,19]

            Пример 2:
            Ввод: nums1 = [-5,4], nums2 = [1,2]
            Вывод: []

            Пример 3:
            Ввод: nums1 = [], nums2 = [1,2]
            Вывод: []
    * */

    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(-3,2,2,5,8,19,31);
        List<Integer> nums2 = Arrays.asList(1,2,2,2,6,19,52);
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

            if(num1 < num2){
                pNums1++;
                continue;
            }

            if(num2 < num1){
                pNums2++;
                continue;
            }

            if(num1 == num2){
                result.add(num1);
                pNums1++;
                pNums2++;
            }
        }
        return result;
    }
}
