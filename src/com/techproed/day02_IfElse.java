package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Ismail/selenium/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        String baslik=driver.getTitle();
        if (baslik.contains("Books")){
            System.out.println("books kelimesi iceriyor."+baslik);
        }else {
            System.out.println("books kelimesi icermiyor."+baslik);
        }
        driver.quit();







    }
}
