package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Ismail/selenium/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://youtube.com");
        String titleyou=driver.getTitle();
        if(titleyou.contains("video")){
            System.out.println("video kelimesi iceriyor");
        }else {
            System.out.println("Video kelimesi icermiyor.");
        }
        driver.quit();

    }
}
