package Seminar_3_Homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания [1, 3] : ");
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
                Task3.task3();
                break;
            default :
                System.out.println("Нет такого номера задания :)");
        }
        scanner.close();
    }
}
