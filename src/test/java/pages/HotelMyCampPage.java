package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement logIn;

    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='btnSubmit']")
    public WebElement logIn2;

    @FindBy(xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement girisYapildi;

    @FindBy(xpath = "//*[@id='divMessageResult']")
    public WebElement girisYapilamadi;


    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy(xpath = "(//*[@class='icon-calendar'])[4]")
    public WebElement roomReservation;



    @FindBy(xpath = "//*[text()='Add Room Reservation ']")
    public WebElement addRoomReservation;

    @FindBy(xpath = "//*[@id='IDUser']")
    public WebElement idUser;


    @FindBy(xpath = "//*[@class='bootbox-body']")
    public WebElement reservasyonText;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement reservasyonTextOkButton;
}
