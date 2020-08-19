package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_NavigationOdev {
    //1google.com gidiniz.
    //2.oradan youtube.com a gidiniz.
    //3.google.com'a back ile geri dönünüz.
    //4.youtube.com'a geri giriniz.(forward)
    //5.refresh methoduyla yenileyiniz.
    //6.driver'i kapatin.

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:/Users/Ismail/selenium/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://google.com");
        driver.navigate().to("http://youtube.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }







}
