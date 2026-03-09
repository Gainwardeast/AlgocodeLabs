package com.example.testapp.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Scratch {
    public static void main(String[] args) {
        String[] before = {"present", "predicate", "prepare"};
        //Character[] before = {' ', ' ', ' ', ' '};
        List<String> strings = Arrays.asList(before);

        System.out.println(Arrays.toString(before));

        System.out.println("after -> " + doSomething(strings));
    }

    /*
        Дан массив строк strs.
        Нужно вернуть самую длинную строку,
        которая является префиксом всех строк из strs.
        Если общего префикса нет, верни пустую строку "".
        Пример 1:
        Ввод: strs = ["present","predicate","prepare"]
        Вывод: "pre"
        Пример 2:
        Ввод: strs = ["dog","cat","bike"]
        Вывод: ""
        Объяснение: нет общего префикса.
    */

    static List<String> doSomething(List<String> characters) {
        // ['a', ' ', ' ', 'b', ' ', 'c', ' ', ' ', ' ']
        List<Integer> indexes = new ArrayList<>();
        characters.forEach(s -> {
            indexes.add(0);
        });

        List<Character> result = new ArrayList<>();
        int pointer = 0;
        while(pointer < characters.size()){

        }

        Character character = characters.get(0).charAt(0);
//        character == characters.get(1).charAt(0)
//        character == characters.get(2).charAt(0)

//        while (fast < (characters.size())) {
////            System.out.println("slow " + slow);
////            System.out.println("fast " + fast);
////            System.out.println("characters.get(fast) [" + characters.get(fast) + "]");
////            System.out.println("characters.get(slow) [" + characters.get(slow) + "]");
//
//        }

        return characters;
    }


}