package Seminar_2_Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    private int arr[];

    public void getArr()
    {
        System.out.print("Массив : ");
        System.out.println(Arrays.toString(this.arr));
    }
    
    public void setArr()
    {
        System.out.print("Введите длину массива : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        this.arr = new int[n];
        System.out.println("Заполните массив ");
        for(int i = 0; i < n; i++)
        {
            this.arr[i] = scanner.nextInt();
        }
        scanner.close();
    }
    public void bubbleSort() 
    {
        System.Logger logger = System.getLogger("Task2");
        logger.log(System.Logger.Level.INFO, "Bubble sort starts");
        int n = this.arr.length;
        boolean swapped = true;
        int iteration = 1;
    

        while (swapped) 
        {
            swapped = false;
            for (int i = 1; i < n; i++) 
            {
                if (this.arr[i - 1] > this.arr[i]) 
                {
                    int temp = this.arr[i - 1];
                    this.arr[i - 1] = this.arr[i];
                    this.arr[i] = temp;
                    swapped = true;
                }
            }
            logger.log(System.Logger.Level.INFO,"Iteration " + iteration + " : " + Arrays.toString((this.arr)));
            iteration++;
        }
        System.out.print("Отсортированный массив : ");
        System.out.println(Arrays.toString(this.arr));
    }
}
