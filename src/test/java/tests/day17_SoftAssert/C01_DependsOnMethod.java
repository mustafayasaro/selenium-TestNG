package tests.day17_SoftAssert;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_DependsOnMethod extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
    }

    @Test (dependsOnMethods = "test01")
    public void test02()  {
        driver.get("https://www.hepsiburada.com");
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void test04() {
        driver.get("https://www.youtube.com");
    }
}
