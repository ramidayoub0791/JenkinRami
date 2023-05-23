package myTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class search {

    public static void main(String[] args) throws InterruptedException {
      //  System.setProperty("webdriver.chrome.driver","C:\Users\ghs6kor\Desktop\Java\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        // identify element
        WebElement p=driver.findElement(By.name("q"));
        Thread.sleep(5000);
        //enter text with sendKeys() then apply submit()
        p.sendKeys("Selenium Java");
        Thread.sleep(5000);
        // Explicit wait condition for search results
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        Thread.sleep(5000);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
        Thread.sleep(5000);
        p.submit();
        Thread.sleep(5000);
        driver.close();
    }
}
