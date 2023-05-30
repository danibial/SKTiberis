import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class LoginPage {
    private WebDriver driver;

        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }

        By loginArea = By.xpath("//input[@id='loginform-login']");
        By passwordArea = By.xpath("//input[@id='loginform-password']");
        By submitButton = By.xpath("//button[text()='Войти']");

        public HomePage clickSubmit(){
            driver.findElement(submitButton).click();
            return new HomePage(driver);
        }

        public LoginPage addLogin(String login){
            driver.findElement(loginArea).sendKeys(login);
            return this;
        }

        public LoginPage addPassword(String password){
            driver.findElement(passwordArea).sendKeys(password);
            return this;
        }

        public HomePage enterInLk(String login, String password){
            addLogin(login);
            addPassword(password);
            clickSubmit();
            return new HomePage(driver);
        }
    }

