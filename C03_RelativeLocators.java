package day04_xpathh_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C03_RelativeLocators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        //2- Berlin'i 3 farkli relative locator ile locate edin

        //A- Sailor un ustundeki diyelim
        WebElement sailorElementi=driver.findElement(By.xpath("//p[text()='Sailor']"));
        WebElement berlin1=driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailorElementi));

        //B- Boston ın sagi diyelim
        WebElement bostonElementi=driver.findElement(By.xpath("//p[text()='Boston']"));
        //Tarif etmek istediginiz web elementin bir ozelligini kullanmalisiniz
        //Ornegin tagName=img
        WebElement berlin2=driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(bostonElementi));

        //C- NYC'nin alti diyelim
        WebElement nyc=driver.findElement(By.xpath("//p[text()='NYC']"));
        WebElement berlin3=driver.findElement(RelativeLocator.with(By.tagName("img")).below(nyc));

        //Eger bir tane elementten tarif ettigimizde yine de bulamazsak
        //birden fazla elementi refere edebiliriz.

        WebElement berlin4=driver.findElement(RelativeLocator.with(By.tagName("img")).below(nyc).toRightOf(bostonElementi).above(sailorElementi));

        //3- Relative locator^larin dogru calistigini test edin
        // id'si= pid7_thumb oldugunu test edelim

        String expectedIdDegeri="pid7_thumb";
        String actualIdDegeri=berlin2.getAttribute("Id");

        if (expectedIdDegeri.equals(actualIdDegeri)){
            System.out.println("Relative locator testi PASSED");
        }else {
            System.out.println("Relative locator testi FAILED");
        }

    }
}
