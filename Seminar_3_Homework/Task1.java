package Seminar_3_Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void task1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Заполните массив : ");
        for (int i = 0; i < array.length; i++) 
        {
            int num = scanner.nextInt();
            array[i] = num;
        }

        System.out.print("Исходный массив : ");
        printArray(array);
        mergeSort(array);
        System.out.print("Отсортированный массив : ");
        printArray(array);
        scanner.close();
    }

    public static void mergeSort(int[] array)  
    {
        if (array == null || array.length <= 1) 
        {
            return;
        }
        int[] buffer = new int[array.length];
        mergeSort(array, 0, array.length - 1, buffer);
    }

    private static void mergeSort(int[] array, int left, int right, int[] buffer) 
    {
        if (left >= right) 
        {
            return;
        }
        int middle = (left + right) / 2;
        mergeSort(array, left, middle, buffer);
        mergeSort(array, middle + 1, right, buffer);
        merge(array, left, middle, right, buffer);
    }
    
    private static void merge(int[] array, int left, int middle, int right, int[] buffer) 
    {
        System.arraycopy(array, left, buffer, left, right - left + 1);
        int i = left;
        int j = middle + 1;
        for (int k = left; k <= right; k++) 
        {
            if (i > middle)
            {
                array[k] = buffer[j++];
            } 
            else if (j > right) 
            {
                array[k] = buffer[i++];
            } 
            else if (buffer[j] < buffer[i]) 
            {
                array[k] = buffer[j++];
            } 
            else 
            {
                array[k] = buffer[i++];
            }
        }
    }

    public static void printArray(int[] array)
    {
        System.out.println(Arrays.toString(array));
    }
}
