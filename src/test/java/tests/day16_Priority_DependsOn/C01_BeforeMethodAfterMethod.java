package tests.day16_Priority_DependsOn;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod {

    /*
         TestNG (default) olarak @Test methodlarıni alfabetik sıraya göre run eder. (Yukardan asagi degil!)
         priority annotation Testlere öncelik vermek için kullanılır.
        Kucuk olan Numara daha once calisir priority yazmayan Test method'u varsa oncelikle o calisir,
        sonra priority yazan testler siralanir
 */


    @Test(groups = "gp1")
    public void amazonTesti() {
        driver.get("https://www.amazon.com");

    }

    @Test
    public void bestbuyTesti() {
        driver.get("https://www.bestbuy.com");

    }

    @Test
    public void techproeducationTesti() {
        driver.get("https://www.techproeducation.com");

    }


}
