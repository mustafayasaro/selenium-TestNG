package tests.day17_SoftAssert;

import org.junit.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class Odev extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void test01() {
        //Bir class oluşturun: DependsOnTest
        //https://www.amazon.com/ adresine gidin.
        driver.get("https://www.amazon.com");

        //Test : Amazon ana sayfaya gittiginizi test edin
        Assert.assertTrue(driver.getCurrentUrl().equals("www.amazon.com") );

        //Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
        //arama yapin ve aramanizin gerceklestigini Test edin


        //Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
        //$16.83 oldugunu test edin
    }
}
