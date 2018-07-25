package functionLibraries;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HomePage extends CommonFunctions {


    public void navigateToHomePage() throws Exception {

        openBrowser();
        String expectedURL = getPropertyValue("url");
        driver.get(expectedURL);
        implicitWait(10);
    }

    public void userLogin() throws Exception {
        driver.findElement((By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[1]"))).click();
        implicitWait(10);
        String username = getPropertyValue("username");
        driver.findElement((By.id("ap_email"))).sendKeys(username);
        driver.findElement((By.id("continue"))).click();
        String password = getPropertyValue("password");
        driver.findElement((By.id("ap_password"))).sendKeys(password);
        driver.findElement((By.id("signInSubmit"))).click();
        implicitWait(10);
    }

    public void searchProduct() {
        driver.findElement((By.id("twotabsearchtextbox"))).click();
        implicitWait(10);
        driver.findElement((By.id("twotabsearchtextbox"))).sendKeys("Sports Shoes");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement((By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"))).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement((By.xpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[2]/div[1]/a/h2"))).click();
        implicitWait(10);
        new Select(driver.findElement((By.name("dropdown_selected_size_name")))).selectByVisibleText("7 UK");
    }

    public void addToBasket() {
        driver.findElement((By.id("add-to-cart-button"))).click();
        implicitWait(10);
    }

    public void removeProduct() {
        driver.findElement((By.xpath("//*[@id=\"hlb-view-cart-announce\"]"))).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement((By.xpath("//*[@id=\"activeCartViewForm\"]/div[2]/div/div[4]/div/div[1]/div/div/div[2]/div/span[1]/span/input"))).click();
    }

    public void addOtherProduct() {
        driver.findElement((By.id("twotabsearchtextbox"))).click();
        implicitWait(10);
        driver.findElement((By.id("twotabsearchtextbox"))).sendKeys("Sports Shoes");
        implicitWait(10);
        driver.findElement((By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"))).click();
        implicitWait(10);
        driver.findElement((By.xpath("//*[@id=\"result_1\"]/div/div/div/div[2]/div[2]/div[1]/a/h2"))).click();
        implicitWait(10);
        new Select(driver.findElement((By.name("dropdown_selected_size_name")))).selectByVisibleText("7.5 UK");
        driver.findElement((By.id("add-to-cart-button"))).click();
        implicitWait(10);
    }

    public void proceedToCheckout() {
        driver.findElement((By.id("hlb-ptc-btn-native"))).click();
    }

    public void checkoutPageVerification() {
        String expectedMessage = "Select a delivery address";
        String actualMessage = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/h1")).getText();

        Assert.assertEquals(actualMessage, expectedMessage);
        closeBrowser();
    }


}
