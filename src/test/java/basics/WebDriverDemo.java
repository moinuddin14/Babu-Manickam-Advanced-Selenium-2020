package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by moin
 * on June, 2020
 **/
public class WebDriverDemo {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "/Users/moin/Documents/babu-manickam-adv-selenium/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cricinfo.com");
        driver.findElement(By.xpath(""));

        driver.manage().window().maximize();
    }
}
