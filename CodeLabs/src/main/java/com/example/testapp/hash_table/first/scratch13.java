package com.example.testapp.hash_table.first;

import java.util.HashMap;

class Scratch13 {
    public static void main(String[] args) {
        String before1 = "abacoo";
        String before2 = "gogbkk";

        System.out.println(before1);
        System.out.println(before2);

        System.out.println(doSomething(before1, before2));
    }

    /*
        Даны две строки s, t и
        нужно вернуть true если они изоморфны и false в обратном случае.

        Строки s и t изоморфны,
        если символы в s можно заменить так, чтобы получить t.

        ВАЖНО: каждый символ в строке должен быть заменен другим символом ,
        при этом порядок символов должен сохраняться.
        Разные символы не могут заменяться на один и тот же,
        но символ может оставаться неизменным.

    */

    static Boolean doSomething(String a, String b) {
        if (a.length() != b.length()) return false;

        HashMap<Character, Character> aMap = new HashMap();
        HashMap<Character, Character> bMap = new HashMap();

        for (int i = 0; i < a.length(); i++) {
            Character aChar = a.charAt(i);
            Character bChar = b.charAt(i);
            if (aMap.containsKey(aChar) && (aMap.get(a.charAt(i)) != b.charAt(i))) {
                return false;
            }

            if (bMap.containsKey(bChar) && (bMap.get(bChar) != aChar)) {
                return false;
            }

            aMap.put(aChar, bChar);
            bMap.put(bChar, aChar);
        }


        return true;
    }


}