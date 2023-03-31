package Seminar_3_Homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Task2 {

    public static void task2()
    {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка : ");
        int size = scanner.nextInt();

        Random rand = new Random();
        for(int i = 0; i < size; i++)
        {
            list.add(rand.nextInt(100));
        }

        System.out.println("До удаления четных чисел : " + list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            Integer number = iterator.next();
            if (number % 2 == 0) 
            {
                iterator.remove();
            }
        }

        System.out.println("После удаления четных чисел : " + list);

        scanner.close();
    }
    
}
