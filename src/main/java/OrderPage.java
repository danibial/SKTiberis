import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,15);
        this.js = (JavascriptExecutor) driver;
    }

    By orderToPickUp = By.xpath("//a[text()='Заявка на забор']");
    By orderNumeber = By.xpath("//input[@placeholder='Номер заказа']");
    By deliveryDate = By.xpath("//input [@placeholder='Дата доставки']");
    By timeRange = By.xpath("//select[@id='time_range']");
    By setTimeRange = By.xpath("//select[@id='time_range']/option[@value='10:00 - 14:00']");
    By deliveryTimeMin = By.xpath("//input[@placeholder='Время доставки с']");
    By deliveryTimeMax = By.xpath("//input[@placeholder='Время доставки по']");
    By deliveryTown = By.xpath("//input[@placeholder='Город получателя']");
    By deliveryAddress = By.xpath("//input[@placeholder='Адрес получателя']");
    By company = By.xpath("//input[@placeholder='Компания получателя']");
    By phoneNumber = By.xpath("//input[@placeholder='Телефон получателя']");
    By orderQuantity = By.xpath("//input[@id='order[quantity]']");
    By paytype = By.xpath("//select[@id='paytype']");
    By paytypeNo = By.xpath("//select[@id='paytype']/option[@value='NO']");
    By send = By.xpath("//button[@type='submit']");
    By closeButton = By.xpath("//div[@id='ct_offer_modal']//button[@class='close']");

    public PickUpPage clickToPickUp(){
        driver.findElement(orderToPickUp).click();
        return new PickUpPage(driver);
    }

    public OrderPage addOrderNumber(String number){
        driver.findElement(orderNumeber).sendKeys(number);
        return this;
    }

    public OrderPage addDeliveryDate(String date){
        driver.findElement(deliveryDate).sendKeys(Keys.CONTROL+"a");
        driver.findElement(deliveryDate).sendKeys(date);
        return this;
    }

    public OrderPage addTimeRange(){
        WebElement element = driver.findElement(timeRange);
        js.executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(timeRange).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(setTimeRange));
        driver.findElement(setTimeRange).click();
        return this;
    }

    public OrderPage addDeliveryTime(String time1, String time2){
        driver.findElement(deliveryTimeMin).sendKeys(Keys.CONTROL+"a");
        driver.findElement(deliveryTimeMin).sendKeys(time1);
        driver.findElement(deliveryTimeMax).sendKeys(Keys.CONTROL+"a");
        driver.findElement(deliveryTimeMax).sendKeys(time2);
        return this;
    }

    public OrderPage addDeliveryTown(String town){
        driver.findElement(deliveryTown).sendKeys(Keys.CONTROL+"a");
        driver.findElement(deliveryTown).sendKeys(town);
        return this;
    }

    public OrderPage addDeliveryAddress (String address){
        driver.findElement(deliveryAddress).sendKeys(address);
        return this;
    }

    public OrderPage addCompany(String companyName){
        driver.findElement(company).sendKeys(companyName);
        return this;
    }

    public OrderPage addPhone (String number){
        driver.findElement(phoneNumber).sendKeys(number);
        return this;
    }

    public OrderPage addOrderQuantity(String quantity){
        driver.findElement(orderQuantity).sendKeys(Keys.CONTROL+"a");
        driver.findElement(orderQuantity).sendKeys(quantity);
        return this;
    }

    public OrderPage choosePaytype(){
        WebElement element = driver.findElement(paytype);
        js.executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(paytype).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(paytypeNo));
        driver.findElement(paytypeNo).click();
        return this;
    }

    public OrderPage sendOrder(){
        driver.findElement(send).click();
        driver.findElement(closeButton).click();
        return this;
    }
}
