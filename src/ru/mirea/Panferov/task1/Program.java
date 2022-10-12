package ru.mirea.Panferov.task1;

import java.lang.*;
import java.util.*;

public class Program {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        double[] massive = new double[n];
        System.out.print("Случайный заполненый массив: ");
        for (int i = 0; i < n; i++){
            massive[i] = Math.random();
            System.out.printf("%.4f ", massive[i]);
        }
        System.out.print("\nОтсортированный изначальный массив: ");
        Arrays.sort(massive);
        for (double i : massive) System.out.printf("%.4f ", i);
    }
}
