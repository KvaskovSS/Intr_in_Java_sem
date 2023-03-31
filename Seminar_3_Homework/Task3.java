package Seminar_3_Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task3 
{
    public static void task3()
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

        System.out.println("Данный список : " + list);
        int min = Collections.min(list);
        int max = Collections.max(list);
        double avg = list.stream().mapToDouble(val -> val).average().orElse(0.0);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + avg);

        scanner.close();
    }
}
