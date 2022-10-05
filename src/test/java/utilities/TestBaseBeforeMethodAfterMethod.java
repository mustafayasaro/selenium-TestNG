package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestBaseBeforeMethodAfterMethod {
    protected WebDriver driver;
    protected String tarih;

    //tetsng framework'unde JUnit'den farkli olarak
    // @Before ve @After notasyonlari yerine
    // @BeforeMethod ve @AfterMethod ullanilir
    //Calisma prensibi ise JUnit'dekinotasyonlarla aynidir
    @BeforeMethod (groups = "gp1")
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        tarih = date.format(formatter);
    }


    @AfterMethod (groups = "gp1")
    public void tearDown(){
        //driver.quit();
    }
}
