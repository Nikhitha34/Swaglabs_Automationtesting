package automation;
import automation.pages.CartPage;
import automation.pages.LoginPage;
import automation.pages.ProductPage;
import org.testng.annotations.Test;

public class TestSauceLabs extends BaseSetup {
    String username = "standard_user";
    String password = "secret_sauce";
    String itemName = "Sauce Labs Backpack";
    @Test
    public void test() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        ProductPage product = new ProductPage(driver);
        product.verifyProductPage();
        product.viewTotalproducts();
        product.viewProductselected(itemName);
        product.viewProductprice(itemName);
        CartPage cartPage = new CartPage(driver);
        cartPage.openCartPage();
        cartPage.verifySelectItemInCartPage(itemName);

    }
}
