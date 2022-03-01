package com.sparta.hackernews.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LogInPage {
    private WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    public void logIntoTheWebsite(String user, String password) {
        driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr[1]/td[2]/input")).sendKeys(user);
        driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr[2]/td[2]/input")).sendKeys(password, Keys.ENTER);
    }




}
