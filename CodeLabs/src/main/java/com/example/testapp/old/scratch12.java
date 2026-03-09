package com.example.testapp.old;

class Scratch12 {
    public static void main(String[] args) {
        String before1 = "abcd";
        String before2 = "abcde";

        System.out.println(before1);
        System.out.println(before2);

        // System.out.println(doSomething(before1, before2));
    }

    /*
    Даны две строки s и t.
    Строки считаются похожими, если они уже равны или могут стать равными
    после ровно одного изменения:
    вставки, удаления или замены одного символа.
    Нужно вернуть true,
    если строки похожи, иначе — false.

    Ввод: s = "iq", t = "ieq"
    Вывод: true
    Объяснение: можно добавить один символ и получить равные строки s = t

    Ввод: s = "abcd", t = "abcdef"
    Вывод: false
    Объяснение: Необходимо добавить два символа, чтобы строки стали равны.
    */

//    static Boolean doSomething(String a, String b) {
//
//        // ['a', ' ', ' ', 'b', ' ', 'c', ' ', ' ', ' ']
//
//        int pointer1 = 0;
//        int pointer2 = 0;
//
//        while (pointer1 < a.length()) {
//            if (before.charAt(start) == before.charAt(end)) {
//                start++;
//                end--;
//            } else if (before.charAt(start + 1) == before.charAt(end)) {
//                start++;
//                start++;
//                end--;
//                countOfDeletedSymbols++;
//            } else if (before.charAt(start) == before.charAt(end - 1)) {
//                start++;
//                end--;
//                end--;
//                countOfDeletedSymbols++;
//            } else {
//                return false;
//            }
//        }
//
//        return countOfDeletedSymbols <= 1;
//    }


}