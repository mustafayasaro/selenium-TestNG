package tests.day16;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C04_DependsOnMethod extends TestBaseBeforeClassAfterClass {

    @Test
    public void test1() {
        //amazon anasayfasina gidiniz
        driver.get("https://www.amazon.com");
    }

    @Test(dependsOnMethods = "test1")
    public void test2() {
        // nutella aratalim
        WebElement sonuc = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

    }

    @Test(dependsOnMethods = "test2")
    public void test3() {
        // sonuc yazisinin amazon icerdiginiz test edin
        //assert ! driver.findElement
        //        (By.cssSelector("div[class=\"a-section a-spacing-small a-spacing-top-small\"]")).getText().contains("amazon");
        // Assert.assertFalse(sonuc.getText().contains("amazon"));
    }
}
