package tests.day14_TestNGFramework;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C02_Ignore {
/*
ignore basina yazildigi testin ignore edilmesini saglar
ne passed ne fail olur, hatta hic calistirilmaz.
oncelik sirasina da sokulmaz.
 */


    @Test
    public void youtubeTesti(){
        System.out.println("Youtube");
    }
    @Test(priority = 3) @Ignore
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }
    @Test
    public void amazonTesti(){
        System.out.println("Amazon");
    }
}
