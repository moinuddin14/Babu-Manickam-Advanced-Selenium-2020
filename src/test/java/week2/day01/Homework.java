package week2.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Map;

/**
 * Created by moin
 * on July, 2020
 **/
public class Homework {
    public static void main(String[] args) {
        // 1. Launch IE
        // 2. Load url www.google.com
        // 3. Print browser version
        // 4. Print the platform name

        SafariDriver driver = new SafariDriver();
        driver.get("http://google.com");
        Map<String, Object> caps = driver.getCapabilities().asMap();

        for(String cap : caps.keySet()) {
            if(cap.equalsIgnoreCase("platform") ||
                cap.equalsIgnoreCase("browserVersion"))
            System.out.println(cap + " --- "+caps.get(cap));
        }

        driver.quit();
    }
}
