package com.example.testapp.two_pointers.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task10 {
    /*
        URL-ификация строки
        средне
        # решено

        Дан список s, представляющий URL-адрес (буквы и пробелы).
        Нужно заменить все пробелы в первых k символах на %20,
        используя свободное место в конце списка
        и вернуть изменённый список s в качестве ответа.

        Пример 1:

        Ввод: s = ["h","e","l","l","o"," ","w","o","r","l","d","#","#"], k = 11
        Вывод: ["h","e","l","l","o","%","2","0","w","o","r","l","d"]

        Пример 2:

        Ввод: s = ["a"," ","b"," ", " ", "c","#","#","#","#","#","#"], k = 6
        Вывод: ["a","%","2","0","b","%","2","0","%","2","0", "c"]

    * */

    public static void main(String[] args) {
        List<String> nums = new ArrayList<>();
        nums.addAll(Arrays.asList("h", "e", "l", "l", "o", " ", "w", "o", "r", "l", "d", "#", "#"));
        // " " -> %20
        makeTask(nums, 11);
    }

    static void makeTask(List<String> nums, int limit) {
        int p1 = 0;
        int p2 = 0;

        while (p2 < nums.size()) {
            if (nums.get(p1).equals(" ") && !nums.get(p2).equals(" ")) {
                Collections.swap(nums, p1, p2);
//                nums.add(p1, "0");
//                nums.add(p1, "2");
//                nums.add(p1, "%");
            }
            if (!nums.get(p1).equals(" ")) {
                p1++;
            }
            p2++;
        }
        List<String> result = nums.subList(0, limit);
        System.out.println("finish");
    }
}
