package tests.day14_TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_DriverIlkTest {
    /*
    POM'da driver olusturmak icin inheritance ile kullandigimiz
    testbase classi yerine static yollarla ulasabilecegimiz
    bir method kullanılmasi tercih edilmistir.

    Driver bizim icin cok onemli oldgndan driver icin bagimsiz bir class olusturucagz

     */
    @Test
    public void test01(){


        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get("https://www.wisequarter.com");
        Driver.getDriver().get("https://www.youtube.com");
        Driver.getDriver().get("https://www.amazon.com");

        //nutella aramasi yapin
        WebElement aramaKutusu =Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //sonuclarin nutella icerdigini test edin
        WebElement sonucelementi =Driver.getDriver().findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        String actualelement = sonucelementi.getText();
        String expectedelement="Nutella";
        ReusableMethods.bekle(2);
        Driver.closeDriver();



    }

}
