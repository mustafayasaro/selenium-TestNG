package tests.day17_SoftAssert;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;


public class C05_PageClass {

    @Test
    public void test01() {

        AmazonPage amazon = new AmazonPage();
        Driver.getDriver().get("https://www.amazon.com");
        amazon.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }
}
