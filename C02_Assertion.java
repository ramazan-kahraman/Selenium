package day06_assertions;

import org.junit.Assert;
import org.junit.Test;

public class C02_Assertion {

    /*
        JUnit framework'u calistirilan testlerin passed veya failed olmasini raporlar
        Ancak raporlamanin dogru sonuc vermesi icin
        Test'lerin Asser class'indaki hazir methodlarla yapilmasi gerekir.

        Eger Assert class'i kullanilmazsa
        JUnit kodlarin sorunsuz olarak calisip bittigini raporlar
        C01'de testleri if-else ile yaptigimiz icin
        Testler failed olsa da kodlar sorunsuz calistigi icin
        testler yesil tik olarak isaretlendi

     */

    int p1yas=60;
    int p2yas=66;
    int p3yas=70;

    @Test
    public void test01(){
        // emekli yasi 65 olduguna göre;
        // p2 nin emekli olabilecegini test edin

        Assert.assertTrue(p2yas>65);
    }

    @Test
    public void test02(){
        // emekli yasi 65 olduguna göre;
        // p1 in emekli olamayacagini test edin

        Assert.assertFalse(p1yas>65);
    }

    @Test
    public void test03(){
        // emekli yasi 65 olduguna göre;
        // p3 un emekli olamayacagini test edin

        Assert.assertFalse("Girilen yas 65'den kucuk olmadigindan emekli olabilir:",p3yas>65);
    }
}
