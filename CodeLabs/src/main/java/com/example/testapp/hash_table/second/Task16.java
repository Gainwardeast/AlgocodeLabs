package com.example.testapp.hash_table.second;

import java.util.ArrayList;
import java.util.List;


class Task16 {

    /*
        Поиск анаграмм
        средне

        Даны строки s и t.
        Нужно найти все индексы в строке s,
        с которых начинается подстрока —
        анаграмма строки t, и
        вернуть их в порядке возрастания.
        Считается, что символы могут быть любыми и
        заранее не известны (алфавит не ограничен),
        но на практике строки будут состоять
        только из символов ascii.

        Пример 1:

        Ввод: s = "abacbaab", t = "aab"
        Вывод: [0,4,5]

        Пример 2:

        Ввод: s = "baba", t = "ab"
        Вывод: [0,1,2]


        */

    public static void main(String[] args) {

        makeTask("abacbaab", "aab");
    }

    static void makeTask(String target, String anagram) {
        System.out.println("target = " + target);
        List<Integer> result = new ArrayList<>();

        // "abacbaab", "aab"
        int p = 0;
        while ((p + anagram.length()) <= (target.length())) {
            int p2 = p + anagram.length();
            String targetSubstring = target.substring(p, p2);
            if(isAnagram(targetSubstring, anagram)){
                result.add(p);
            }
            System.out.println("targetSubstring = " + targetSubstring);
            p++;
        }
        System.out.println("finish");
    }

    static boolean isAnagram(String targetSubstring, String anagram) {
        int[] charsCount = new int[26];
        for(Character character : targetSubstring.toCharArray()){
            charsCount[character.charValue() - 'a']++;
        }

        for(Character character : anagram.toCharArray()){
            charsCount[character.charValue() - 'a']--;
        }
        int result = 0;
        for(int value : charsCount){
            result += value;
        }
        return result == 0;
    }
}