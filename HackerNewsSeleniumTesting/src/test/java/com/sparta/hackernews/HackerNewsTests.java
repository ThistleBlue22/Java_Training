package com.sparta.hackernews;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class HackerNewsTests {

    private static WebDriver webDriver;
    private static ChromeOptions options;
    private static ChromeDriverService service;
    private static String password;

    @BeforeAll
    static void setUp(TestInfo testInfo){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        System.out.println(testInfo.getDisplayName());
        options = new ChromeOptions();
        service = new ChromeDriverService.Builder().usingDriverExecutable(new File("src/test/resources/chromedriver.exe")).usingAnyFreePort().build();
        webDriver = new ChromeDriver(options);
        try (InputStream is = new FileInputStream("password.properties")){
            Properties properties = new Properties();
            properties.load(is);
            password = properties.getProperty("password");
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    @BeforeEach
    void setUp(){
        webDriver.get("https://news.ycombinator.com/");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterAll
    static void tearDownAll(){
        webDriver.quit();
    }



    @Test
    @DisplayName("Checking the webdriver works")
    void checkingThatTheWebDriverWorks(){

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
    void findYesterdaysDate(){
        webDriver.findElement(By.linkText("past")).click();
        final Calendar date = Calendar.getInstance();

        String string = webDriver.findElement(By.className("pagetop")).getText();
        date.add(Calendar.DATE, -1);

        String[] stringArrayList = string.split("\\|");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateExpected = dateFormat.format(date.getTime());

        Assertions.assertEquals(dateExpected, stringArrayList[stringArrayList.length - 1].trim());
    }

    @Test
    @DisplayName("Apply for YC Summer 2022")
    void applyForYCSummerTwentyTwentyTwo() {
        webDriver.findElement(By.linkText("Applications are open for YC Summer 2022")).click();

        Assertions.assertEquals("https://www.ycombinator.com/apply/", webDriver.getCurrentUrl());
    }
    @Test
    @DisplayName("Press next to get the next page of content")
    void pressNextToGetTheNextPageOfContent() {
        webDriver.findElement(By.className("morelink")).click();

        Assertions.assertEquals("https://news.ycombinator.com/news?p=2", webDriver.getCurrentUrl());
    }

    @Test
    @DisplayName("Login page access")
    void loginPageAccess() {
        webDriver.findElement(By.linkText("login")).click();

        Assertions.assertEquals("https://news.ycombinator.com/login?goto=news", webDriver.getCurrentUrl());
    }

    @Test
    @DisplayName("Login to the website")
    void loginToTheWebsite() {
        webDriver.findElement(By.linkText("login")).click();
        userLogin();
    }

    @Test
    @DisplayName("Login with invalid information")
    void loginWithInvalidInformation() {
        webDriver.findElement(By.linkText("login")).click();
        webDriver.findElement(By.cssSelector("body > form:nth-child(4) > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]")).sendKeys("ThistleBlue");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        webDriver.findElement(By.cssSelector("body > form:nth-child(4) > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]")).sendKeys("password", Keys.ENTER);
    }

    @Test
    @DisplayName("Login to the website and then logout")
    void loginToTheWebsiteAndThenLogout() {
        webDriver.findElement(By.linkText("login")).click();
        userLogin();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        Wait<WebDriver> wait = new FluentWait<>(webDriver)
//                .withTimeout(Duration.ofSeconds(30))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class);

        webDriver.findElement(By.linkText("logout")).click();

    }

    private void userLogin() {
        webDriver.findElement(By.cssSelector("body > form:nth-child(4) > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]")).sendKeys("ThistleBlue");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        webDriver.findElement(By.cssSelector("body > form:nth-child(4) > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]")).sendKeys(password, Keys.ENTER);
    }


}
