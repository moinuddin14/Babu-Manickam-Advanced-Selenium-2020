package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by moin
 * on June, 2020
 **/
public class SelectDeepDive {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Dropdown.html");
//        WebElement dd1 = driver.findElementById("dropdown1");
        WebElement dd1 = driver.findElementById("dropdown1");
        Select dropdown = new Select(dd1);


        // How does Select Works?
        // 1) Pre-req - Tag name should be Select and the child element tag options
        // 2) If there are not so, then it throws exception
        // 3) Check the tag name -> Select -> find all options -> List<WebElement>
        // 4) Methods: SelectByVisibleText, Index, value
        // 5) Deselect, isMultiple
    }
}
