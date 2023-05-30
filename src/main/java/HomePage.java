import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

        public HomePage(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver,15);
        }

        By placeAnOrder = By.xpath("//a[text()='Оформить заказ']");

        public OrderPage clickOnOrder(){
          //  wait.until(ExpectedConditions.elementToBeClickable(placeAnOrder));
            driver.findElement(placeAnOrder).click();
            return new OrderPage(driver);
        }
    }
