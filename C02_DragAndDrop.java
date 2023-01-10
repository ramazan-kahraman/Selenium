package day09_actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utulities.ReuseableMethods;
import utulities.TestBase;

public class C02_DragAndDrop extends TestBase {

    @Test public void test01(){

        // https://demoqa.com/droppable adresine gidelim

        driver.get("https://demoqa.com/droppable");

        // "Drag me" butonunu tutup "Drop here" kutusunun ustune birakalim

        WebElement dragMeElementi=driver.findElement(By.id("draggable"));
        WebElement birakilacakAlanElementi=driver.findElement(By.id("droppable"));

        Actions actions=new Actions(driver);

        actions.dragAndDrop(dragMeElementi,birakilacakAlanElementi).perform();

        ReuseableMethods.bekle(3);

        // "Drop here" yazisi yerine "Dropped" oldugunu test edelim.

        WebElement droppedYaziElementi=driver.findElement(By.xpath("//*[text()='Dropped!']"));

        Assert.assertTrue(droppedYaziElementi.isDisplayed());
    }
}
