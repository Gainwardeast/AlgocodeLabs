package com.example.testapp

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Правильный палиндром
 средне
 # решено

 Дана строка s. Верните true, если s является палиндромом,
 или false в противном случае.
 Фраза является палиндромом,
 если после преобразования всех заглавных букв в строчные и удаления всех символов,
 кроме букв и цифр, она читается одинаково слева направо и справа налево.
 Буквенно-цифровые символы включают латинские буквы и цифры.
 Пример 1:
 Ввод: s = "A man, a plan, a canal: Panama"
 Вывод: true
 Объяснение: строка "amanaplanacanalpanama" является палиндромом
 */

class Scratch {
    public static void main(String[] args) {
        List<Integer> before = Arrays.asList(2,3,4,5);
        System.out.println(before);


        System.out.println(doSomething(before));
    }

    private static Integer doSomething(List<Integer> before) {
        int p1 = 0;
        int p2 = before.size() - 1;

        int maxResult = 0;

        while (p1 <= p2) {
            System.out.println(before.get(p1));
            System.out.println(before.get(p2));
//            if ((before.get(p1) + before.get(p2)) == target) {
//                result.add(p1+1);
//                result.add(p2+1);
//                return result;
//            }
            int value1 = before.get(p1);
            int value2 = before.get(p2);

            int sum = Math.min(before.get(p1), before.get(p2)) * (p2 - p1);
            maxResult = Math.max(sum, maxResult);

            if (value1 < value2) {
                p1++;
            } else {
                p2--;
            }
            System.out.println("=================maxResult = "+maxResult);
        }

        return maxResult;
    }


}