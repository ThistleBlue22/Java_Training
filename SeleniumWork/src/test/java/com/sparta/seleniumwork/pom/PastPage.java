package com.sparta.seleniumwork.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.LocalDate;

public class PastPage {
    private WebDriver driver;

    By pagetop = new By.ByClassName("pagetop");

    public PastPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDateYesterday() {
        LocalDate localDate = LocalDate.now();
        LocalDate yesterdayDate = localDate.minusDays(1);
        String titleBar = driver.findElement(pagetop).getText();
        return titleBar.contains(yesterdayDate.toString());
    }


}
