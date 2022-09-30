package tests.day18_Configuration.Properties;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C01_PageClassFaceBookTest {

    @Test
    public void test01() {
        Faker faker = new Faker();
        FacebookPage facebookPage = new FacebookPage();
        //https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        facebookPage.cookieButonu.click();

        //POM’a uygun olarak email, sifre kutularini ve giris yap
        //butonunu locate edin
        //Faker class’ini kullanarak email ve sifre degerlerini
        //yazdirip, giris butonuna basin

        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.password.sendKeys(faker.internet().password());
        facebookPage.logInButton.click();

        //Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.basarisizGiris.isDisplayed());
    }
}
