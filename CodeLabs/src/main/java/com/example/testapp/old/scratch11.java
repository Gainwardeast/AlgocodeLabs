package com.example.testapp.old;

class Scratch11 {
    public static void main(String[] args) {
        // String[] before = {"present", "predicate", "prepare"};
        String before = "abbbbbbbbbbbbbbbbbbxbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbybbbba";
        //Character[] before = {' ', ' ', ' ', ' '};

        System.out.println(before);

        System.out.println(doSomething(before));
    }

    /*
        Дана строка s.
        Нужно вернуть true, если из неё
        можно удалить не более одного символа,
        чтобы получился палиндром,
        и false — в противном случае.

        Палиндром — это слово или фраза,
        которые читаются одинаково слева направо и справа налево.
    */

    static Boolean doSomething(String before) {

        // ['a', ' ', ' ', 'b', ' ', 'c', ' ', ' ', ' ']

        int start = 0;
        int end = before.length() - 1;
        int countOfDeletedSymbols = 0;

        while (start < end) {
            if (before.charAt(start) == before.charAt(end)) {
                start++;
                end--;
            } else if (before.charAt(start + 1) == before.charAt(end)) {
                start++;
                start++;
                end--;
                countOfDeletedSymbols++;
            } else if (before.charAt(start) == before.charAt(end - 1)) {
                start++;
                end--;
                end--;
                countOfDeletedSymbols++;
            } else {
                return false;
            }
        }

        return countOfDeletedSymbols <= 1;
    }


}