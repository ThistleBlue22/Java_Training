package com.sparta.hackernews.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    By comments = new By.ByLinkText("comments");
    By past = new By.ByLinkText("past");
    By jobs = new By.ByLinkText("jobs");
    By logIn = new By.ByLinkText("login");
    By faq = new By.ByLinkText("FAQ");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        goToHomePage();
    }

    private void goToHomePage() {
        driver.get("https://news.ycombinator.com/news");
    }

    public CommentsPage goToCommentsPage() {
        driver.findElement(comments).click();
        return new CommentsPage(driver);
    }
    public PastPage goToPastPage() {
        driver.findElement(past).click();
        return new PastPage(driver);
    }

    public JobsPage goToJobsPage() {
        driver.findElement(jobs).click();
        return new JobsPage(driver);
    }

    public LogInPage goToLoginPage() {
        driver.findElement(logIn).click();
        return new LogInPage(driver);
    }

    public FAQPage goToFAQPage() {
        driver.findElement(faq).click();
        return new FAQPage(driver);
    }
}
