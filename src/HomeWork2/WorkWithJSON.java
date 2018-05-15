package HomeWork2;

import com.google.gson.*;


import java.io.*;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class WorkWithJSON {


    public static String read(String URLaddres) {
        try {
            URL url = new URL(URLaddres);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line = "";
                for (; (line = bufferedReader.readLine()) != null; ) {
                    return line;
                }


            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static Curency []  fromJSON(String json) {
        Gson gson = new GsonBuilder().create();
        Curency[] curencies = gson.fromJson(json, Curency[].class);
        for (Curency curency : curencies) {
            System.out.println("R030 = " + curency.getR030() + " Txt = " + curency.getTxt() + " Rate = " + curency.getRate() + " Cc= " +
                    curency.getCc() + " Exchangedate = " + curency.getExchangedate());
        }
        return curencies;


    }

    public static void ToJSON(Curency [] curencies){
        Gson gson = new GsonBuilder().create();
        System.out.println(gson.toJson(curencies));

    }



}
