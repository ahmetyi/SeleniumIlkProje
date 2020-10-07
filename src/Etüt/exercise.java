package Etüt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class exercise {
    /*
...Exercise1...
1-driver olusturalim
2-java class'imiza chromedriver.exe'yi tanitalim
3-driver'in tum ekrani kaplamasini saglayalim
4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
  söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
5-"sahibinden.com" adresine gidelim
6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
7-title ve url'nin "Kiralik" kelimesinin icerip icermedigini kontrol edelim
8-Ardindan "gittigidiyor.com" adresine gidelim
9-bu adresin basligini alalim ve "alisveris" kelismesini icerip icermedigini
  kontrol edelim
10-Bi onceki web sayfamiza geri donelim
11-sayfayi yenileyelim
12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
13-Enson adim olarak butun sayfalarimizi kapatmis olalim
 */
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Ismail/selenium/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://sahibinden.com");
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        if(title.contains("Alışveriş")){
            System.out.println("icerir");
        }else {
            System.out.println("icermiyor");
        }
        driver.navigate().to("http://gittigidiyor.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.close();
        driver.quit();








    }



}
