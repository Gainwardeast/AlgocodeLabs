package com.example.testapp.two_pointers.first;

/**
 * Даны две строки s и t.
 * Строки считаются похожими,
 * если они уже равны или могут стать равными после ровно одного изменения:
 * вставки, удаления или замены одного символа. Нужно вернуть true, если строки похожи, иначе — false.
 * <p>
 * Пример 1:
 * <p>
 * Ввод: s = "iq", t = "ieq"
 * Вывод: true
 * Объяснение: можно добавить один символ и получить равные строки s = t
 * <p>
 * Ввод: s = "qwe", t = "qwe"
 * Вывод: true
 */

class Scratch41 {
    public static void main(String[] args) {
        String before = "qwertyxx";
        String before1 = "qwerty";
        System.out.println(before);
        System.out.println(before1);


        System.out.println(doSomething(before, before1));
    }

    private static boolean doSomething(String before, String before1) {
        if (Math.abs(before.length() - before1.length()) > 1) {
            // нужна вставка или удаление символа
            return false;
        }

        int p1 = 0;
        int p2 = 0;
        int countOfCharsToChange = 0;
        while (p1 < before.length() && p2 < before1.length()) {
            System.out.println(before.charAt(p1));
            System.out.println(before1.charAt(p2));
            if (before.charAt(p1) != before1.charAt(p2)) {
                countOfCharsToChange++;
                if (before.length() == before1.length()) {
                    p1++;
                    p2++;
                } else if (before.length() > before1.length()) {
                    p1++;
                } else {
                    p2++;
                }
            } else {
                p1++;
                p2++;
            }
        }

        if (p1 < before.length() || p2 < before1.length()) {
            countOfCharsToChange++;
        }

        return countOfCharsToChange <= 1;
    }
}