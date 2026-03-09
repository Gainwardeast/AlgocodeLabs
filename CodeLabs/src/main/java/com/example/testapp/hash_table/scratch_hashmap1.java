package com.example.testapp.hash_table;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class ScratchHashMap1 {
    public static void main(String[] args) {

        boolean result = searchPoints(new int[][]{
                new int[]{1, 2},
                new int[]{3, 1},
                new int[]{4, 2},
                new int[]{2, 1},
                new int[]{2, 1}
        });
        System.out.println(result);
    }

    static boolean searchPoints(int[][] points) {
        int Xmin = points[0][0];
        int Xmax = points[0][0];
        Set<Point> pointsSet = new HashSet<Point>();
        for (int[] point : points) {
            Xmax = Math.max(Xmax, point[0]);
            Xmin = Math.min(Xmin, point[0]);
            pointsSet.add(new Point(point[0], point[1]));
        }

        for (int[] point : points) {
            int x = Xmax + Xmin - point[0];
            if (!pointsSet.contains(new Point(x, point[1]))) {
                return false;
            }
        }
        return true;
    }

    static class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Point)) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}