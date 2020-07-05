package week2.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by moin
 * on July, 2020
 **/
public class CapabilitiesDemo {
    public static void main(String[] args) {

        // Two types of Desired Capabiities
        // 1. Desired Capabilities
        // 2. Actual Capabilities

        // Platform capabilities will be deprecated and be replaced with platform_name

        // Check StrictFileInteractibility desired capability to see if we can upload
        // file through input like //input[@type='file']
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        ChromeDriver driver = new ChromeDriver(options);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("acceptSslCerts",true);

        driver.get("https://the-internet.herokuapp.com/download");

//        driver.getCapabilities().asMap(cap -> {
//            System.out.println(cap);
//        });
    }
}
