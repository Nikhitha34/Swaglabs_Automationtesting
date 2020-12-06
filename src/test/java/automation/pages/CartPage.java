package automation.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCartPage() {
        By cartPage = By.cssSelector("svg[data-icon='shopping-cart']");
        WebElement cartElement = driver.findElement(cartPage);
        cartElement.click();
        System.out.println("cart page open successfully");
    }

    public void verifySelectItemInCartPage(String itemName) {
        String selectedItemName = "//div[@class='inventory_item_name']";
        By cartAddedItem = By.xpath(selectedItemName);
        WebElement addedItem = driver.findElement(cartAddedItem);
        String actualSelectedItemName = addedItem.getText();
        System.out.println("Actual Selected Item Name is  " + actualSelectedItemName);
        assert (itemName.equals(actualSelectedItemName)) : "Given item and selected item in the cart page are not same";
        System.out.println("Given item and selected in cart are same");
        System.out.println("Cart Page verified");
    }
}