package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.WebDriver.*;

public class day01_IlkDers {

    public static void main(String[] args) {
    //Java Projemize,chrome driver'i tanittik
        System.setProperty("webdriver.chrome.driver","C:/Users/Ismail/selenium/drivers/chromedriver.exe");

        //selenium ile ilgili ilk kodumuz
        WebDriver webDriver=new ChromeDriver();

        //driverimiza google gitmesini söyledik
    webDriver.get("https://google.com");

    //driverdaki acikolan pencereyi kapatir.
    webDriver.close();

    //driveri komple kapatiyor.

     webDriver.quit();

    }
}
