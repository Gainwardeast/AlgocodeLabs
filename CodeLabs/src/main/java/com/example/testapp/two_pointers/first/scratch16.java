package com.example.testapp.two_pointers.first;

import java.util.Arrays;

class Scratch16 {
    public static void main(String[] args) {

        String before = "hello";

        // Вывод для проверки
        System.out.println(before);

        System.out.println(doSomething(before));
    }

    /**
     * Дана строка s. Нужно вернуть true, если после перестановки символов в строке может получится палиндром, и false в противном случае.
     * <p>
     * Палиндром — это строка, которая читается одинаково слева направо и справа налево.
     * <p>
     * Пример 1:
     * <p>
     * Ввод: s = "cabab"
     * Вывод: true
     * Объяснение: можно переставить буквы и получить палиндром "abcba" или "bacab"
     */

    public static boolean doSomething(String before) {

        int[] letters = new int[26];

        int p1 = 0;
        while (p1 < before.length()) {
            int index = before.charAt(p1) - 'a';
            letters[index] = letters[index] + 1;
            p1++;
        }

        System.out.println(Arrays.toString(letters));

        int notPairedLetters = 0;
        for(int count : letters){
            if(count % 2 != 0){
                notPairedLetters++;
            }
        }

        return notPairedLetters <= 1;
    }

    private static int[] convertWordToKey(String word) {
        int[] keys = new int[26];
        char[] chars = word.toCharArray();
        for (char letter : chars) {
            keys[letter - 'a'] = keys[letter - 'a'] + 1;
        }
        return keys;
    }
}