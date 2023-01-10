package day09_actions;

import org.apache.hc.core5.http.protocol.RequestUserAgent;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utulities.ReuseableMethods;
import utulities.TestBase;

import javax.swing.*;
import java.util.Set;

public class C01_MouseActions extends TestBase {

    @Test
    public void test01(){
        // yeni bir class olusturalim: MouseActions1
        // https://the-internet.herokuapp.com/context_menu sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");

        //cizili alan uzerinde sag click yapin
        Actions actions=new Actions(driver);
        WebElement ciziliAlanElementi=driver.findElement(By.xpath("//*[@id='hot-spot']"));

        actions.contextClick(ciziliAlanElementi).perform();

        // alertte cikan yazinin " you selected a context menu" oldugunu test edin
        String expectedAlerYazisi="You selected a context menu";
        String actualAlertYazisi=driver.switchTo().alert().getText();

        Assert.assertEquals(expectedAlerYazisi,actualAlertYazisi);

        // tamam diyerek alerti kapatin
        driver.switchTo().alert().accept();

        // elemental selenium linkine tiklayalim


        String ilkSayfaWHD= driver.getWindowHandle();
        driver.findElement(By.linkText("Elemental Selenium")).click();

        // acilan sayfada h1 taginda"elemental selenium" yazdigini test edin.
        Set<String> ikiSayfaninWHDSeti=driver.getWindowHandles();

        String ikinciSayfaWHD="";

        for (String eachWHD: ikiSayfaninWHDSeti
             ) {
            if (!eachWHD.equals(ilkSayfaWHD)){
                ikinciSayfaWHD=eachWHD;
            }
            
        }
        driver.switchTo().window(ikinciSayfaWHD);

        String expectedYeniSayfaYazi="Elemental Selenium";
        String actualYeniSayfaYazi=driver.findElement(By.tagName("h1")).getText();

        Assert.assertEquals(expectedYeniSayfaYazi,actualYeniSayfaYazi);

        ReuseableMethods.bekle(3);

    }
}
