package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        //get ile aynı işlevi yapar.

        Thread.sleep(3000);
        driver.get("https://www.mynet.com");

        Thread.sleep(3000);
        // yeniden amazona dönelim
        driver.navigate().back();

        Thread.sleep(3000);
        // tekrar mynet e gitmek istersek
        driver.navigate().forward();


        Thread.sleep(3000);
        driver.quit();

    }
}
