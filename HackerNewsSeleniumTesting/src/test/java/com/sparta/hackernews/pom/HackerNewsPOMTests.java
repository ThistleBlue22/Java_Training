package com.sparta.hackernews.pom;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HackerNewsPOMTests {
    private static WebDriver driver;
    private static ChromeOptions chromeOptions;
    private static HomePage homePage;
    private static CommentsPage commentsPage;
    private static PastPage pastPage;
    private static LogInPage logInPage;
    private static JobsPage jobsPage;
    private static FAQPage faqPage;

    @BeforeAll
    static void setUpAll() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver(chromeOptions);
        homePage = new HomePage(driver);
    }
    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void checkThatCommentsPageHasCorrectURL() {
        Assertions.assertEquals("https://news.ycombinator.com/newcomments", homePage.goToCommentsPage().getURL());
    }

    @Test
    void checkThatPastPageHasCorrectDate() {
        Assertions.assertTrue(homePage.goToPastPage().isDateYesterday());
    }

    @Test
    void checkThatTheFAQPageHasCorrectURL() {
        Assertions.assertEquals("https://news.ycombinator.com/newsfaq.html", homePage.goToFAQPage().getURL());
    }

    @Test
    void checkThatTheJobsPageHasCorrectURL() {
        Assertions.assertEquals("https://news.ycombinator.com/jobs", homePage.goToJobsPage().getURL());
    }

    @Test
    void checkThatTheLoginPageHasCorrectURL() {
        Assertions.assertEquals("https://news.ycombinator.com/login", homePage.goToLoginPage().getURL());
    }

    @Test
    void checkThatTheUserCanLoginAndCreateACookie() {
        homePage.goToLoginPage().logIntoTheWebsite("ThistleBlue", "-p0o9i8U7");
        Assertions.assertTrue(isCookieSet());
    }

    public boolean isCookieSet() {
        if (driver.manage().getCookieNamed("user") != null){
            return true;
        }

        return false;
    }







}
