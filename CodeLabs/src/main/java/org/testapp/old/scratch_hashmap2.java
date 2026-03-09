package com.example.testapp.old;

class Scratch {
    public static void main(String[] args) {
        String a = "rat";
        String b = "car";

        System.out.println(doSomething(a, b));
    }

    /*
    Даны две строки s и t, нужно вернуть true, если t является анаграммой s, и false в противном случае.
    Анаграмма — это слово или фраза, образованная путем перестановки букв
    другого слова или фразы,
    с использованием всех исходных букв ровно один раз.

    Пример 1:
    Ввод: s="hello", t="lolhe"
    Вывод: true
    */

    static boolean doSomething(String stringA, String stringB) {

        if (stringA.length() != stringB.length()) {
            return false;
        }

        int count[] = new int[26];

        for(Character character : stringA.toCharArray()){
            count[character - 'a' ]++;
        }

        for(Character character : stringB.toCharArray()){
            count[character - 'a' ]--;
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