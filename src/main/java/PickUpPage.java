import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PickUpPage {
    WebDriver driver;

    public PickUpPage(WebDriver driver) {
        this.driver = driver;
    }


    By orderDate = By.xpath("//input[@placeholder='Дата забора']");
    By orderTime1 = By.xpath("//input[@placeholder='Время забора с']");
    By orderTime2 = By.xpath("//input[@placeholder='Время забора до']");
    By orderTown = By.xpath("//input[@placeholder='Город отправителя']");
    By orderAdress = By.xpath("//input[@placeholder='Адрес отправителя']");
    By orderName = By.xpath("//input[@placeholder='ФИО отправителя']");
    By orderPhone = By.xpath("//input[@placeholder='Телефон отправителя']");
    By orderComment = By.xpath("//textarea[@placeholder='Поручение']");
    By send = By.xpath("//button[@type='submit']");



    public PickUpPage addDate(String date){
        driver.findElement(orderDate).sendKeys(Keys.CONTROL+"a");
        driver.findElement(orderDate).sendKeys(date);
        return this;
    }

    public PickUpPage addTime(String time1, String time2){
        driver.findElement(orderTime1).sendKeys(Keys.CONTROL+"a");
        driver.findElement(orderTime1).sendKeys(time1);
        driver.findElement(orderTime2).sendKeys(Keys.CONTROL+"a");
        driver.findElement(orderTime2).sendKeys(time2);
        return this;
    }

    public PickUpPage addOrderTown(String town){
        driver.findElement(orderTown).sendKeys(Keys.CONTROL+"a");
        driver.findElement(orderTown).sendKeys(town);
        return this;
    }

    public PickUpPage addOrderAdress(String address){
        driver.findElement(orderAdress).sendKeys(Keys.CONTROL+"a");
        driver.findElement(orderAdress).sendKeys(address);
        return this;
    }

    public PickUpPage addOrderName(String name){
        driver.findElement(orderName).sendKeys(Keys.CONTROL+"a");
        driver.findElement(orderName).sendKeys(name);
        return this;
    }

    public PickUpPage addOrderPhone(String phone){
        driver.findElement(orderPhone).sendKeys(Keys.CONTROL+"a");
        driver.findElement(orderPhone).sendKeys(phone);
        return this;
    }

    public PickUpPage addOrderComment (String comment){
        driver.findElement(orderComment).sendKeys(comment);
        return this;
    }

    public PickUpPage sendOrder(){
        driver.findElement(send).click();
        return this;
    }
}
