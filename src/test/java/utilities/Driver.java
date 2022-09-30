package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    private Driver() {

    }

    static WebDriver driver;

    /*
    Testleimizi calistirmdigimizda her seferinde yeni driver
    olusturdugu icin her test methodu icin yeni bir pencere(driver)
    aciyor. Eger driver'a bir deger atanmamissa yani (driver==null) ise
    bir kere driver'i calistirir diyerek bir kere if icini calistiracak.
    Ve driver bir kere calistigi icin ve deger  atandigi icin "null" olmayacak
    yani return edecek ve diger testlerimiz ayni pencere(driver) uzerinde calisacak
     */


    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) { // driver'a deger atanmissa kapat
            driver.close();

            driver = null; // bu atamayi yapmazsak exception aliriz
            // Kapandiktan sonra sonraki acmalari garanti altina almak icin driver'i tekrar null yaptik
            //driver=null; kapandıktan sonra, yeni driver açıldığında getDriver methodunun doğru çalışması için
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }

}
