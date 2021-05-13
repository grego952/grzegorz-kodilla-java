package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String ACCEPT_COOKIES = "//*[@data-testid='cookie-policy-dialog-accept-button']";
    public static final String REGISTER_USER = "//*[@data-testid='open-registration-form-button']";
    public static final String BIRTH_DAY = "//*[@id=\"day\"]";
    public static final String BIRTH_MONTH = "//*[@id=\"month\"]";
    public static final String BIRTH_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement acceptButton = driver.findElement(By.xpath(ACCEPT_COOKIES));
        acceptButton.click();

        WebElement registerButton = driver.findElement(By.xpath(REGISTER_USER));
        registerButton.click();

        Thread.sleep(10*100);

        WebElement selectDay = driver.findElement(By.xpath(BIRTH_DAY));
        Select selectBoard1 = new Select(selectDay);
        selectBoard1.selectByIndex(10);

        WebElement selectMonth = driver.findElement(By.xpath(BIRTH_MONTH));
        Select selectBoard2 = new Select(selectMonth);
        selectBoard2.selectByIndex(12);

        WebElement selectYear = driver.findElement(By.xpath(BIRTH_YEAR));
        Select selectBoard3 = new Select(selectYear);
        selectBoard3.selectByIndex(15);
    }
}
