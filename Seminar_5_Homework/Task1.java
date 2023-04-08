package Seminar_5_Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    public static void task1()
    {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<String>> phonebook = new HashMap<>();
        while (true) 
        {
            System.out.println("Введите имя контакта или exit для выхода:");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) 
            {
                break;
            }

            System.out.println("Введите номер телефона или exit для выхода:");
            String phone = scanner.nextLine();
            if (phone.equalsIgnoreCase("exit")) 
            {
                break;
            }

            if (phonebook.containsKey(name)) 
            {
                phonebook.get(name).add(phone);
            } 
            else 
            {
                ArrayList<String> phones = new ArrayList<>();
                phones.add(phone);
                phonebook.put(name, phones);
            }
        }
        System.out.println("Телефонная книга:");
        for (String name : phonebook.keySet()) 
        {
            System.out.println(name + ": " + phonebook.get(name));
        }
        scanner.close();
    }
}
