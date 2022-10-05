package tests.day18_Configuration;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {

    @Test(groups = "gp2")
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
        hotelMyCampPage.userName.sendKeys("manager");

        // test data password : Manager1!
        hotelMyCampPage.password.sendKeys("Manager1!");

        //Giris tusuna click yapin
        hotelMyCampPage.logIn2.click();


        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapildi.isDisplayed());

    }
}
