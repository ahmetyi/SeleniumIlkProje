package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day05_CssSelector {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:/Users/Ismail/selenium/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        //css selector kullaniyorsak class value kullaniyorsak .value
                                    //id value kullaniyorsak    #value
        WebElement emailkutu= driver.findElement(By.cssSelector("#session_email"));
        emailkutu.sendKeys("testtechproed@gmail.com");
        WebElement sifrekutu= driver.findElement(By.cssSelector("input[placeholder='Password']"));
        sifrekutu.sendKeys("Test1234!");
        sifrekutu.submit();


    }








}
