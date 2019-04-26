package com.company.N18and67;

public final class p018 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new p018().run());
    }

    public String run() {
        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++)
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
        }
        return Integer.toString(triangle[0][0]);
    }


    private int[][] triangle = ReadArray.myArrays;
        /**
            {  // Бокс с треугольником
            {3},
            {7,4},
            {2,4,6},
            {8,5,9,3},

    };
    */
}