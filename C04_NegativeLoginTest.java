package tests.day14_tetsNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utulities.Driver;

public class C04_NegativeLoginTest {

    // 3 test methodu olusturun
    // 1.de yanlis email, dogru sifre
    // 2.de dogru email, yanlis sifre
    // 3.de yanlis email, yanlis sifre ile giris yapmayi deneyin
    // giris yapilamadigini test edin

    QualitydemyPage qualitydemyPage=new QualitydemyPage();

    @Test
    public void yanlisEmailTest(){

        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("mehmet@abc.com");
        qualitydemyPage.passwordKutusu.sendKeys("31488081");
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlisPasswordTest(){

        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("user_1106147@login.com");
        qualitydemyPage.passwordKutusu.sendKeys("123456");
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlisEmailyYanlisPassword(){

        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("mehmet@abc.com");
        qualitydemyPage.passwordKutusu.sendKeys("123456");
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
        Driver.closeDriver();
    }
}
