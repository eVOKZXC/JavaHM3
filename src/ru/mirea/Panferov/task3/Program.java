package ru.mirea.Panferov.task3;

import java.util.Scanner;

public class Program {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true){
            System.out.print("Введите n: ");
            n = scanner.nextInt();
            if (n > 0) break;
        }
        int[] massive = new int[n+1];
        System.out.print("Изначальный массив: ");
        for (int i = 0; i <= n; i++){
            massive[i] = i;
            System.out.print(massive[i] + " ");
        }
        int[] massive2 = new int[n+1];
        System.out.print("\nЧетный массив: ");
        for (int i = 0; i <= massive.length; i += 2){
            massive2[i] = massive[i];
            System.out.print(massive2[i] + " ");
        }
    }
}
