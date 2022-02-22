package com.sparta.http.test;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.junit.*;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ChuckTest {

    JSONObject jsonObject;
    @BeforeAll
    public void setUp(){
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("https://api.chucknorris.io/jokes/random")).build();

        HttpClient httpClient = HttpClient.newHttpClient();
        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();
            JSONParser jsonParser = new JSONParser();
            jsonObject = (JSONObject) jsonParser.parse(responseBody);
        } catch (IOException | InterruptedException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testThatValueContainsChuck(){
        String jokeTest = jsonObject.get("value").toString();
        Assert.assertTrue("Chuck Norris".contains(jokeTest));
    }
}
