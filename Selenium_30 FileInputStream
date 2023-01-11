package day10_FileTests;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_FileInputStream {

    @Test
    public void test01() throws FileNotFoundException {

        //String dosyaYolu="C:\\Users\\SYDN\\Desktop\\Yeni klasör";

       // FileInputStream fis=new FileInputStream(dosyaYolu);



        /*

        File dosyalarinda genellikle downloads a indirelecek bir dosyanin indirildigini test etmek
        veya masaustundeki bir dosyanin web e yuklenebildigini test etmek isteriz.

        Ancak herkesin bilgisayarinin ismi, kullanici ismi gbii farkliliklar olacagindan testler
        tek bir bilgisayarda calisacak gibi yazilmak zorunda kalinir.

        Bukarisikligin onune gecebilmek icin JAva 2 basit kod blogu sunmus
         */

        System.out.println(System.getProperty("user.dir"));
        //o anda calisan dosyanın(C01_FileInputStream) in yolunu verir
        //C:\Users\SYDN\Desktop\com.Team105Selenium

        System.out.println(System.getProperty("user.home"));
        //kullanicinin temel path ini verir
        //C:\Users\SYDN

        //masaustune gitmek istersek
        //C:\Users\SYDN+desktop eklemek yeterlidir

        //downloadsa gitmek istersek
        //C:\Users\SYDN+downloads eklemek yeterlidir.

        //kodlarimizin dinamik olmasi yani kisinin bilgisayarindaki
        //kullanici adi gibi detaylara takilmamasi icin
        //File testlerinde kullanilacak dosya yolunu
        //user.home.... temel path ini calistigi bilgisayardan alacak sekilde olustururuz.

        //dosyaYolu="C:\\Users\\SYDN\\Desktop\\Yeni klasör"

        String dinamikDosyaYolu=System.getProperty("user.home")+"\\Desktop\\\\Yeni klasör";

    }
}
