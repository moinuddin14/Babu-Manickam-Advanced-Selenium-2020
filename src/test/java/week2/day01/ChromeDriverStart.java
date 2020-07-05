package week2.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverLogLevel;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by moin
 * on July, 2020
 **/
public class ChromeDriverStart {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.logfile", "./logfile.txt");

        ChromeOptions options = new ChromeOptions();
        options.setLogLevel(ChromeDriverLogLevel.ALL);

        ChromeDriverService service = new ChromeDriverService.Builder().usingPort(9515).build();
        ChromeDriver driver = new ChromeDriver(service, options);

        driver.close();

        /**
         * 1. Service - ChromeDriverService.exe
         * 2. Options
         *
         * Driver Service is the exe file, which tells about the life and death of Chrome Driver.
         * Interactions between chromedriver.exe and Selenium
         */
    }
}
