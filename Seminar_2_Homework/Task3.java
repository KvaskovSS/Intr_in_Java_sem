package Seminar_2_Homework;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Task3 {
    public static void parseJson()
    {
        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        Gson gson = new Gson();
        JsonArray jsonArray = gson.fromJson(jsonString, JsonArray.class);

        StringBuilder stringBuilder = new StringBuilder();

        for (JsonElement element : jsonArray) 
        {
            JsonObject jsonObject = element.getAsJsonObject();

            String surname = jsonObject.get("фамилия").getAsString();
            String mark = jsonObject.get("оценка").getAsString();
            String subject = jsonObject.get("предмет").getAsString();

            stringBuilder.append("Студент ")
                    .append(surname)
                    .append(" получил ")
                    .append(mark)
                    .append(" по предмету ")
                    .append(subject)
                    .append(".\n");
        }

        System.out.println(stringBuilder.toString());
    }
}
