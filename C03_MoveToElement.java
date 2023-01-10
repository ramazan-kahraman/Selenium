package day09_actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utulities.ReuseableMethods;
import utulities.TestBase;

public class C03_MoveToElement extends TestBase {

    @Test
    public void test01(){

        // https://www.amazon.com/ adresinde gidin

        driver.get("https://www.amazon.com/");

        // sag ust bolumde bulunan "Account&Lists" menusunun acilmasi icin
        // mouse u bu menunun uzerine getirin

        WebElement beklenecekElement=driver.findElement(By.id("nav-link-accountList"));
        Actions actions=new Actions(driver);
        actions.moveToElement(beklenecekElement).perform();

        ReuseableMethods.bekle(3);

        // "Create a List" butonuna basin

        driver.findElement(By.xpath("//span[text()='Create a List']")).click();

        // acilan sayfada "Your Lists" yazisi oldugunu test edin

        WebElement yourListElementi=driver.findElement(By.id("my-lists-tab"));

        Assert.assertTrue(yourListElementi.isDisplayed());
    }

}
