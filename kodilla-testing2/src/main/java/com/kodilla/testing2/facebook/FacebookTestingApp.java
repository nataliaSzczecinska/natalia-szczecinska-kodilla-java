package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String FACEBOOK_URL = "https://www.facebook.com/";
    public static final String FACEBOOK_COOKIES_ACCEPT = "//*[@data-testid='cookie-policy-dialog-accept-button']";
    public static final String FACEBOOK_REGISTER = "//*[@data-testid='open-registration-form-button']";
    public static final String DAY_OF_BIRTH = "//*[@id=\"day\"]";
    public static final String MONTH_OF_BIRTH = "//*[@id=\"month\"]";
    public static final String YEAR_OF_BIRTH = "//*[@id=\"year\"]";


    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get(FACEBOOK_URL);

        WebElement cookies = webDriver.findElement(By.xpath(FACEBOOK_COOKIES_ACCEPT));
        cookies.click();
        Thread.sleep(2000);

        WebElement register = webDriver.findElement(By.xpath(FACEBOOK_REGISTER));
        register.click();
        Thread.sleep(2000);

        WebElement dayOfBirth = webDriver.findElement(By.xpath(DAY_OF_BIRTH));
        Select selectDay = new Select(dayOfBirth);
        selectDay.selectByValue("12");

        WebElement monthOfBirth = webDriver.findElement(By.xpath(MONTH_OF_BIRTH));
        Select selectMonth = new Select(monthOfBirth);
        selectMonth.selectByValue("4");

        WebElement yearOfBirth = webDriver.findElement(By.xpath(YEAR_OF_BIRTH));
        Select selectYear = new Select(yearOfBirth);
        selectYear.selectByValue("1992");
    }
}