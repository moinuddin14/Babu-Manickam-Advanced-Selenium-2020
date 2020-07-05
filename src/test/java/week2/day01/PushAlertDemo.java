package week2.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by moin
 * on July, 2020
 **/
public class PushAlertDemo {
    public static void main(String[] args) {
//        https://developer.mozilla.org/en-US/docs/Mozilla/Command_Line_Options
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
    }
}
