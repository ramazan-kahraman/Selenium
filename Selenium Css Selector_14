package day04_xpathh_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CssSelector {
    public static void main(String[] args) throws InterruptedException {

        //1- Gerekli ayarlari yapin
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        //2- https://www.amazon.com adresine gidin Browseri tam sayfa yapin
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        //3- Sayfayi "refresh yapin
        driver.navigate().refresh();

        //4- Sayfa basliginin "Spend Less" ifadesi icerdigini test edin
        String expectedMetin="Spend less";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedMetin)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
        }

        //5- Gift Cards sekmesibe basin
        driver.findElement(By.linkText("Gift Cards")).click();
        Thread.sleep(3000);

        //7- Birthday butonuna basin
        driver.findElement(By.linkText("Birthday")).click();

        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.cssSelector("(div[data-asin='B0B5QKJTR6'])[1]")).click();
        //9- Gift Card details'den 25$ i secin
        //10- Urun ucretinin 25$ oldugunu test edin
        //11- Sayfayi kapatin

        Thread.sleep(3000);
        driver.close();
    }
}
