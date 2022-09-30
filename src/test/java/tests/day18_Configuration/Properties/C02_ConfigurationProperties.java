package tests.day18_Configuration.Properties;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {

    @Test
    public void test01() {
        String urlAmazon = ConfigReader.getProperty("amazonUrl");
        Driver.getDriver().get(urlAmazon);

        String urlFace = ConfigReader.getProperty("faceUrl");
        Driver.getDriver().get(urlFace);


    }
}
