# Week 1 

### Day 01

### Day 02

# Week 2

### Day 03



Postman Interceptor - to capture the traffic \
We can now use Chrome Devtools 

Chrome Extension Extractor https://crxextractor.com/  

Todo: Learn how to convert older version of crx to new crx version

### Day 04

##### 6. What are the different methods to check if an element is present or visible?  

    Present: 
     driver.findElement() -> NoSuchElement -> returns the WebElement \
     driver.findElements().size -> 0 -> element is present or if not there
    Visible: 
     isDisplayed()  -> Check the visibility attribite of the elemtn / (Future) API working in all browsers. The way isDisplayed works is it will check visibility property of the element. 
    display might not work for all browsers. 

##### 7.  How will you check if the image is broken or not?

    $ Resource http://www.leafground.com/pages/Image.html
    $ Get url of image, if you are ending with 404 then its a broken image
    
     public class Brokenlmage { 
         public static void main(String[] args) { 
             WebDrivermanager.cnromedriver().setup(); ChromeDriver driver = new ChromeDriver(); driver.get(" 
             _ _.._____ _ 
             http://www.leafground.com/pages/Image.html 
             " ) ; 
             String src = driver.findElement(By.xpath("(//img)[2]")).getAttribute("src"); driver.get(src); if(driver.getTitle().contains("404")) { System.err.println("Broken"); }else { System.out.println("All good");
         } 
     }  


##### 8. Implicit vs ExplicitWait -> Which one you will choose when?

    Which one you will choose when? 
    implicit wait -> affects findElement, findElements -> many times: one, preferably -> at the begining scenario: element disapperance -> reset the value -> explicit wait -> Selenium WebDriverWait (use for anything other than implicitWait) -> alert, frame, window, element behavior 
    
    implicit wait: affects findElement, findElements -> WebDriver
    WebDriverWait is sub class, FluentWait is super class. \
         FluentWait was built first and wasn't ThreadSafe.  \
         WebDriverWait internally calls FluentWait \
         long argument with WebDriverWait is deprecated and use Duration.seconds \
         Max time to wait given as an argument -> 10 seconds
         Interval for checking the condition is 500 ms
    NotFoundException: It's the super exception. 
    Wait.until () is the method of FluentWait. \
             
    ToDo: Learn about Synchronous vs Asynchronous
    Example: Both goes to bank at same time -> Withdraw money (at same moment) 
             Both of them -> Who is loser -> Bank Both does not get money -> Bug in the app !! Best: One of them get -> 
             synchronized{ 
             I 
             // only one thread at a time !! 
             Both are checking my balanced 
             500 ms -> isDisplayed() -> request -> did not respond at all !! 500 ms -> isDisplayed() -> request -> response() 


##### 9. Give real-time examples of using OOPS in Selenium WebDriver
         
         	a) Inheritance ->  Exceptions, Options, WebDriverWait 
         	b) Encapsulation -> RemoteWebDriver (get, set -> private)
         	c) Polymorphism -> Actions (Overloading), Chrome vs Chromium (Overriding) 
         	d) Abstraction -> Interface (WebDriver, Alert, TakeScreenShot), Abstract (By)

##### 10. What are the common IE automation issues that you face where it works fine in Chrome or Firefox?

    1. SendKeys working slowly in 64 bit
    2. When Zoom is not 100%, then click or sendKeys will not work
    3. All Security Zones should be either protected or not protected. 

##### 11. How do you handle authentication pop-up (username and password) using Selenium?

##### 12. Assume, browser is not responding (Frozen) or it is keep loading, how will you manage such case?

##### 13. Difference between driver.get("") vs driver.navigate().to("")

##### 14. How Actions class work internally like moveToElement or doubleClick?

##### 15. How to change zoom of your browser using Selenium?

### Selenium 4 Grid 

    Check the Selenium4Grid.md file

### Resources

List of Chromium Command Line Switches \
https://peter.sh/experiments/chromium-command-line-switches/

W3C WebDriver \
https://www.w3.org/TR/webdriver/

Demo link for push notifications \
https://pushalert.co/demo 

Microsoft security chief: IE is not a browser, so stop using it as your default \
https://www.zdnet.com/article/microsoft-security-chief-ie-is-not-a-browser-so-stop-using-it-as-your-default/#:~:text=Is%20Internet%20Explorer%20(IE)%20a,be%20updated%20for%20modern%20browsers.

FREE ONLINE OCR SERVICE \
https://www.onlineocr.net/










