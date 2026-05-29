
package com.example.testapp.two_pointers.second;

public class Task43 {
    /*
        Почти палиндром

        Дана строка s. Нужно вернуть true,
        если из неё можно удалить не более одного символа,
        чтобы получился палиндром, и false — в противном случае.
        Палиндром — это слово или фраза, которые читаются одинаково слева направо и справа налево.

        Пример 1:
        Ввод: s = "abca"
        Вывод: true
        Объяснение: Если удалить символ 'b', строка станет палиндромом: "aca"
        Пример 2:
        Ввод: s = "racecar"
        Вывод: true
        Объяснение: cтрока уже является палиндромом
        Пример 3:
        Ввод: s = "deeee"
        Вывод: true
        Объяснение: удалив 'd', строка станет палиндромом: "eeee"

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
