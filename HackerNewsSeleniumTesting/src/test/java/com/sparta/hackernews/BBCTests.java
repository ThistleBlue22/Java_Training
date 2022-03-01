package com.sparta.hackernews;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BBCTests {

    private static WebDriver driver;
    private static ChromeOptions options;


    @BeforeAll
    static void setUpAll(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        options = new ChromeOptions();
        // -----------------------------


        // options.addArguments("headless");

        // these do the same thing

        // options.setHeadless(true);

        // ------------------------------
        driver = new ChromeDriver(options);
    }

    @BeforeEach
    void setUp() {
        driver.get("https://www.bbc.co.uk/weather");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    @DisplayName("Find and click on Inverness")
    public void findAndClickOnInverness() {
        driver.findElement(By.linkText("Inverness")).click();

        Assertions.assertEquals("https://www.bbc.co.uk/weather/2646088",driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Search for a town using the input box and press enter")
    void searchForATownUsingTheInputBoxAndPressEnder() {
        driver.findElement(By.id("ls-c-search__input-label")).sendKeys("Moffat", Keys.ENTER);
    }


    // This test works for a logged-in user, this requires extra work to ensure proper functionality

//    @Test
//    @DisplayName("Search for a town using the input box and use the suggestions to select the town")
//    void searchForATownUsingTheInputBox() {
//        driver.findElement(By.id("ls-c-search__input-label")).click();
//        driver.findElement(By.className("ls-o-location--home")).click();
//    }


//    @AfterAll
//    static void tearDown() {
//        driver.quit();
//    }
}
