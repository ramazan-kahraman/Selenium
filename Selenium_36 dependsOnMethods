package tests.day14_tetsNGFramework;

import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_dependsOnMethods {

    @Test
    public void ilktest(){
        System.out.println("ilk test calisti");
        Assert.assertTrue(5>9);
    }

    @Test(dependsOnMethods = "ilktest")
    public void ikincitest(){
        System.out.println("ikinci test calisti");
    }

    @Test(dependsOnMethods = "ikinciTest")
    public void ucuncutest(){
            System.out.println("ucuncu test calisti");

    }
}
