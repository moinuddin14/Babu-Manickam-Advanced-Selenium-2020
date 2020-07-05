package week2.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Created by moin
 * on July, 2020
 **/
public class FirefoxOptionsDemo {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--private-window");
//        options.addArguments("-url=https://google.com");
//        options.addArguments("--disable-notifications");
        FirefoxDriver driver = new FirefoxDriver(options);
        driver.get("https://pushalert.co/demo");
        driver.findElement(By.id("send-button")).click();
    }
}
