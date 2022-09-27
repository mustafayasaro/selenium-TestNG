package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestBaseBeforeClassAfterClass {

    protected  WebDriver driver;
    protected  Actions action;
    protected   String tarih;

    // @BeforeClass @AfterClasss notasyonlarini kullanirken
    // TestNG de static yapmaya gerek yoktur

    @BeforeClass
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        action = new Actions(driver);

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        tarih = date.format(formatter);
    }


    @AfterClass
    public  void tearDown(){
        //driver.quit();
    }
}
