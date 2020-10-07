package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day05_Xpath02 {

public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver", "C:/Users/Ismail/selenium/drivers/chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("http://a.testaddressbook.com/sign_in");
    WebElement welcomeyazi= driver.findElement(By.xpath("//h1"));
    System.out.println(welcomeyazi.getText());

    //WebElement welcomeYazisi=driver.findElement(By.tagName("h1"));

}




}
