package com.company.n18and67;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ReadArray implements EulerSolution{
        //Алгоритм
    public String run() {

        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++)
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
        }
        return Integer.toString(triangle[0][0]);
    }

    public static void main (String args[]) throws FileNotFoundException {

        System.out.println(new ReadArray().run());

        File file = new File("C:\\Users\\alexandr.zhuk\\Desktop\\Shildt\\" +
                "Euler-Project\\src\\com\\company\\n18and67\\" +
                "тест1.txt");
        Scanner scanner = new Scanner(file);
        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }
        System.out.println(integers);
    }


    private int[][] triangle = //ToDo: указать ссылку на массив
            {  // Бокс с треугольником
                    {3},
                    {7,4},
                    {2,4,6},
                    {8,5,9,3},

            };

}