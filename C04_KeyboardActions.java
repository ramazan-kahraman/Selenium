package day09_actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utulities.ReuseableMethods;
import utulities.TestBase;

public class C04_KeyboardActions extends TestBase {

    @Test
    public void test01(){
        // https://www.amazon.com/ adresine gidelim

        driver.get("https://www.amazon.com/");

        // arama kutusuna Actions methıdlarini kullanarak
        // Samsung A71 yazalim ve ENTER a basarak arama yaptiralim

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        Actions actions=new Actions(driver);

        actions
                .click(aramaKutusu)
                .keyDown(Keys.SHIFT)
                .sendKeys("S")
                .keyUp(Keys.SHIFT)
                .sendKeys("amsung ")
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("71")
                .sendKeys(Keys.ENTER)
                .perform();

        ReuseableMethods.bekle(3);

        // aramanin gerceklestigini test edin

        WebElement sonucYaziElementi=driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));

        String expectedKelime="Samsung A71";
        String actualSonucYazisi=sonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));
    }

}
