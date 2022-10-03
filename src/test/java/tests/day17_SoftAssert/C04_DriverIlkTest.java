package tests.day17_SoftAssert;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_DriverIlkTest {

    /*
    TestBase class'ina extends ederek kullandigimiz driver yerine
    artik Driver class'indan kullancagimiz static olan   getDriver()
    method'unu kullaniriz
    extends yaptigimizda sadece bir classi extends yapabiliriz
    yani ya before After ya da BeforeClass AfterClass'i
    secebiliyoruz ama bu sekilde olunca
    bir sürü farklı sayfadan istediğimiz methodu çağırabiliriz
     */
    @Test
    public void test01() {
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get("https://www.youtube.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://www.bestbuy.com");
    }
}
