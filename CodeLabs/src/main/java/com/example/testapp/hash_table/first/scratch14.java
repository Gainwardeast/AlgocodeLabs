package com.example.testapp.hash_table.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Scratch14 {
    public static void main(String[] args) {
        String[][] tickets = {
                {"Moscow", "Yerevan"},
                {"Vladivostok", "Moscow"},
                {"Yerevan", "NY"}
        };

        ArrayList<List<String>> ticketList = new ArrayList<>();
        for (String[] ticket : tickets) {
            ticketList.add(Arrays.asList(ticket));
        }

        // Вывод для проверки
        System.out.println(ticketList);

        System.out.println(doSomething(ticketList));
    }

    /*
        Дан набор пар городов tickets, где tickets[i] = [город отправления, город прибытия]
        в которых побывал турист.
        Нужно восстановить маршрут следования туриста.

        все города относятся к одному путешествию,
        и что каждый следующий перелёт турист начинал из того города,
        в котором закончил предыдущий
        и никакой город не был посещён туристом дважды.

    */

    private static List<String> doSomething(ArrayList<List<String>> ticketList) {
        ArrayList<String> sortedTickes = new ArrayList<>();

        HashSet<String> departures = new HashSet<String>();
        HashSet<String> dests = new HashSet<String>();

        HashMap<String, String> ticketsMap = new HashMap<String, String>();

        for (List<String> ticketPair : ticketList) {
            departures.add(ticketPair.get(0));
            dests.add(ticketPair.get(1));
            ticketsMap.put(ticketPair.get(0), ticketPair.get(1));
        }
        String lastPoint = "";
        for (String departure : departures) {
            if (!dests.contains(departure)) {
                lastPoint = departure;
                sortedTickes.add(lastPoint);
                break;
            }
        }

        for (String key : ticketsMap.keySet()) {
            String to = ticketsMap.get(lastPoint);
            String from = ticketsMap.get(to);
            if (to == null) break;
            sortedTickes.add(to);
            if (from == null) break;
            sortedTickes.add(from);
            lastPoint = from;
        }

        return sortedTickes;
    }


}