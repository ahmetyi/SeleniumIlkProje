package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day06_Facebook {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Ismail/selenium/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        WebElement emailkutu= driver.findElement(By.id("email"));
        emailkutu.sendKeys("testtechproed@gmail.com");
        WebElement sifrekutu=driver.findElement(By.name("pass"));
        sifrekutu.sendKeys("Test1234!");
        WebElement btn=driver.findElement(By.xpath("//*[@name='login']"));
        btn.click();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }




        String url= driver.getCurrentUrl();
        if(url.contains("https://www.facebook.com/login/")){
            System.out.println("giris basarisiz");
        }else{
            System.out.println("giris basarili");
        }

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        driver.quit();


    }






}
