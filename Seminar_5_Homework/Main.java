package Seminar_5_Homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания [1, 4] : ");
        int task = scanner.nextInt();
        switch (task)
        {
            case 1 :
                Task1.task1();
                break;
            case 2 :
                Task2.task2();
                break;
            case 3 :
                System.out.println("Введите размер массива:");
                int n = scanner.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = (int) (Math.random() * 100);
                System.out.print("Изначальный массив : ");
                Task3.printArr(arr);
                Task3.task3(arr);
                System.out.print("Отсортированный массив : ");
                Task3.printArr(arr);
                break;
            case 4 :
                Task4.task4();
                break;
            default :
                System.out.println("Нет такого номера задания :)");
        }
        scanner.close();
    }
}
