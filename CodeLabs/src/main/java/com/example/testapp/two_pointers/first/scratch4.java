package com.example.testapp.two_pointers.first;


class Scratch4 {
    public static void main(String[] args) {
        String before = "A man, a plan, a canal: Panama";
        System.out.println(before);
        System.out.println("final result -> " + sortedArray(before));
    }

    /*
        Дана строка s. Верните true, если s является палиндромом,
        или false в противном случае.
        Фраза является палиндромом,
        если после преобразования всех заглавных букв в строчные и
        удаления всех символов, кроме букв и цифр,
        она читается одинаково слева направо и справа налево.
    */

    static boolean sortedArray(String string) {
//        String clearedString = before.toLowerCase().replaceAll("[^0-9A-Za-z]", "").toLowerCase();
//        List<Character> characters = new ArrayList<>();
//        for (char charachter : clearedString.toCharArray()) {
//            characters.add(charachter);
//        }
        int begin = 0;
        int end = string.length() - 1;
        boolean result = true;
        while (result && begin < end) {
            char first = string.charAt(begin);
            char second = string.charAt(end);
            System.out.println("begin => " + begin + " end => " + end);
            System.out.println("first => " + first + " second => " + second);

            if(!Character.isLetterOrDigit(first)){
                begin++;
                continue;
            }
            if(!Character.isLetterOrDigit(second)){
                end--;
                continue;
            }

        }
        return result;
    }

}