package com.sparta.seleniumwork.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    By commentsLink = new By.ByLinkText("comments");
    By past = new By.ByLinkText("past");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public CommentsPage goToCommentsPage() {
        driver.findElement(commentsLink).click();
        return new CommentsPage(driver);
    }

    public PastPage goToPastPage() {
        driver.findElement(past).click();
        return new PastPage(driver);
    }
}
