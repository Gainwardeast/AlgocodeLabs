package com.example.testapp.old;

import java.util.Arrays;
import java.util.List;

class Scratch7 {
    public static void main(String[] args) {
        char[] beforeChar = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '#', '#'};
        Character[] before = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '#', '#'};

        System.out.println(Arrays.toString(beforeChar));
        sortedArray(Arrays.asList(before), 11);

    }

    /*
        Дан список s, представляющий URL-адрес (буквы и пробелы).
        Нужно заменить все пробелы в первых k символах на %20,
        используя свободное место в конце списка
        и вернуть изменённый список s в качестве ответа.
    */

    static void sortedArray(List<Character> chars, int k) {
        // 'a', ' ', 'b', ' ', ' ', 'c', '#', '#', '#', '#', '#', '#'
        // Вывод: ["a","%","2","0","b","%","2","0","%","2","0", "c"]
        // k = 6
        int p1 = chars.size() - 1;

        int p2 = k - 1;

        while (p2 >= 0) {
            if (chars.get(p2) == ' ') {
                chars.set(p1, '0');
                chars.set(p1 - 1, '2');
                chars.set(p1 - 2, '%');
                p1 = p1 - 3;
            } else {
                chars.set(p1, chars.get(p2));
                p1--;
            }
            p2--;
            System.out.println("result -> " + chars);
            System.out.println("-----------------");
        }
        System.out.println("final result -> " + chars);
    }

}