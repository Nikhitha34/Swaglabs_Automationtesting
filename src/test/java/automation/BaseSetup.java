package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
    public class BaseSetup {
        WebDriver driver;
        @BeforeMethod
        public void setup() {
            String url = "https://www.saucedemo.com/";
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver=new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
        }
    }

