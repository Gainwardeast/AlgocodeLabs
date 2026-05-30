package com.example.testapp.hash_table.second;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Task4 {

    /*
        Симметрия по оси Y
        средне
        # решено
        Дан массив точек points.
        Нужно вернуть true, если существует такая прямая, параллельная оси Y,
        которая симметрично отражает данные точки и false, если такой прямой нет.
        ВАЖНО: точки могут повторяться,
        но число симметричных точек не обязательно должно совпадать (см. пример 1)
        Пример 1:
        Ввод: points = [[1,2],[3,1],[4,2],[2,1],[2,1]]
        Вывод: true
        Пример 2:
        Ввод: points = [[2,2],[0,0]]
        Вывод: false
        Пример 3:
        Ввод: points = [[4,2]]
        Вывод: true
        Объяснение: если точка лежит на прямой, то считаем ее симметричной самой себе.
        */

    public static void main(String[] args) {
        int[][] points = new int[][]{
                new int[]{1, 2},
                new int[]{3, 1},
                new int[]{4, 2},
                new int[]{2, 1},
                new int[]{2, 1}
        };

        System.out.println("=========================");
        System.out.println(points);
        System.out.println(makeTask(points));
        System.out.println("=========================");
    }

    static Boolean makeTask(int[][] points) {
        int minX = points[0][0];
        int maxX = points[0][0];
        Set<Point> pointsSet = new HashSet<>();
        for (int[] point : points) {
            minX = Math.min(minX, point[0]);
            maxX = Math.max(maxX, point[0]);
            pointsSet.add(new Point(point[0], point[1]));
        }

        for(int[] point : points) {
            int symX = minX + maxX - point[0];
            if(!pointsSet.contains(new Point(symX, point[1]))){
                return false;
            }
        }
        return true;
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    // Переопределение метода hashCode() для использования точки в HashSet
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}