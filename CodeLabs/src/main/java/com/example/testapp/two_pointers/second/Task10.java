package com.example.testapp.two_pointers.second;

import java.util.*;

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
        nums.addAll(Arrays.asList("a"," ","b"," ", " ", "c","#","#","#","#","#","#"));
        // " " -> %20
        makeTask(nums, 11);
    }

    static void makeTask(List<String> nums, int limit) {
        int p1 = 0;
        int p2 = 0;

        int whiteSpacesCount = 0;

        while (p2 < limit) {
            if (nums.get(p1).equals(" ") && !nums.get(p2).equals(" ")) {
                whiteSpacesCount++;
                nums.add(" ");
                nums.remove(p1);
                nums.addAll(p1, Arrays.asList("%", "2", "0"));
            }
            if (!nums.get(p1).equals(" ")) {
                p1++;
            }
            p2++;
            System.out.println(nums.toString());
        }

        System.out.println("finish " + nums.subList(0, nums.size() - whiteSpacesCount*3));
    }
}
