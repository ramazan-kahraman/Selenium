package day10_FileTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utulities.ReuseableMethods;
import utulities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.PublicKey;

public class C02_FileDownloadTest extends TestBase {

    @Test
    public void test01(){

        // https://the-internet.herokuapp.com/download adresine gidelim

        driver.get("https://the-internet.herokuapp.com/download");
        // facebookd.png dosyasini indirelim

        driver.findElement(By.xpath("//a[text()='logo.jpeg']")).click();
        ReuseableMethods.bekle(5);

        // dosyanin basariyla indirilip indrilmedigini test edelim

        //Test icin oncelikle dosyanin indirildiginde dosyaYolu ne olacak bunu olusturmaliyiz
        String dosyaYolu=System.getProperty("user.home")+"\\Downloads\\logo (2).jpeg";

        //Bir dosyanin bilgisayarimizda var oldugunu(exist) test etmek icin
        //Javadaki Files classindna yardim alacagiz.

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));


    }
    @Test
    public void test02(){

        //Masaustunde merhabajava.docx oldugunu test edin

        //dinamik dosyaYolu olusturalim
        String dosyaYolu=System.getProperty("user.home")+"\\Desktop\\merhabajava.docx";

        //Assert edelim

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
