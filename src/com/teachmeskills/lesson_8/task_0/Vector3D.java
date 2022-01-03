package com.teachmeskills.lesson_8.task_0;

import java.util.Objects;

public class Vector3D {

    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLength() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public double vectorScalarProduct(Vector3D vector1) {
        return x * vector1.x + y * vector1.y + z * vector1.z;
    }

    public Vector3D vectorSum(Vector3D vector1) {
        return new Vector3D(x + vector1.x, y + vector1.y, z + vector1.z);
    }

    public Vector3D vectorDifference(Vector3D vector1) {
        return new Vector3D(x - vector1.x, y - vector1.y, z - vector1.z);
    }

    public static Vector3D[] Vector3DArray(int n) {
        Vector3D[] array3D = new Vector3D[n];
        for (int i = 0; i < array3D.length; i++) {
            array3D[i] = new Vector3D(1 + Math.random() * 99, 1 + Math.random() * 99,1 + Math.random() * 99);
            System.out.println(array3D[i]);
        }
        return array3D;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return Double.compare(vector3D.x, x) == 0 && Double.compare(vector3D.y, y) == 0 && Double.compare(vector3D.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
