package tests.day18;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_PositiveTest {

    @Test
    public void test01() {
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        // login butonuna bas
        hotelMyCampPage.logIn.click();

        //test data username: manager ,
        hotelMyCampPage.userName.sendKeys("manager");

        // test data password : Manager1!
        hotelMyCampPage.password.sendKeys("Manager1!");

        //Giris tusuna click yapin
        hotelMyCampPage.logIn2.click();


        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

    }
}
