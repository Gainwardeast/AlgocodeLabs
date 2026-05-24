
package com.example.testapp.two_pointers.second;

public class Task41 {
    /*
        Похожие строки
        средне

        Даны две строки s и t.
        Строки считаются похожими,
        если они уже равны или могут стать равными после ровно одного изменения:
        вставки, удаления или замены одного символа.
        Нужно вернуть true, если строки похожи, иначе — false.

        Пример 1:

        Ввод: s = "iq", t = "ieq"
        Вывод: true
        Объяснение: можно добавить один символ и получить равные строки s = t

    * */

    public static void main(String[] args) {
        String target1 = "qwerty";
        String target2 = "qwsersty";
        System.out.println(target1);
        System.out.println(target2);
        System.out.println(mergeStrings(target1, target2));
    }

    static boolean mergeStrings(String target1, String target2) {
        int pNums1 = 0;
        int pNums2 = 0;
        Integer numberOfChanges = 0;

        if (Math.abs(target1.length() - target2.length()) > 1) {
            System.out.println("difference of length -> " + Math.abs(target1.length() - target2.length()));
            return false;
        }

        while (pNums1 < target1.length() && pNums2 < target2.length()) {
            Character char1 = target1.toLowerCase().charAt(pNums1);
            Character char2 = target2.toLowerCase().charAt(pNums2);
            if (char1 != char2) {
                if(target1.length() == target2.length()){
                    pNums1++;
                    pNums2++;
                } else {
                    if(target1.length() < target2.length()){
                        pNums1++;
                    } else {
                        pNums2++;
                    }
                }
                numberOfChanges++;
            } else {
                pNums1++;
                pNums2++;
            }
        }
        System.out.println("numberOfChanges -> " + numberOfChanges);
        return numberOfChanges == 1;
    }
}
