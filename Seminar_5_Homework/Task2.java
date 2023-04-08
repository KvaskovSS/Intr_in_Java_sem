package Seminar_5_Homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static void task2()
    {
         String[] employees = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                              "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                              "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                              "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};

        List<String> names = new ArrayList<>();
        for (String employee : employees) 
        {
            String[] parts = employee.split(" ");
            names.add(parts[0]);
        }

        Map<String, Integer> nameCount = new HashMap<>();
        for (String name : names) 
        {
            if (nameCount.containsKey(name)) 
            {
                int count = nameCount.get(name) + 1;
                nameCount.put(name, count);
            } 
            else 
            {
                nameCount.put(name, 1);
            }
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(nameCount.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> entry : sortedList) 
        {
            if (entry.getValue() > 1) 
            {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
