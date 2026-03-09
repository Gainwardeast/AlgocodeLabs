package com.example.testapp.algorithms_and_data_structures.bi_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Scratch2 {
    public static void main(String[] args) {
        // nums1 = [-3,2,2,5,8,19,31],
        // nums2 = [1,2,2,2,6,19,52]4
        // "a",":","-",")","b",":","-",")",")",")","c"
        // List<Character> before = Arrays.asList('a', ':', '-', ')', 'b', ':', '-', ')', ')', ')', 'c');
        List<Character> before = Arrays.asList(':', '-', ':', '-', ')', ')', '(');

        System.out.println(before);


        System.out.println(doSomething(before));
    }

    /*
        Удаление смайликов

        Дан массив символов chars.
        Нужно удалить из него все смайлики,
        подпадающие под регулярку :-\)+|:-\(+,
        и вернуть изменённый массив.
        Смайлики, образовавшиеся после удаления других, удалять не нужно.

        Пример 1:
        :-\)+|:-\(+,
        Ввод: chars = ["a",":","-",")","b",":","-",")",")",")","c"]

        1 a, не находиться в регулярном выражении :-\)+|:-\(+, добавить в result
        2 :, нужно проследить какие будут последующие символы
            1 -, нужно проследить какие будут последующие символы, нам осталось найти ) или ( 1 или несколько штук
            2 ), находиться в регулярном выражении :-\)+|:-\(+,
            3 мы нашли последовательность символов которые можно идентифицировать как смайл, добавлять их в результат не нужно

        Вывод: ["a","b","c"]
    * */

    private static List<Character> doSomething(List<Character> before) {
        String smileyChars = ":-)(";
        Stack<Character> stack = new Stack<>();
        List<Character> result = new ArrayList<Character>();

        int p1 = 0;
        while (p1 < before.size()) {
            System.out.println("--------------");
            System.out.println(before.get(p1));
            System.out.println(result);
            System.out.println(stack);
            if (smileyChars.indexOf(before.get(p1)) == -1) {
                result.add(before.get(p1));
                p1++;
                continue;
            } else {
                if (before.get(p1) == ':') {
                    stack.push(before.get(p1));
                    p1++;
                    continue;
                }
                if (before.get(p1) == '-') {
                    if (stack.peek() == ':') {
                        stack.push(before.get(p1));
                        p1++;
                        continue;
                    }
                }
                if ( (before.get(p1) == ')' || before.get(p1) == '(') ) {
                    if (!stack.isEmpty() && stack.peek() == '-') {
                        stack.clear();
                    } else {
                        result.add(before.get(p1));
                    }
                }
            }
            p1++;
        }
        return result;
    }
}