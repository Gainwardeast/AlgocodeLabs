package com.example.testapp.two_pointers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Scratch8 {
    public static void main(String[] args) {
        Character[] before = {'a', ' ', ' ', 'b', ' ', 'c', ' ', ' ', ' '};
        //Character[] before = {' ', ' ', ' ', ' '};
        List<Character> characters = Arrays.asList(before);

        System.out.println(Arrays.toString(before));

        System.out.println("after -> " + doSomething(characters));
    }

    /*
        Дан массив символов chars.
        Замените все подряд идущие пробелы (в том числе в начале и в конце)
        на один пробел.
        Все изменения должны быть внесены в исходный массив (без создания нового).
        Верните изменённый массив.
        Пример 1:
        Ввод: chars =
        ['a', ' ', ' ', 'b', ' ', 'c', ' ', ' ', ' ']
        ['a', ' ', 'b',' ',  ' ', 'c', ' ', ' ', ' ']
        ['a', ' ', 'b',' ',  'c',' ',  ' ', ' ', ' ']
        Вывод: ['a', ' ', 'b', ' ', 'c', ' ']
        Пример 2:
        Ввод: chars = ['z', 'e', 'r', 'o']
        Вывод: ['z', 'e', 'r', 'o']
        Пример 3:
        Ввод: nums = [' ', ' ', ' ', ' ']
        Вывод: Вывод: [' ']
    */

    static List<Character> doSomething(List<Character> characters) {
        // ['a', ' ', ' ', 'b', ' ', 'c', ' ', ' ', ' ']
        int slow = 0;
        int fast = 0;
        int spaces = 0;

        while (fast < (characters.size())) {
            System.out.println("slow " + slow);
            System.out.println("fast " + fast);
            System.out.println("characters.get(fast) [" + characters.get(fast) + "]");
            System.out.println("characters.get(slow) [" + characters.get(slow) + "]");

            if (characters.get(fast) != ' ') {
                spaces = 0;
            } else {
                spaces++;
            }
            System.out.println("spaces " + spaces);

            if (spaces <= 1) {
                Collections.swap(characters, slow, fast);
                System.out.println("swap ");
                slow++;
            }

            fast++;
            System.out.println(characters);
            System.out.println("-----------------------");
        }

        return characters.subList(0, slow);
    }

//            while (p1 < (characters.size())) {
//        System.out.println(p1);
//        System.out.println(p2);
//
//        if ((p1 < characters.size() - 1) && characters.get(p1) == ' ') {
//            Collections.swap(characters, p1, p1 + 1);
//        } else {
//            p2++;
//        }
//
//        p1++;
//        System.out.println(characters);
//        System.out.println("-----------------------");
//    }

}