package com.example.testapp.hash_table.second;

import java.util.Arrays;
import java.util.HashMap;

class Task4 {

    /*
        Симметрия по оси Y
        средне
        # решено
        Дан массив точек points.
        Нужно вернуть true, если существует такая прямая, параллельная оси Y,
        которая симметрично отражает данные точки и false, если такой прямой нет.
        ВАЖНО: точки могут повторяться,
        но число симметричных точек не обязательно должно совпадать (см. пример 1)
        Пример 1:
        Ввод: points = [[1,2],[3,1],[4,2],[2,1],[2,1]]
        Вывод: true
        Пример 2:
        Ввод: points = [[2,2],[0,0]]
        Вывод: false
        Пример 3:
        Ввод: points = [[4,2]]
        Вывод: true
        Объяснение: если точка лежит на прямой, то считаем ее симметричной самой себе.
        */

    public static void main(String[] args) {
//        List<List<>> points = Arrays.asList(
//                    [1,2],
//                    [3,1],
//                    [4,2],
//                    [2,1],
//                    [2,1]
//        );
//
//        System.out.println(makeTask(before1, before2));
    }

    static Boolean makeTask(String a, String b) {
        if (a.length() != b.length()) return false;

        HashMap<Character, Character> aMap = new HashMap();
        HashMap<Character, Character> bMap = new HashMap();

        for (int i = 0; i < a.length(); i++) {
            Character aChar = a.charAt(i);
            Character bChar = b.charAt(i);
            if (aMap.containsKey(aChar) && (aMap.get(a.charAt(i)) != b.charAt(i))) {
                return false;
            }

            if (bMap.containsKey(bChar) && (bMap.get(bChar) != aChar)) {
                return false;
            }

            aMap.put(aChar, bChar);
            bMap.put(bChar, aChar);
        }


        return true;
    }


}