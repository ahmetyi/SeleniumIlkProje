package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Ismail/selenium/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");

        String sayfaTitle=driver.getTitle();
        String sayfaUrl=driver.getCurrentUrl();

        System.out.println(sayfaTitle);
        System.out.println(sayfaUrl);

    }
}
