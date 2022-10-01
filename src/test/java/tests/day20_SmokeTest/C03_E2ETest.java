package tests.day20_SmokeTest;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_E2ETest {

    @Test
    public void E2ETest() throws InterruptedException {

        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
        //a. Username : manager
        //b. Password : Manager1!
        //5. Login butonuna tıklayın.

        hotelMyCampPage.logIn.click();
        hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("username"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).
                sendKeys(Keys.ENTER).perform();

        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        hotelMyCampPage.hotelManagement.click();//hotelManagement
        hotelMyCampPage.roomReservation.click(); //roomReservation
        hotelMyCampPage.addRoomReservation.click();

        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        //8. Save butonuna tıklayın.
        Faker faker =new Faker();
        hotelMyCampPage.idUser.sendKeys("manager");
        actions.sendKeys(Keys.TAB).sendKeys("Happy Hotel").
                sendKeys(Keys.TAB).sendKeys("15000").
                sendKeys(Keys.TAB).sendKeys("10/02/2022").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("10/13/2022").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("2").
                sendKeys(Keys.TAB).sendKeys("2").
                sendKeys(Keys.TAB).sendKeys(faker.name().fullName()).
                sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).
                sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress()).
                sendKeys(Keys.TAB).sendKeys("adsaasfasfasfasf").
                sendKeys(Keys.TAB).sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();


        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        Thread.sleep(3000);
        Assert.assertTrue(hotelMyCampPage.reservasyonText.isDisplayed());

        //10. OK butonuna tıklayın.
        hotelMyCampPage.reservasyonTextOkButton.click();

    }
}
