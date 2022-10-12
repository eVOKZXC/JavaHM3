package ru.mirea.Panferov.task2;

public class Program {
    static public void main(String[] args){
        int[] massive = new int[4];
        boolean checker = true;
        System.out.print("Массив: ");
        for (int i = 0; i < 4; i++){
            massive[i] = (int)(Math.random()*100);
            System.out.print(massive[i] + " ");
         }
        for (int i = 0; i < 3; i++) if (massive[i] > massive[i+1]){
            System.out.println("\nМассив не строго возрастающий");
            checker = false;
            break;
        }
        if (checker) System.out.println("Массив строго возрастающий");
    }
}
