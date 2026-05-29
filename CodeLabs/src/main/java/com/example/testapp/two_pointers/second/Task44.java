
package com.example.testapp.two_pointers.second;

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
        String target = "deeee";
        System.out.println(target);
        System.out.println("findCommonPrefix -> " + makeTask(target));
    }

    static boolean makeTask(String target) {

        int p1 = 0;
        int p2 = target.length() - 1;
        int countOfChanges = 0;
        while (p1 < p2) {
            if (target.charAt(p1) != target.charAt(p2)) {
                countOfChanges++;
            }
            if (target.charAt(p1+1) == target.charAt(p2)) {
                p1++;
            }
            if (target.charAt(p1) == target.charAt(p2-1)) {
                p2--;
            }
            p1++;
            p2--;
        }
        System.out.println(countOfChanges);
        return countOfChanges <= 1;
    }
}
