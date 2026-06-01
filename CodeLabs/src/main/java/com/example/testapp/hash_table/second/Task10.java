package com.example.testapp.hash_table.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Task10 {

    /*
        Перестановка букв
        средне
        # решено
        Дана строка s.
        Нужно вернуть true,
        если после перестановки символов в строке может получится палиндром,
        и false в противном случае.

        Палиндром — это строка,
        которая читается одинаково слева направо и справа налево.

        Пример 1:
        Ввод: s = "cabab"
        Вывод: true
        Объяснение: можно переставить буквы и получить палиндром "abcba" или "bacab"
        Пример 2:
        Ввод: s = "hello"
        Вывод: false
        */

    public static void main(String[] args) {
        // Ввод: s="hello", t="lolhe"
        String targetString = "hello";
        makeTask(targetString);
    }

    static void makeTask(String targetString) {
        int[] key = new int[26];

        for(Character character : targetString.toCharArray()){
            key[character - 'a']++;
        }

        int numberOfSoloChars = 0;
        for(Integer counter : key){
            if(counter == 1){
                numberOfSoloChars++;
            }
        }

        System.out.println(numberOfSoloChars);
        System.out.println(numberOfSoloChars <= 1);
    }
}