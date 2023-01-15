package tests.day14_tetsNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utulities.Driver;

public class C03_NutellaTesti {

    @Test
    public void test01(){

        //amazon anasayfaya gidin

        Driver.getDriver().get("https://www.amazon.com");
        //nutella icin arama yapin
        WebElement aramakutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("Nutella"+ Keys.ENTER);

        //sonuclarin nutella icerdigini test edin
        WebElement aramaSonucuElementi=Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String expectedKelime="Nutella";
        String actualAramaSonucu=aramaSonucuElementi.getText();

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

        Driver.closeDriver();
    }
}
