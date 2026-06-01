package com.example.testapp.hash_table.second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Task8 {

    /*
        Слово - анаграмма
        легко
        # решено

        Даны две строки s и t,
        нужно вернуть true,
        если t является анаграммой s, и false в противном случае.

        Анаграмма — это слово или фраза,
        образованная путем перестановки букв другого слова или фразы,
        с использованием всех исходных букв ровно один раз.

        Пример 1:
        Ввод: s="hello", t="lolhe"
        Вывод: true
        Пример 2:
        Ввод: s="car", t="cat"
        Вывод: false
        Пример 3:
        Ввод: s="abc", t="abcc"
        Вывод: false
        */

    public static void main(String[] args) {
        // Ввод: s="hello", t="lolhe"

        String stringA = "hello";
        String stringB = "lolze";

        makeTask(stringA, stringB);

    }

    static void makeTask(String stringA, String stringB) {
        int[] characters = new int[50];
        boolean result = true;
        for(Character character : stringA.toCharArray()){
            characters[character - 'a']++;
        }

        for(Character character : stringB.toCharArray()){
            characters[character - 'a']--;
        }

        for(int character : characters){
            if(character != 0){
                result = false;
                break;
            }
        }

        System.out.println(result);
    }


}