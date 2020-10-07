package Etüt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class exercise02 {
   /* sahibinden.com'a asagidaki bilgilerle "Locators" yardimi ile uye olalim
    NOTE: 8 adet Locators vardir lutfen hepsini kullanmaya calisiniz..
    ad    : team
    soyad : 04
    adres : team04.testers@gmail.com
    sifre : team04!!!
            1-driver olusturalim
2-java class'imiza chromedriver.exe'yi tanitalim
3-driver'in tum ekrani kaplamasini saglayalim
            4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
5-"sahibinden.com" adresine gidelim
6-"uye ol" webelementini bulalim ve tiklayalim
7- Acilan "uye ol" sayfasindaki "Bireysel" webelementini bulalim ve tiklayalim
8-"Adiniz" webelementini bulalim, tiklayalim ve adimizi yazalim
9-"Soyadiniz" webelementini bulalim, tiklayalim ve soyadimizi yazalim
10-"E-posta Adresiniz" webelementini bulalim, tiklayalim ve dolduralim
11-"Sifre" webelementini bulalim, tiklayalim, sifremizi yazalim
12-"Uyelik sozlesmesi ve ekleri kabul ediyorum" kutusunu bulun ve tiklayin
13-"Uye ol" kutusunu bulun ve tiklayin
14-sayfayi yenileyin ve kapatin
 */
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:/Users/Ismail/selenium/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://sahibinden.com");
        WebElement uyeOl=driver.findElement(By.partialLinkText("Üye Ol"));
        uyeOl.click();
        WebElement isim=driver.findElement(By.id("name"));
        isim.sendKeys("ahmet");
        WebElement soyisim=driver.findElement(By.name("surname"));
        soyisim.sendKeys("Yildiz");
        WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("team04.testers@gmail.com");
        WebElement sifre= driver.findElement(By.xpath("//*[@id=\"password\"]"));
        sifre.sendKeys("team04!!!");
    }
}
