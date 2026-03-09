package com.example.testapp.hash_table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Scratch33 {
    public static void main(String[] args) {
        // strs = [];
        // List<String> strings = Arrays.asList("ab", "bat", "ba", "tab", "ear", "apt");
        List<String> strings = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art");

        System.out.println("before " + strings);
        System.out.println("after " + doSomething(strings));
    }

    /*
    Дана строка s. Нужно вернуть true, если после перестановки символов в строке может получится палиндром, и false в противном случае.

    Палиндром — это строка, которая читается одинаково слева направо и справа налево.

    Пример 1:

    Ввод: s = "cabab"
    Вывод: true
    Объяснение: можно переставить буквы и получить палиндром "abcba" или "bacab"
    */

    static ArrayList<List<String>> doSomething(List<String> strings) {

        Set<String> nonPairedStrings = new HashSet<>(strings);

        ArrayList<List<String>> groupedStrings = new ArrayList();

        int p1 = 0;
        int p2 = strings.size() - 1;
        while (p1 < (strings.size() - 1)) {
            if (p2 < 0) break;
            String stringA = strings.get(p1);
            String stringB = strings.get(p2);
            if (nonPairedStrings.contains(stringA) && nonPairedStrings.contains(stringB) && isAnagram(stringA, stringB)) {
                p2 = strings.size() - 1;
                p1++;
                groupedStrings.add(Arrays.asList(stringA, stringB));
                nonPairedStrings.remove(stringA);
                nonPairedStrings.remove(stringB);
            } else {
                p2--;
            }
//            System.out.println("debug  p1 " + p1);
//            System.out.println("debug  p2 " + p2);
//            System.out.println("debug  " + groupedStrings);


        }

        for (String string : nonPairedStrings) {
            groupedStrings.add(Arrays.asList(string));
        }

        return groupedStrings;
    }

    static boolean isAnagram(String stringA, String stringB) {
        if (stringA.length() != stringB.length()) {
            return false;
        }

        int count[] = new int[26];

        for (Character character : stringA.toCharArray()) {
            count[character - 'a']++;
        }

        for (Character character : stringB.toCharArray()) {
            count[character - 'a']--;
        }

        for (int i : count) {
            if (i != 0) return false;
        }

        return true;
    }

//    static boolean doSomething(String stringA, String stringB) {
//
//        if (stringA.length() != stringB.length()) {
//            return false;
//        }
//
//        HashMap<Character, Integer> mapA = new HashMap();
//        for (Character character : stringA.toCharArray()) {
//            mapA.put(character, mapA.getOrDefault(character, 1) + 1);
//        }
//
//        HashMap<Character, Integer> mapB = new HashMap();
//        for (Character character : stringB.toCharArray()) {
//            mapB.put(character, mapB.getOrDefault(character, 1) + 1);
//        }
//
//        return mapA.equals(mapB);
//    }
}