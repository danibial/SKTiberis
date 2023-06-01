import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RequestForVehicle {



    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private OrderPage orderPage;
    private PickUpPage pickUpPage;

    String loginNameSk = "sktiberisnew";
    String passwordSk = "TXji23EzcTfyWuD4MHyn";
    String loginNameIp = "tiberiszarnew";
    String passwordIp = "Uw9EcZnhP5XTuWNuJrYm";
    String loginNameTb = "tiberisnew";
    String passwordTb = "YdM8rAjvJrVDtQqRPagv";
    String date = "02.06.2023";
    String time1 = "16:15";
    String time2 = "17:50";
    String town = "Москва";
    String address = "Бумажный проезд 14 строение 3";
    String name = "Олег Белкин";
    String phone = "89265455459";
    String comment = "Необходим большой транспорт.\nЗаранее связаться для оформления пропуска.";

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver", "c:\\Users\\- H P -\\IdeaProjects\\Test\\drivers2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://home.courierexe.ru/41/auth/login");
    }

    @Test
    public void requestSk(){
        loginPage = new LoginPage(driver);
        homePage = loginPage.enterInLk(loginNameSk,passwordSk);
        orderPage = homePage.clickOnOrder();
        pickUpPage = orderPage.clickToPickUp();
        pickUpPage.addDate(date);
        pickUpPage.addTime(time1,time2);
        pickUpPage.addOrderTown(town);
        pickUpPage.addOrderAdress(address);
        pickUpPage.addOrderName(name);
        pickUpPage.addOrderPhone(phone);
        pickUpPage.addOrderComment(comment);
        pickUpPage.sendOrder();
        pickUpPage.confirmClik();
    }


    @Test
    public void requestIp(){
        loginPage = new LoginPage(driver);
        homePage = loginPage.enterInLk(loginNameIp,passwordIp);
        orderPage = homePage.clickOnOrder();
        pickUpPage = orderPage.clickToPickUp();
        pickUpPage.addDate(date);
        pickUpPage.addTime(time1,time2);
        pickUpPage.addOrderTown(town);
        pickUpPage.addOrderAdress(address);
        pickUpPage.addOrderName(name);
        pickUpPage.addOrderPhone(phone);
        pickUpPage.addOrderComment(comment);
        pickUpPage.sendOrder();
        pickUpPage.confirmClik();
    }

    @Test
    public void requestTb(){
        loginPage = new LoginPage(driver);
        homePage = loginPage.enterInLk(loginNameTb,passwordTb);
        orderPage = homePage.clickOnOrder();
        pickUpPage = orderPage.clickToPickUp();
        pickUpPage.addDate(date);
        pickUpPage.addTime(time1,time2);
        pickUpPage.addOrderTown(town);
        pickUpPage.addOrderAdress(address);
        pickUpPage.addOrderName(name);
        pickUpPage.addOrderPhone(phone);
        pickUpPage.addOrderComment(comment);
        pickUpPage.sendOrder();
        pickUpPage.confirmClik();
    }


    @After
   public void close(){
        driver.quit();
    }
}
