package com.teachmeskills.lesson_8.task_0;

import java.util.Objects;

public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double vectorLength() {
        return Math.sqrt((x * x) + (y * y));
    }

    public double vectorScalarProduct(Vector2D vector1) {
        return x * vector1.x + y * vector1.y;
    }

    public Vector2D vectorSum(Vector2D vector1) {
        return new Vector2D(x + vector1.x, y + vector1.y);
    }

    public Vector2D vectorDifference(Vector2D vector1) {
        return new Vector2D(x - vector1.x, y - vector1.y);
    }

    public static Vector2D[] Vector2DArray (int n){
        Vector2D[] array2D = new Vector2D[n];
        for (int i = 0; i < array2D.length; i++) {
            array2D[i]= new Vector2D(1+Math.random()*99,1+Math.random()*99);
            System.out.println(array2D[i]);
        }
        return array2D;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2D vector2D = (Vector2D) o;
        return Double.compare(vector2D.x, x) == 0 && Double.compare(vector2D.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
