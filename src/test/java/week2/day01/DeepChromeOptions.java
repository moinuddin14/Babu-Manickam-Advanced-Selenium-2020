package week2.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

/**
 * Created by moin
 * on July, 2020
 **/
public class DeepChromeOptions {
    public static void main(String[] args) throws IOException {
        // Headless is supported in - Chrome, FF, Edge
        // We can have multiple versions of firefox, but we cannot have multiple chrome versions
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
////        options.addArguments("--headless");
////        options.setHeadless(headless);
////        setBinary is most helpful for firefox since we can have multiple versions of firefox
////        options.setBinary("path of chrome exe");
//
//        options.setHeadless(true);
//        ChromeDriver driver = new ChromeDriver(options);
//        driver.get("https://google.com");
//        System.out.println(driver.getTitle());
//
//        File screenshot = driver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screenshot, new File("./screenshot.png"));

        ChromeDriverService service = new ChromeDriverService.Builder().usingPort(9515).build();
        ChromeDriver driver = new ChromeDriver(service, options);
    }
}
