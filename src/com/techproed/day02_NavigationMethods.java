package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_NavigationMethods {
public static void main(String[] args){
    //java projemize chromedrive i tanittik
    System.setProperty("webdriver.chrome.driver","C:/Users/Ismail/selenium/drivers/chromedriver.exe");

    WebDriver driver=new ChromeDriver();

    //driver'in tüm ekrani kaplamasini saglar.
    driver.manage().window().maximize();

    //driver'a google'a gitmesini söyledik.
    driver.get("http://google.com");

    //get komutuyla ayni islemiyle yapar.
    driver.navigate().to("http://amazon.com");

    //navigate().back() methodu bir önceki sayfaya geri dönmeye yarar.(google'a geri döner)
    driver.navigate().back();

    //navigate().forward() methodu geri geldigimiz sayfaya gitmemizi saglar.(amazona geri gider.)
    driver.navigate().forward();

    //navigate().refresh() sayfayi yeniler.
    driver.navigate().refresh();



}





}
