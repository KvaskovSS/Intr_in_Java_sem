package Seminar_4_Homework;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void task1()
    {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка : ");
        int size = scanner.nextInt();
        Random rand = new Random();
        for(int i = 0; i < size; i++)
        {
            list.add(rand.nextInt(100));
        }

        System.out.println("Изначальный список : " + list);
        System.out.println("Перевернутый список : " + reverseList(list));
        scanner.close();

    }
    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) 
    {
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) 
        {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    
}
