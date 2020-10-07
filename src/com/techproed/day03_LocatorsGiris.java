package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day03_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Ismail/selenium/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //ilk webelementimzi buluyoruz.

        WebElement signInLinki=driver.findElement(By.id("sign-in"));
        signInLinki.click();

        WebElement emailkutusu=driver.findElement(By.id("session_email"));
        emailkutusu.sendKeys("testtechproed@gmail.com");

        WebElement sifre=driver.findElement(By.id("session_password"));
        sifre.sendKeys("Test1234!");

        WebElement signInBtn= driver.findElement(By.name("commit"));
        signInBtn.click();

        String baslik=driver.getTitle();

        if(baslik.equals("Address Book")){
            System.out.println("Giris Basarili");
        }else {
            System.out.println("Giris Basarisiz");
        }

        driver.quit();




    }
}
