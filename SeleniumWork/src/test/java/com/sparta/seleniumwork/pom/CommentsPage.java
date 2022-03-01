package com.sparta.seleniumwork.pom;

import org.openqa.selenium.WebDriver;

public class CommentsPage {
    private WebDriver driver;

    public CommentsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
