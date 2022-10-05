package tests.day21;

import org.testng.annotations.Test;
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
}
