package tests.package05;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class P02 extends TestBaseBeforeClassAfterClass {

    @Test
    public void test01() {
        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        WebElement jsAlert = driver.findElement(By.xpath("(//*[text()='CLICK ME!'])[1]"));
        jsAlert.click();

        // 3. Açılır metni alın
        System.out.println(driver.switchTo().alert().getText());

        // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        Assert.assertTrue(driver.switchTo().alert().getText().equals("I am an alert box!"));

        // 5. Açılır pencereyi kabul edin
        driver.switchTo().alert().accept();

    }
}
