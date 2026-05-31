package com.example.testapp.hash_table.second;

import java.util.HashMap;

class Task5 {

    /*
            Изоморфные строки
            средне
            # решено
            Даны две строки s, t и нужно вернуть true если они изоморфны и false в обратном случае.
            Строки s и t изоморфны, если символы в s можно заменить так, чтобы получить t.
            ВАЖНО: каждый символ в строке должен быть заменен другим символом ,
            при этом порядок символов должен сохраняться.
            Разные символы не могут заменяться на один и тот же, но символ может оставаться неизменным.

            Пример 1:
            Ввод: s = "abacoo", t = "gogbkk"
            Вывод: true
            Пример 2:
            Ввод: s = "aa", t = "ab"
            Вывод: false
            Объяснение: буква "a" соответcтвует как символу "a", так и "b"
            Пример 3:
            Ввод: s = "ab", t = "aa"
            Вывод: false
            Объяснение: буква "a" соответcтвует как символу "a", так и "b"
        */

    public static void main(String[] args) {
        String stringA = "abacoo";
        String stringB = "gogbkk";

        System.out.println(makeTask(stringA, stringB));
    }

    static Boolean makeTask(String stringA, String stringB) {
        HashMap<Character, Character> charsPairs = new HashMap<>();
        for (int p = 0; p < stringA.length(); p++) {
            Character mirrorChar = charsPairs.get(stringA.charAt(p));
            if (mirrorChar == null) {
                charsPairs.put(stringA.charAt(p), stringB.charAt(p));
            } else if (mirrorChar != stringB.charAt(p)) {
                return false;
            }
        }
        return true;
    }


}