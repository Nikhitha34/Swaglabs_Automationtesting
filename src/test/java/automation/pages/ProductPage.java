package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class ProductPage{
    WebDriver driver;
    String actualTitle = "Swag Labs";
    String expectedTitle;
    public ProductPage(WebDriver driver) {
        this.driver= driver;
    }
    public void Product(WebDriver driver) {
        this.driver = driver;
        System.out.println("logged in successfully");
    }

    public void verifyProductPage() {
        expectedTitle = driver.getTitle();
        assert actualTitle.equals(expectedTitle) : "ProductPage is not verified";
        System.out.println("ProductPage is verified");
    }

    public void verifycountoftotalproducts() {

        By Locator = By.cssSelector(".btn_primary.btn_inventory");
        List<WebElement> elements = driver.findElements(Locator);
        System.out.println("Total Items in the Cart Page");
        System.out.println(elements.size());

    }

    public void verifyselectedProducts(String itemName) {
        String addToCart = "//*[text()='" + itemName + "']//ancestor::div[@class='inventory_item_label']//following-sibling::div[@class='pricebar']/button";
        By priceAddToCartLocator = By.xpath(addToCart);
        WebElement element = driver.findElement(priceAddToCartLocator);
        element.click();
        System.out.println("The item added to cart name is");
        System.out.println(itemName);
    }

    public void verifyProductprice(String itemName) {
        String priceLoc = "//*[text()='" + itemName + "']//ancestor::div[@class='inventory_item_label']//following-sibling::div[@class='pricebar']/div";
        By priceLocator = By.xpath(priceLoc);
        WebElement elementItem = driver.findElement(priceLocator);
        String value = elementItem.getText();
        System.out.println("The price of item added to the cart is");
        System.out.println(value);

    }
}
