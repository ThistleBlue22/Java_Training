package com.sparta.hackernews.pom;

import org.openqa.selenium.WebDriver;

public class JobsPage {
    private WebDriver driver;

    public JobsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
