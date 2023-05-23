package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C01_PagesIlkTest {

    @Test
    public void amazontest() {
        //amazona git
        Driver.getDriver().get("https://www.amazon.com");


        //nutella arat
        //arama kutusunun locate i page sayfasinda
        //POM'de pages sayfasindaki locate'lere erismek icin
        //pages sayfalarindan bir obje olusturulur.

        AmazonPage AmazonPage =new AmazonPage();
        AmazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //sonuclar nutelka iceriyor mu test et
        String expected="Nutella";
        String actual=AmazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actual.contains(expected));

        //sayfayi kapat
        Driver.closeDriver();
    }
}
