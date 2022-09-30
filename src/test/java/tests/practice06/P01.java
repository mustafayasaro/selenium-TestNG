package tests.practice06;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DhtmlgoodiesPage;
import utilities.Driver;
import utilities.TestBaseBeforeClassAfterClass;

public class P01 extends TestBaseBeforeClassAfterClass {

    @Test
    public void test01() {
        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        // Fill in capitals by country.

        DhtmlgoodiesPage dhtmlgoodiesPage = new DhtmlgoodiesPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.norway).
                dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.stockholm).
                dragAndDrop(dhtmlgoodiesPage.copenhagen, dhtmlgoodiesPage.norway).
                dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain).
                dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy).
                dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.southKorea).
                dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.unitedStates).perform();

        Driver.closeDriver();


        /*
        Public olarak tanımlanan öğeye kod bloğunun içinden ve dışından erişebilir,
        yani her yerden ulaşılabilir denilebilir.
        Statik tanımlaması yapıldığında ise bu sınıfa herhangi bir nesne oluşturmadan,
        sadece adıyla çağırıp erişim sağlanabilir.
         */


        /** Frameworkler büyüdükçe yeni classlar yeni test methodları yeni webelementler olusturdukça içinden çıkılmaz
         * anlasılmaz, tekrar bakımı yapılamaz, güncellemesi çok zor hatta imkansız bir hal alır
         *
         * uzmanlar reusable maintainable, rahat manipule edilebilir bir framwork için bir design pattern olarak
         * POM PAGE OBJECT MODEL de karar vermisler
         * olmazsa olmazlar
         * 1) driver class
         * 2) PAGE class
         * 3) test class
         * utilities
         *
         * Aradığımız bir web elementi yada bir metohdu kolaylıkla bulabilmek ve güncelleyebilmek için
         * javadan öğrenmis olduğumuz oop concept selenium ile page object model de birlesitirilmis oluyuor
         *
         */

    }
}
