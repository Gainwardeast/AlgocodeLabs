package com.example.testapp.hash_table.second;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Task9 {

    /*
        Группировка анаграмм
        средне
        # решено
        Дан массив строк strs и нужно сгруппировать анаграммы вместе.
        Ответ можно вернуть в любом порядке.
        Анаграмма — это слово или фраза,
        образованная путем перестановки букв другого слова или фразы,
        с использованием всех исходных букв ровно один раз.
        Пример 1:
        Ввод: strs=["ab","bat","ba","tab","ear","apt"]
        Вывод:[["ab",ba"],["bat","tab"],["apt"],["ear"]]
        Пример 2:
        Ввод: s=["hello"]
        Вывод: [["hello"]]
        */

    public static void main(String[] args) {
        // Ввод: s="hello", t="lolhe"
        List<String> strings = Arrays.asList("ab","bat","ba","tab","ear","apt");
        makeTask(strings);
    }

    static void makeTask(List<String> strings) {
        HashMap<Integer, List<String>> wordsMap = new HashMap<>();
        for(String word : strings){
            int key = Arrays.hashCode(convertWordToKey(word));

            List<String> group = wordsMap.getOrDefault(key, new ArrayList<>());
            group.add(word);
            wordsMap.put(key, group);
        }

        List<List<String>> result = new ArrayList<>();
        for(Integer key : wordsMap.keySet()){
            result.add(wordsMap.get(key));
        }

        System.out.println(result);
    }

    static int[] convertWordToKey(String word){
        int[] key = new int[26];
        for(Character character : word.toCharArray()){
            key[character - 'a'] = key[character - 'a']+1;
        }
        return key;
    }


}