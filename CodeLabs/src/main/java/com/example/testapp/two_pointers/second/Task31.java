
package com.example.testapp.two_pointers.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task31 {
    /*
        URL-ификация строки
        средне
        # решено

        Дан список s, представляющий URL-адрес (буквы и пробелы).
        Нужно заменить все пробелы в первых k символах на %20,
        используя свободное место в конце списка
        и вернуть изменённый список s в качестве ответа.

        Пример 1:

        Ввод: s = ["h","e","l","l","o"," ","w","o","r","l","d","#","#"], k = 11
        Вывод: ["h","e","l","l","o","%","2","0","w","o","r","l","d"]
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
