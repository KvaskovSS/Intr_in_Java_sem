package Seminar_4_Homework;

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
                Task2<String> queue = new Task2<String>();
                queue.enqueue("first");
                queue.enqueue("second");
                queue.enqueue("third");

                System.out.println("Размер очереди : " + queue.size());
                System.out.println("Первый элемент : " + queue.first());
                
                System.out.println("Dequeue 1 : " + queue.dequeue());
                System.out.println("Dequeue 2 : " + queue.dequeue());
                System.out.println("Dequeue 3 : " + queue.dequeue());

                System.out.println("Пустая ли очередь? " + queue.isEmpty());
                break;
            case 3 :
                Task3.Calculator();
                break;
            default :
                System.out.println("Нет такого номера задания :)");
        }
        scanner.close();
    }
}
