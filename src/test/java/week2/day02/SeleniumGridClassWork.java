package week2.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

/**
 * Created by moin
 * on July, 2020
 **/
public class SeleniumGridClassWork {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
//        ChromeDriver driver = new ChromeDriver();
        driver.get("https://amazon.in");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//select[@id='searchDropdownBox']")));
        Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
        driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[contains(text(),'Office Products')]")));
        dropDown.getOptions().get(2).click();
//        dropDown.selectByVisibleText("Office Products");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // Skipping Step 2 because of issue with Safari "ElementNotInteractableException"

        driver.findElementById("twotabsearchtextbox").sendKeys("book");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("suggestions-template")));

        driver.findElementById("//div[@id='issDiv1']").click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> elems = driver.findElementsByXPath("//div[@id='nav-search']//div[3]//div[1]/child::*");

        for (WebElement el : elems) {
            System.out.println(el.getTagName());
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
