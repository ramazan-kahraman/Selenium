package day07_dropdown_isAlerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_JsAlerts {

    // Gerekli ayarlamalari yapip
    // https://the-internet.herokuapp.com/javascript_alerts adresine gidin
    // 3 test method u olusturup her method da bir JsAlert'e basin
    // İlgili methodlari kullanin

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @AfterClass
    public static void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //1.Alert e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        //Alertteki yazinin "ı am a JS Alert" oldugunu test edelim

        String actualAlertyazisi = driver.switchTo().alert().getText();
        String expectedAlertYazisi = "I am a JS Alert";

        Thread.sleep(3000);

        Assert.assertEquals(expectedAlertYazisi,actualAlertyazisi);
        //Ok tusuna basip geri kapatalim

        driver.switchTo().alert().accept();
    }
}
