import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DeliverySK {

    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private OrderPage orderPage;

    String loginNameSk = "loginNameSk";
    String passwordSk = "passwordSk";
    String orderNumber = "Перемещение 0091";
    String date = "02.06.2023";
    String time1 = "10:00";
    String time2 = "14:00";
    String town = "Санкт-Петербург";
    String address = "СПб, Люботинский проспект, 5";
    String companyName = "Е-логистик";
    String phone = "88122008669";
    String quantity = "2";

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver", "c:\\Users\\- H P -\\IdeaProjects\\Test\\drivers2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://home.courierexe.ru/41/auth/login");
    }

    @Test
    public void delivery() {
        loginPage = new LoginPage(driver);
        homePage = loginPage.enterInLk(loginNameSk, passwordSk);
        orderPage = homePage.clickOnOrder();
        orderPage.addOrderNumber(orderNumber);
        orderPage.addDeliveryDate(date);
        orderPage.addTimeRange();
        orderPage.addDeliveryTime(time1,time2);
        orderPage.addDeliveryTown(town);
        orderPage.addDeliveryAddress(address);
        orderPage.addCompany(companyName);
        orderPage.addPhone(phone);
        orderPage.addOrderQuantity(quantity);
        orderPage.choosePaytype();
    }

}
