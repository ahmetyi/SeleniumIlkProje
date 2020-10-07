package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day04_GoogleTest {

public static void main(String[] args){

    System.setProperty("webdriver.chrome.driver", "C:/Users/Ismail/selenium/drivers/chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("http://www.google.com/");
    WebElement aramakutusu = driver.findElement(By.name("q"));
    aramakutusu.sendKeys("city bike");
    aramakutusu.submit();
    WebElement sonucsayi= driver.findElement(By.id("result-stats"));
    System.out.println(sonucsayi.getText());
    WebElement shopping=driver.findElement(By.partialLinkText("Shopping"));
    shopping.click();





}
}
