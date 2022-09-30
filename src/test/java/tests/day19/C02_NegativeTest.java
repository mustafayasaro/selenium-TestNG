package tests.day19;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_NegativeTest {

    @Test
    public void test01() {

        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //login butonuna bas
        hotelMyCampPage.logIn.click();

        //test data username: manager ,
        hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));

        // test data password : Manager1!
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hmcWrongPassword"));

        //Giris tusuna click yapin
        hotelMyCampPage.logIn2.click();


        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapilamadi.isDisplayed());

        // Sayfayi kapatalim
        Driver.closeDriver();
    }
}
