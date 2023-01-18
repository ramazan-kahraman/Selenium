package tests.day16_SmokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.ReuseableMethods;


public class C01_PozitifLoginTest {

    @Test
    public void pozitifLoginTest(){

        //qualitydemy anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUserName"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        qualitydemyPage.loginButonu.click();

        ReuseableMethods.bekle(2);
        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());
        Driver.closeDriver();
    }
}
