package tests.day17_SoftAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeClassAfterClass;

public class C03_SoftAssert extends TestBaseBeforeClassAfterClass {

    @Test
    public void test01() {
        SoftAssert softAssert = new SoftAssert();

        //1-amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"), "Amazon icermiyor");

        //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled()," Erisilemiyor");

        //4-arama kutusuna Nuella yazıp aratın
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        WebElement resultWE = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        //5-arama yapıldıgını test edin
        softAssert.assertTrue(resultWE.isDisplayed(), "Goruntulenemiyor");

        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(resultWE.getText().contains("Nutella"), "Nutella icermiyor");
        softAssert.assertAll();


        /*
        sofAssert baslangic ve bitis satirlari arasindaki tum Assertionlari
        yapip bitis olarak belirtmemiz gereken assertAll() methodu ile
        test methodumuzdaki butun assertionlari kontrol eder
        FAILLED olan assertion varsa o assertionun sonuna
        yazdigimiz mesaji verir
         */

    }


}
