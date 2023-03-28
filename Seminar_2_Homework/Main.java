package Seminar_2_Homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания [1, 4] : ");
        int task = scanner.nextInt();
        switch (task)
        {
            case 1 :
                Task1.SqlQuerry();
                break;
            case 2 :
                Task2 task2 = new Task2();
                task2.setArr();
                task2.getArr();
                task2.bubbleSort();
                break;
            case 3 :
                Task3.parseJson();
                break;
            case 4 :
                Task4.Calculator();
                break;
            default :
                System.out.println("Нет такого номера задания :)");
        }
        scanner.close();
    }
}
