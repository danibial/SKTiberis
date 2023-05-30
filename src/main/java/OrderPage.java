import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    By orderToPickUp = By.xpath("//a[text()='Заявка на забор']");
    By orderNumeber = By.xpath("//input[@placeholder='Номер заказа']");

    public PickUpPage clickToPickUp(){
        driver.findElement(orderToPickUp).click();
        return new PickUpPage(driver);
    }

    public OrderPage addOrderNumber(String number){
        driver.findElement(orderNumeber).sendKeys(number);
        return this;
    }
}
