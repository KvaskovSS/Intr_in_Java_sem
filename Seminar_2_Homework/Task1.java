package Seminar_2_Homework;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    

    public static void SqlQuerry()
    {
        String baseQuery = "select * from students where ";
        Map<String, String> filters = new HashMap<>();
        filters.put("name", "Ivanov");
        filters.put("country", "Russia");
        filters.put("city", "Moscow");
        filters.put("age", null);
        
        StringBuilder whereClause = new StringBuilder();
        for (Map.Entry<String, String> filter : filters.entrySet()) 
        {
            String key = filter.getKey();
            String value = filter.getValue();
            if (value != null) 
            {
                if (whereClause.length() > 0) 
                {
                    whereClause.append(" and ");
                }
                whereClause.append(key).append(" = '").append(value).append("'");
            }
        }
        String query = baseQuery + whereClause.toString();
        System.out.println(query);
    }
}
