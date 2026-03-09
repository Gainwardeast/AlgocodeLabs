package com.example.testapp.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Scratch15 {
    public static void main(String[] args) {

//        List<String> ticketList = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art");
        List<String> ticketList = Arrays.asList("ab", "bat", "ba", "tab", "ear", "apt");
//        for (String[] ticket : tickets) {
//            ticketList.add(Arrays.asList(ticket));
//        }

        // Вывод для проверки
        System.out.println(ticketList);

        System.out.println(groupAnagrams(ticketList));
    }

    /**
     * Дан массив строк strs и нужно сгруппировать анаграммы вместе.
     * Ответ можно вернуть в любом порядке.
     * <p>
     * Анаграмма — это слово или фраза, образованная путем
     * перестановки букв другого слова или фразы,
     * с использованием всех исходных букв ровно один раз.
     * <p>
     * Пример 1:
     * Ввод: strs=["ab","bat","ba","tab","ear","apt"]
     * Вывод:[["ab",ba"],["bat","tab"],["apt"],["ear"]]
     */

    public static List<List<String>> groupAnagrams(List<String> strings) {

        HashMap<Integer, List<String>> groupedStrings = new HashMap<>();

        int p1 = 0;
        while (p1 < (strings.size())) {
            String word = strings.get(p1);
            int[] key = convertWordToKey(word);
            int keyHash = Arrays.hashCode(key);

            System.out.println(word);
            System.out.println("keyHash " + keyHash);
            System.out.println(Arrays.toString(key));

            List<String> value = groupedStrings.getOrDefault(keyHash, new ArrayList<>());
            System.out.println("ArrayList<String> value => " + value);
            value.add(word);

            groupedStrings.put(keyHash, value);
            p1++;
        }

        List<List<String>> result = new ArrayList<>();
        for (Integer key : groupedStrings.keySet()) {
            result.add(groupedStrings.get(key));
        }
        return result;
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