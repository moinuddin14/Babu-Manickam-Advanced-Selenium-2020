package week2.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by moin
 * on July, 2020
 **/
public class DownloadDemo {
    public static void main(String[] args) {
        // POstman interceptor

        WebDriverManager.chromedriver().setup();
        Map<String, String> preferences = new HashMap<String, String>();
        preferences.put("download.default_directory", "/Users/moin/Desktop/demo_downloads");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", preferences);
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");

        driver.quit();

    }
}

