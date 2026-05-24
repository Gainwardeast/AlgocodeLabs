package com.example.testapp.two_pointers.second;

public class Task14 {
    /*
        Правильный палиндром
        средне
        # решено

        Дана строка s. Верните true,
        если s является палиндромом,
        или false в противном случае.
        Фраза является палиндромом,
        если после преобразования всех заглавных букв в строчные и удаления всех символов,
        кроме букв и цифр,
        она читается одинаково слева направо и справа налево.

        Буквенно-цифровые символы включают латинские буквы и цифры.

        Пример 1:

        Ввод: s = "A man, a plan, a canal: Panama"
        Вывод: true
        Объяснение: строка "amanaplanacanalpanama" является палиндромом
    * */

    public static void main(String[] args) {
        String target = "A man, a plan, a canal: Panama";
        System.out.println(target);
        System.out.println(isPalindrom(target));
    }

    static boolean isPalindrom(String string) {
        int p1 = 0;
        int p2 = string.length() - 1;
        while (p1 < p2) {
            char char1 = string.toLowerCase().charAt(p1);
            char char2 = string.toLowerCase().charAt(p2);

            if (!Character.isLetterOrDigit(char1)) {
                p1++;
                continue;
            }

            if (!Character.isLetterOrDigit(char2)) {
                p2--;
                continue;
            }

            if (char1 != char2) return false;
            p1++;
            p2--;
        }
        return true;
    }
}
