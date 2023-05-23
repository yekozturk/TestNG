package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    /*
    page classlari surekli kullandigimiz locate isilemleri ve varsa
    login gibi kucuk islecleri iceren methodlar barindirir.
    selenium ile herhangi bir locate gerceklestirmek istedigimizde
    web driver objesine ihtiyac vardir.
    POM'da driver classinda olusturdgumuz web driver driver objesni
    page classlarina tanimlamak icin PageFaactory classindan
    initElements() kullanilir.
     */
public AmazonPage(){

    PageFactory.initElements(Driver.getDriver(),this);
    //bu ayari constructor icine koyma sebebimiz
    //page sayfalarina obje olusıturarak ulasıldıgı icin
    //kim page sayfasindan kullanmak isterse page sayfasindan
    //obje olustrumak icin constructor calisacak ve bu constructorin
    //icinde bulunan initelement methodu gerekli ayari yapmis olacak


}

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath ="(//div[@class='sg-col-inner'])[1]")
    public WebElement aramaSonucuElementi;


}

