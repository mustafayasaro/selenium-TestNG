package tests.day21;

import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.animation.model.KeyframeStyle;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotRusableMethod {


    @Test
    public void test01() throws IOException {
        //hepsiBurada sayfasina gidip ve sayfanin ekran goruntusunu aliniz
        Driver.getDriver().get("https://www.hepsiburada.com");
        ReusableMethods.getScreenshot("hepsburada");
        //sayfayi kapatiniz
        Driver.closeDriver();
    }


    @Test
    public void test02() throws IOException {
        //Amazon sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();

        //nutella arat8iniz
        amazonPage.aramaKutusu.sendKeys("nutella", Keys.ENTER);

        //arama sonuc yazisi Webelementinin resmini aliniz


        ReusableMethods.getScreenshotWebElement("aramaSonuWE", amazonPage.aramaSonucElementi);

        //Sayfayi kapatiniz
        Driver.closeDriver();

    }
}
