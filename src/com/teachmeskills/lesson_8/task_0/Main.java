package com.teachmeskills.lesson_8.task_0;

import static com.teachmeskills.lesson_8.task_0.Vector2D.Vector2DArray;
import static com.teachmeskills.lesson_8.task_0.Vector3D.Vector3DArray;

public class Main {

    public static void main(String[] args) {

        Vector2D vector0 = new Vector2D(2, 7);
        Vector2D vector1 = new Vector2D(4, 12);

        System.out.println("Info about 2D vectors: ");
        System.out.println("First vector length: " + vector0.vectorLength() + "\n" +
                "Second vector length: " + vector1.vectorLength() + "\n" +
                "Scalar product: " + vector0.vectorScalarProduct(vector1) + "\n" +
                "Vectors sum: " + vector0.vectorSum(vector1) + "\n" +
                "Vectors difference: " + vector0.vectorDifference(vector1) + "\n" +
                "Random vector length array: " + Vector2DArray(4) + "\n" +
                "Are vectors equal: " + vector0.equals(vector1) + "\n" +
                "ToString: " + "\n" +
                "First vector info: " + vector0.toString() + "\n" +
                "Second vector info: " + vector1.toString()
        );

        Vector3D vector2 = new Vector3D(2, 7, 6);
        Vector3D vector3 = new Vector3D(4, 12, 7);

        System.out.println("Info about 3D vectors: ");
        System.out.println("First vector length: " + vector2.vectorLength() + "\n" +
                "Second vector length: " + vector3.vectorLength() + "\n" +
                "Scalar product: " + vector2.vectorScalarProduct(vector3) + "\n" +
                "Vectors sum: " + vector2.vectorSum(vector3) + "\n" +
                "Vectors difference: " + vector2.vectorDifference(vector3) + "\n" +
                "Random vector length array: " + Vector3DArray(4) + "\n" +
                "Are vectors equal: " + vector2.equals(vector3) + "\n" +
                "ToString: " + "\n" +
                "First vector info: " + vector2.toString() + "\n" +
                "Second vector info: " + vector3.toString()
        );
    }
}
