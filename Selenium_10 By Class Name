package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    public static void main(String[] args) throws InterruptedException {

        // amazona gidip nutella için arama yapin
        // ilk sayfada çıkan ürünlerin icerisinde
        // en yüksek fiyati bulun

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        List<WebElement> fiyatlarListesi=driver.findElements(By.className("a-price-whole"));

        // WebElement bir obje olduğundan, direk yazdırılamaz
        System.out.println(fiyatlarListesi);

        // Bunun için for-each loop kullanarak
        // herbir webelement uzerindeki yazilari tek tek yazdirmalıyız

        for (WebElement each: fiyatlarListesi
             ) {
            System.out.print(each.getText()+ " ");
        }

        // en yuksek fiyati bulabilmek için java bilgimizi kullanmaliyiz
        // 1-web elementlerden getText ile fiyati String olarak alin
        // 2-string fiyati kiyaslama yapabilmek için integer a cevirin
        // 3-en yuksek fiyati bulup yazdirin

        String fiyatStr;
        Integer fiyatınt;
        Integer enYuksekFiyat=0;

        for (WebElement each: fiyatlarListesi
        ) {
            fiyatStr=each.getText();
            fiyatınt=Integer.parseInt(fiyatStr);

            if (fiyatınt>enYuksekFiyat){
                enYuksekFiyat=fiyatınt;
            }

        }

        System.out.println("");
        System.out.println("En yuksek urun fiyati : "+enYuksekFiyat);
        Thread.sleep(3000);
        driver.close();
    }
}
