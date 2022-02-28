package com.sparta.seleniumwork;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class NavigationTests {

    private static WebDriver webDriver;
    private static ChromeOptions options;
    private static ChromeDriverService service;

    @BeforeAll
    static void setupAll(){
        webDriver = new ChromeDriver(); // overload
    }

    @BeforeEach
    void setup(){
        webDriver.get("https://news.ycombinator.com/");
    }

    @Test
    @DisplayName("Managing settings for the webdriver")
    public void managingSettingForTheWebDriver() {
        webDriver.findElement(By.linkText("past")).sendKeys(Keys.CONTROL, Keys.ENTER);

    }

//    @AfterAll
//    static void tearDownAll() {
//        webDriver.quit();
//    }



}
