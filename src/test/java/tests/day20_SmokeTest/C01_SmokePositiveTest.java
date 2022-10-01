package tests.day20_SmokeTest;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_SmokePositiveTest {

    @Test
    public void test01() {
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));
        /*
          Page class'ındaki locate'lerimize ulaşabilmek için
          Page classımızdan bir obje oluşturarak, oluşturmuş olduğumuz obje ile
          page classımızdaki locate'lerimize ulaşabiliriz
             */

        // login butonuna bas
        hotelMyCampPage.logIn.click();

        //test data username: manager ,
        hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("username"));

        // test data password : Manager1!
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("password"));

        //Giris tusuna click yapin
        hotelMyCampPage.logIn2.click();


        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapildi.isDisplayed());

    }

}
