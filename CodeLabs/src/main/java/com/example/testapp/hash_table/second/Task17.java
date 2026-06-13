package com.example.testapp.hash_table.second;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Task17 {

    /*
        Строгая симметрия по оси Y

        Дан массив точек points.
        Нужно вернуть true,
        если существует такая прямая, параллельная оси Y,
        которая симметрично отражает все данные точки и false,
        если такой прямой нет.
        ВАЖНО: При этом каждая точка должна иметь симметричную ей точку в массиве с таким же числом вхождений.

        Пример 1:
        Ввод: points = [[1,2],[3,2]]
        Вывод: true
        Пример 2:
        Ввод: points = [[1,2],[3,2],[2,1],[2,1]]
        Вывод: true
        Пример 3:
        Ввод: points = [[2,3],[4,3],[3,1],[3,1]]
        Вывод: true
        Пример 4:
        Ввод: points = [[1,1],[2,1],[2,1]]
        Вывод: false
        */

    public static void main(String[] args) {
        // 1,1],[2,1],[2,1
        int[][] points = {
                {1,1},
                {2,1},
                {2,1},
        };

        boolean result = makeTask(points);
        System.out.println("result -> "+ result);
    }

    static boolean makeTask(int[][] points) {
        int minX = points[0][0];
        int maxX = points[0][0];
        Set<Point> pointsSet = new HashSet<>();
        for(int[] point : points){
            minX = Math.min(minX, point[0]);
            maxX = Math.max(maxX, point[0]);
            pointsSet.add( new Point(point[0], point[1]));
        }

        HashMap<Point, Point> mirrorPoints = new HashMap<>();

        for(int[] point : points){
            int symX = minX + maxX - point[0];

            if(pointsSet.contains(new Point(symX, point[1])) && !mirrorPoints.containsKey(new Point(point[0], point[1]))){
                mirrorPoints.put(new Point(point[0], point[1]), new Point(symX, point[1]));
            } else {
                return false;
            }
        }

        return true;
    }

    static class Point {
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
}