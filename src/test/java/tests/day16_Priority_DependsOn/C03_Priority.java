package tests.day16_Priority_DependsOn;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {

    /*
    Testlerimizi colistiriken istedigimiz siraya gore istersek
    @Test anotasyonundan sonra priority'yi kullaniiriz
     */


    @Test(priority = 1)
    public void youtubeTesti() {
        driver.get("https://www.youtube.com");

    }

    @Test(priority = 3)
    public void bestbuyTesti() {
        driver.get("https://www.bestbuy.com");

    }

    @Test(priority = 2, groups = "gp1")
    public void amazonTesti() {
        driver.get("https://www.amazon.com");

    }

    @Test(priority = -1)
    public void hepsiburadaTesti() {
        driver.get("https://www.hepsiburada.com");

    }


}
