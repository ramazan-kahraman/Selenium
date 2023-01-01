package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class C06_DriverManageMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // implicitly gittığımız sayfa açılıncaya veya aradığımız webelemen bulununcaya kadar
        // driver in bekleyebileceği max süreyi belirler

        /*
        Bu dörtlü her test method'unun basına yazılacak
         */
    }
}
