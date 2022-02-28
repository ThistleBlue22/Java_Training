package com.sparta.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Guardian myObj = objectMapper.readValue(new URL("https://content.guardianapis.com/search?api-key=401eae2b-af0e-455f-b4a8-2b9e3229b7bd"),
                    Guardian.class);

            TopStories stories = myObj.getResponse();

            List<NewsItem> newsItems =  stories.getResults();
            for (NewsItem m : newsItems){
                System.out.println(m.getWebTitle());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
