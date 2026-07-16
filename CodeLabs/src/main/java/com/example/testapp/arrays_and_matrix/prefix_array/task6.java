package com.example.testapp.arrays_and_matrix.prefix_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task6 {


    /*
        Последовательность с суммой K
        легко
        Дан неотсортированный массив nums целых чисел, необходимо определить,
        существует ли такая непрерывная последовательность,
        сумма элементов которой равна k.
        Нужно вернуть индекс последнего элемента
        первой встретившейся последовательности, иначе -1.
        Пример 1:
        Ввод: nums = [1, 2, 3], k = 5
        Вывод: 2
        Пример 2:
        Ввод: nums = [1, 2, 3], k = 7
        Вывод: -1
        Пример 3:
        Ввод: nums = [1, 2, 5, 7], k = 7
        Вывод: 2
        Объяснение: существует 2 непрерывных последовательности,
        в сумме равные 7 [2, 5] и [7] в качестве ответа возвращаем последний индекс последовательности [2, 5],
        так как она встретилась раньше.
    * */

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 5, 7);

        doSomething(nums, 7);
    }

//    private static void doSomething(List<Integer> nums, int sum) {
//        int sequenceEnd = -1;
//        int sequenceStart = -1;
//        int resultIndex = -1;
//        List<Integer> numsSum = new ArrayList<>();
//        numsSum.add(0);
//        for (int p = 1; p < nums.size(); p++) {
//            numsSum.add(nums.get(p) + numsSum.get(p - 1));
//        }
//
//        for (int p = 0; p < numsSum.size(); p++) {
//            if(numsSum.get(p) >= sum){
//                sequenceEnd = p;
//                break;
//            }
//        }
//
//        for(int numSum: numsSum){
//            if((numsSum.get(sequenceEnd) - numSum) == sum){
//                sequenceStart = numsSum.indexOf(numSum);
//            }
//        }
//
//        if(sequenceStart != -1 && sequenceEnd != -1){
//            resultIndex = sequenceEnd;
//        }
//
//        System.out.println("result is " + resultIndex);
//    }

    private static void doSomething(List<Integer> nums, int targetSum) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, -1);

        int resultIndex = -1;
        int currentSum = 0;
        for (int p = 0; p < nums.size(); p++) {
            currentSum = currentSum + nums.get(p);
            prefixMap.putIfAbsent(currentSum, p);
        }

        currentSum = 0;
        for (int p = 0; p < nums.size(); p++) {
            currentSum = currentSum + nums.get(p);
            int key = currentSum - targetSum;
            if (prefixMap.containsKey(key)) {
                resultIndex = p;
                break;
            }
        }

        System.out.println("result is " + resultIndex);
    }
}