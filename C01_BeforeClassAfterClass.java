package day06_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_BeforeClassAfterClass {

    // 3 ayri test methodu olusturun
    // 1.methodda amazon'a gidip, amazona gittigimizi test edin
    // 2.methodda amazon'da nutella aratip, sonuclarin nutella icerdigini test edin
    // 3.methodda nutella arama sonuc sayisinin 50 den fazla oldugunu test edin

   static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public static void teardown() {
        driver.close();
    }

    @Test
    public void test01() {
        // 1.methodda amazona gidip, amazona gittigimizi test edin
        driver.get("https://www.amazon.com");

        String expextedKelime = "Amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expextedKelime)) {
            System.out.println("Amazon gidis testi PASSED");
        } else {
            System.out.println("Amazon gidis testi FAILED");
        }

    }

    @Test
    public void test02() {
        //2.methodda amazonda nutella aratip, sonuclarin nutella icerdigini test edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        String expextedKElime = "Nutella";
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String sonucYazisiStr = sonucYaziElementi.getText();

        if (sonucYazisiStr.contains(expextedKElime)) {
            System.out.println("Nutella arama testi PASSED");
        } else {
            System.out.println("Nutella arama testi FAILED");
        }
    }

    @Test
    public void test03() {
        // 3.methodda nutella arama sonuc sayisinin 50 den fazla oldugunu test edin
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String sonucYazisiStr = sonucYaziElementi.getText();

        String[] sonucYazisiArr = sonucYazisiStr.split("");
        String sonuAdediStr = sonucYazisiArr[2];
        int actualSonucAdediInt = Integer.parseInt(sonuAdediStr);

        int expectedAramaSonucusayisi = 50;

        if (actualSonucAdediInt>expectedAramaSonucusayisi){
            System.out.println("Nutella arama sonuc sayisi testi PASSED");
        }else {
            System.out.println("Nutella arama sonuc sayisi testi FAILED");
        }


    }
}