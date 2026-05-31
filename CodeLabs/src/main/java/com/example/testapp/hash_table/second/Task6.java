package com.example.testapp.hash_table.second;

import java.util.*;

class Task6 {

    /*
    маршрут туриста
    Дан набор пар городов tickets,
    где tickets[i] = [город отправления, город прибытия] в которых побывал турист.
    Нужно восстановить маршрут следования туриста.

    Известно, что все города относятся к одному путешествию,
    и что каждый следующий перелёт турист начинал из того города,
    в котором закончил предыдущий и никакой город не был посещён туристом дважды.

    Примеры:
    Пример 1
    Ввод: tickets = [[Vladivostok,Moscow]]
    Вывод: [Vladivostok,Moscow]
    Пример 2
    Ввод: tickets = [[Moscow,Yerevan],[Vladivostok,Moscow],[Yerevan,NY]]
    Вывод: [Vladivostok,Moscow,Yerevan,NY]
    Ограничения:
    len(cities) >= 1

        */

    public static void main(String[] args) {
        List<List<String>> dests = Arrays.asList(
                Arrays.asList("Moscow", "Yerevan"),
                Arrays.asList("Vladivostok", "Moscow"),
                Arrays.asList("Yerevan", "NY")
        );

        System.out.println(makeTask(dests));
    }

    static List<String> makeTask(List<List<String>> dests) {
        List<String> result = new ArrayList<>();

        HashSet<String> fromCities = new HashSet<>();
        HashSet<String> toCities = new HashSet<>();

        HashMap<String, String> fromToPairs = new HashMap<>();
        for (int p = 0; p < dests.size(); p++) {
            String from = dests.get(p).get(0);
            String to = dests.get(p).get(1);
            fromToPairs.put(from, to);
            fromCities.add(from);
            toCities.add(to);
        }
        String fromCity = "";
        for (String from : fromCities) {
            if (!toCities.contains(from)) {
                fromCity = from;
            }
        }
        result.add(fromCity);
        for (int p = 0; p < dests.size(); p++) {
            String dest = fromToPairs.get(fromCity);
            result.add(dest);
            fromCity = dest;
        }

        return result;
    }


}