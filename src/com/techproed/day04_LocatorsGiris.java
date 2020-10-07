package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day04_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Ismail/selenium/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        WebElement signInLinki=driver.findElement(By.id("sign-in"));
        signInLinki.click();

        WebElement emailkutu = driver.findElement(By.className("form-control"));
        emailkutu.sendKeys("testtechproed@gmail.com");

        WebElement sifrekutu=driver.findElement(By.id("session_password"));
        sifrekutu.sendKeys("Test1234!");


    }

}
