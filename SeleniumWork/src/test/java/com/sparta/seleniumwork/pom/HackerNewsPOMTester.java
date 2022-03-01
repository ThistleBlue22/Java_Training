package com.sparta.seleniumwork.pom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HackerNewsPOMTester {
    private static WebDriver driver;
    private static HomePage homePage;
    private static CommentsPage commentsPage;
    private static PastPage pastPage;


    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Test
    void checkThatCommentsPageHasTheCorrectURL() {
        Assertions.assertEquals("https://news.ycombinator.com/newcomments", homePage.goToCommentsPage().getURL());
    }

    @Test
    void checkDateOnPastPage() {
        boolean isYesterdaysDate = homePage.goToPastPage().isDateYesterday();
        Assertions.assertTrue(isYesterdaysDate);
    }

    @Test
    void areThereThirtyArticlesOnAPage() {

    }


}
