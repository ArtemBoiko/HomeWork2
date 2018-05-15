package HomeWork2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
       WorkWithJSON.ToJSON(WorkWithJSON.fromJSON
               (WorkWithJSON.read("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json")));


    }
}


