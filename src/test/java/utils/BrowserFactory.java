package utils;

import Base.Baseutil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void identifyBrowser(String browser) {
        switch (browser) {
            case "chrome":
                getChromeDriver();
                break;
            case "firefox":
                getFirefoxDriver();
                break;
        }
    }

    public static void getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1280,950");
        driver = new ChromeDriver(options);

    }

    public static void getFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/java/utils/driver/geckodriver.exe");
        driver = new FirefoxDriver();
    }



}
