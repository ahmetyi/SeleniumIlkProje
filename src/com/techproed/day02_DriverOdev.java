package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_DriverOdev {
    //1)ilk önce google.com a gidelim.
    //2)sayfanin title alalim ve ekrana yazdiralim.
    //3)daha sonra youtube.com'a gidelim.
    //4)sayfanin title'ni ve url'ini alalim ve ekrana yazdiralim.
    //5)google.com ' a geri gidelim ve sayfanin urlsini alip ekrana yazdiralim.
    //6)driver'i kapatalim.

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Ismail/selenium/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        String Title=driver.getTitle();
        System.out.println(Title);
        driver.navigate().to("http://youtube.com");
        String titl=driver.getTitle();
        System.out.println(titl);
        String urly=driver.getCurrentUrl();
        System.out.println(urly);
        driver.navigate().back();
        String urlg=driver.getCurrentUrl();
        System.out.println(urlg);
        driver.quit();





    }









}
