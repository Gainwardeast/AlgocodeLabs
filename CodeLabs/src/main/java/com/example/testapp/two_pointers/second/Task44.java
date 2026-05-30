
package com.example.testapp.two_pointers.second;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task44 {
    /*
        Сжатие пробелов
        легко
        # решено
        Дан массив символов chars.
        Замените все подряд идущие пробелы (в том числе в начале и в конце)
        на один пробел.
        Все изменения должны быть внесены в исходный массив (без создания нового). Верните изменённый массив.
        Пример 1:
        Ввод: chars = ['a', ' ', ' ', 'b', ' ', 'c', ' ', ' ', ' ']
        Вывод: ['a', ' ', 'b', ' ', 'c', ' ']
        Пример 2:
        Ввод: chars = ['z', 'e', 'r', 'o']
        Вывод: ['z', 'e', 'r', 'o']
        Пример 3:
        Ввод: nums = [' ', ' ', ' ', ' ']
        Вывод: Вывод: [' ']
    * */

    public static void main(String[] args) {
        List<Character> target = Arrays.asList('a', ' ', ' ', 'b', ' ', 'c', ' ', ' ', ' ');
        System.out.println(target);

        makeTask(target);
    }

    static void makeTask(List<Character> characters) {

        int fast = 0;
        int slow = 0;

        // Ввод: chars = ['a', ' ', ' ', 'b', ' ', 'c', ' ', ' ', ' ']
        // Ввод: chars = ['a', ' ', 'b', ' ', ' ', 'c', ' ', ' ', ' ']
        while (fast < characters.size()){
            System.out.println("fast -> " + fast + " slow -> " + slow );
            if(characters.get(slow) == ' ' && characters.get(fast) != ' ' ){
                Collections.swap(characters, fast, slow);
            }
            if(characters.get(fast) == ' '){
                slow = fast;
            }
            System.out.println("characters -> " + characters);
            fast++;
        }
    }
}
