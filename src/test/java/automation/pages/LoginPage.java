package automation.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage{
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver= driver;
    }
    public void enterUsername(String username){
        By usernameLocator= By.id("user-name");
        WebElement usernameElement=driver.findElement(usernameLocator);
        usernameElement.sendKeys(username);
    }
    public void enterPassword(String password){
        By passwordLocator = By.xpath("//input[@id='password']");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys(password);
    }
    public void clickLoginButton() {
        By loginButton = By.cssSelector("input[type='submit']");
        WebElement LoginElement = driver.findElement(loginButton);
        LoginElement.click();
    }
}
