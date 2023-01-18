package tests.day16_SmokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.ReuseableMethods;

public class C02_NegatifLoginTesti {

    //3 test methodu olusturun
    //1.de yanlıs mail, dogru sifre
    //2.de dogru mail, yanlis sifre
    //3 de yanlis mail, yanlis sifre ile giriş yapmayi deneyin
    //giris yapilamadigini test edin

    QualitydemyPage qualitydemyPage=new QualitydemyPage();

    @Test
    public void yanlisEmailTesti(){

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
        ReuseableMethods.bekle(2);
        Driver.closeDriver();

    }

    @Test
    public void yanlisPasswordTesti(){

        qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
        ReuseableMethods.bekle(2);
        Driver.closeDriver();

    }

    @Test
    public void yanlisUsernameYanlisPasswordTesti(){

        qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
        ReuseableMethods.bekle(2);
        Driver.closeDriver();
    }
}
