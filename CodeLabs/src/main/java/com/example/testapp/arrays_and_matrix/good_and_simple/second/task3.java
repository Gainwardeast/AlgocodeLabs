package com.example.testapp.arrays_and_matrix.good_and_simple.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task3 {
    public static void main(String[] args) {

        // List<String> list = Arrays.asList("2", "*", "3", "*", "1", "+", "2", "+", "2", "+", "2", "*", "0", "*", "13", "+", "1");
        List<String> list = Arrays.asList("1","+","2","+","3");
        doSomething(list);
    }

    /*
        Простой калькулятор
        средне
        # решено
        Дан массив s с положительными числами и знаками * и +.
        Нужно вернуть результат вычислений и важно,
        чтобы решение было за O(1) по дополнительной памяти.
        Пример 1:
        Ввод: s = ["2","*","3","*","1","+","2","+","2","+","2","*","0","*","13","+","1"]

        "2","*","3","*","1",
        "+","2",
        "+","2",
        "+", "2", "*","0","*","13",
        "+","1"]

        Вывод: 11
        Пример 2:
        Ввод: s = ["1","+","2","+","3"]
        Вывод: 6
    * */

    private static void doSomething(List<String> list) {

        List<Integer> row = new ArrayList<>();
        List<List<Integer>> numbers = new ArrayList<>();
        String sign = "@";
        for (String string : list) {
            if (string.equals("+") || string.equals("*")) {
                sign = string;
            } else {
                if (sign.equals("+")) {
                    numbers.add(row);
                    row = new ArrayList<>();
                }
                row.add(Integer.parseInt(string));
            }
        }
        numbers.add(row);

        int finalResult = 0;
        for (List<Integer> numbersRow : numbers) {
            int result = 1;
            for (Integer number : numbersRow) {
                result = result * number;
            }
            finalResult = finalResult + result;
        }

        System.out.println("finish");
    }
}
