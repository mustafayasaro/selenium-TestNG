package tests.day20_SmokeTest;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_SmokeNegativeTest {

    @Test
    public void yanlisKullanici() {

        /*
        Yanlis kullanici adi :
        Dogru password :
         */


            HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
            // https://www.hotelmycamp.com/ adresine git
            Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

            //login butonuna bas
            hotelMyCampPage.logIn.click();

            //test data username: manager1 ,
            hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));

            // test data password : Manager1!
            hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("password"));

            //Giris tusuna click yapin
            hotelMyCampPage.logIn2.click();


            //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
            Assert.assertTrue(hotelMyCampPage.girisYapilamadi.isDisplayed());

            // Sayfayi kapatalim
            Driver.closeDriver();
        }




    @Test
    public void yanlisPassword() {
        /*
        Dogru kullanici adi :
        Yanlis password :
         */

        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //login butonuna bas
        hotelMyCampPage.logIn.click();

        //test data username: manager ,
        hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("username"));

        // test data password : manager1
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hmcWrongPassword"));

        //Giris tusuna click yapin
        hotelMyCampPage.logIn2.click();


        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapilamadi.isDisplayed());

        // Sayfayi kapatalim
        Driver.closeDriver();

    }


    @Test
    public void yanlisKullaniciPassword() {

        /*
        Yanlis kullanici adi :
        Yanlis password :
         */
        /*
        Programdaki değişiklikler, her yeni modül eklendiğinde gerçekleşir.
        Regresyon testi, bu tür her güncellemeden sonra her öğenin etkin bir şekilde çalışmasını sağlar.
        regression — gerileme testi
         */

        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //login butonuna bas
        hotelMyCampPage.logIn.click();

        //test data username: manager1 ,
        hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));

        // test data password : manager1
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hmcWrongPassword"));

        //Giris tusuna click yapin
        hotelMyCampPage.logIn2.click();


        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapilamadi.isDisplayed());

        // Sayfayi kapatalim
        Driver.closeDriver();

    }
}
