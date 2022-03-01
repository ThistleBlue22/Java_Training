package com.sparta.hackernews.pom;

import org.openqa.selenium.WebDriver;

public class FAQPage {
    private WebDriver driver;

    public FAQPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}

