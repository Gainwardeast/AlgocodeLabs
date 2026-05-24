
package com.example.testapp.two_pointers.second;

import java.util.Arrays;
import java.util.List;

public class Task42 {
    /*
        Общий префикс
        легко
        # решено
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
    * */

    public static void main(String[] args) {
        List<String> target1 = Arrays.asList("present", "predicate", "prepare");
        System.out.println(target1);
        System.out.println("findCommonPrefix -> "+findCommonPrefix(target1));
    }

    static String findCommonPrefix(List<String> strings) {

        String firstString = strings.get(0);
        int prefixEnd = 0;

        for(int string = 0; string < strings.size(); string++){
            String currentString = strings.get(string);
            int stringPointer = 0;
            while (stringPointer < currentString.length()
                    && stringPointer< currentString.length()
                    && firstString.charAt(stringPointer) == currentString.charAt(stringPointer)  ) {
                stringPointer++;
            }
            prefixEnd = stringPointer;
        }
        return firstString.substring(0, prefixEnd);
    }
}
