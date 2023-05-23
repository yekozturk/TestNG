package tests.day14_TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C03_DependOnMethods {

    /*
    depends on method oncelik sirasina karismaz.
    depends on methods bir test methodunun calismasini baska bir kethodun
    calisip passed olmasina baglar.
    baglanilan method calismaz veya calisir
    ama failed olursa
    baglanan meethod hic calismaz.

    @test sayesinde her method tek basina calisabilir.
    ancak bir test depends on method ile baska bir teste baglandiysa
    tek basina calismasi istendiginde bagli oldugu diger method da
    calisir

    bu baglanti 3 veya daha fazla method arasinda olursa
    3 u birden calismaz. max 2 test calisabilir.
     */
    @Test (dependsOnMethods = "wiseTesti")
    public void youtubeTesti(){
        System.out.println("Youtube");
        Assert.assertTrue(8==8);//passed
    }
    @Test(priority = 3)
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }

    @Test(dependsOnMethods = "youtubeTesti")
    public void amazonTesti(){
        System.out.println("Amazon");
    }
}
