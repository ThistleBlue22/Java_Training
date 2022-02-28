package com.sparta.seleniumwork;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WebdriverTests {

    private static WebDriver webDriver;
    private static ChromeOptions options;
    private static ChromeDriverService service;

    @BeforeAll
    static void setUp(TestInfo testInfo){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        System.out.println(testInfo.getDisplayName());
        options = new ChromeOptions();
        options.addArguments("headless");
        service = new ChromeDriverService.Builder().usingDriverExecutable(new File("src/test/resources/chromedriver.exe")).usingAnyFreePort().build();
        webDriver = new ChromeDriver(options);
    }

    @BeforeEach
    void setUp(){
        webDriver.get("https://news.ycombinator.com/");
    }

    @AfterAll
    static void tearDownAll(){
        webDriver.quit();
    }

    @Test
    @DisplayName("Checking the webdriver works")
    public void checkingThatTheWebDriverWorks(){

        webDriver.findElement(By.linkText("past")).click();
        Assertions.assertEquals("https://news.ycombinator.com/front", webDriver.getCurrentUrl());


    }

    @Test
    @DisplayName("Test that the search box works")
    void testThatTheSearchBoxWorks() {
        webDriver.findElement(By.name("q")).sendKeys("Java", Keys.ENTER);

        Assertions.assertEquals("https://hn.algolia.com/?q=Java", webDriver.getCurrentUrl());
    }

    @Test
    @DisplayName("Find yesterdays date")
    public void findYesterdaysDate(){
        webDriver.findElement(By.linkText("past")).click();
        final Calendar date = Calendar.getInstance();

        String string = webDriver.findElement(By.className("pagetop")).getText();
        date.add(Calendar.DATE, -1);

        String[] stringArrayList = string.split("\\|");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateExpected = dateFormat.format(date.getTime());

        Assertions.assertEquals(dateExpected, stringArrayList[stringArrayList.length - 1].trim());
    }
}
