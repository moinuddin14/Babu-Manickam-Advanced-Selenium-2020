package week2.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by moin
 * on July, 2020
 **/
public class ZoomDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        // Go to F12, console write Javascript code like
        // document.body.bgColor
        // document.body.style.zoom = 70%

        new ChromeDriver().executeScript("document.body.style.zoom = 70%");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
