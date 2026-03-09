package com.example.testapp.algos_and_data_structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Scratch3 {
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
        Stack<Integer> stack = new Stack<>();
        ArrayList<Character> result = new ArrayList<>(before);
        boolean[] toRemove = new boolean[before.size()]; // отмечаем, какие индексы удалять

        int p1 = 0;
        while (p1 < before.size()) {
            System.out.println("--------------");
            System.out.println("before.get(p1) >" + before.get(p1));
            System.out.println("result >" + result);
            System.out.println("stack >" + stack);

            if (before.get(p1) == ':') {
                if (!stack.isEmpty()) {
                    stack.clear();
                }
                stack.push(p1);
                p1++;
                continue;
            }
            if (before.get(p1) == '-') {
                if (!stack.isEmpty() && before.get(stack.peek()) == ':') {
                    stack.push(p1);
                    p1++;
                    continue;
                }
            }
            if ((before.get(p1) == ')' || before.get(p1) == '(')) {
                if (!stack.isEmpty() && before.get(stack.peek()) == '-') {
                    toRemove[p1] = true;
                    result.remove(p1);
                    while (!stack.isEmpty()) {
                        toRemove[stack.pop().intValue()] = true;
                    }
                }
            }

            p1++;
        }
        ArrayList<Character> finalResult = new ArrayList<>();
        for (int i = 0; i < before.size(); i++) {
            if (!toRemove[i]) {
                finalResult.add(before.get(i));
            }
        }
        return finalResult;
    }
}