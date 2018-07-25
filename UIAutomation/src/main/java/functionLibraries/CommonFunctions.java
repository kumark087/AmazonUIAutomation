package functionLibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {


    WebDriver driver;


    public void openBrowser() throws Exception {

        String browserType = getPropertyValue("browser").toLowerCase();

        if (browserType.equalsIgnoreCase("chrome"))

        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        driver.quit();
    }

    public void implicitWait(int time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public String getPropertyValue(String key) throws Exception {
        File file = new File(System.getProperty("user.dir") + "\\src\\main\\resources\\testData\\config.properties");
        FileInputStream inputStream = new FileInputStream(file);

        Properties properties = new Properties();

        properties.load(inputStream);

        String value = properties.getProperty(key);

        return value;
    }

}
