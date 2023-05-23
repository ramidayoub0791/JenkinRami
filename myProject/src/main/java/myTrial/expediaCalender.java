package myTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class expediaCalender {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
//        max the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.expedia.com/Flights");
        driver.findElement(By.xpath("//div[@role='main']")).click();
        driver.findElement(By.xpath("(//button[@data-stid='open-date-picker'])[1]")).click();
        WebElement next = driver.findElement(By.xpath("//button[@data-stid='date-picker-paging'][2]"));
        WebElement date = driver.findElement(By.xpath("(//button[@data-stid='open-date-picker'])[1]"));
        List<WebElement> days = driver.findElements(By.xpath("(//table[@class='uitk-date-picker-weeks'])[1]/tbody/tr/td"));
        boolean flag;
        while (flag=true) {
              String[] month= date.getText().split(" ");
              for (int i=0;i<month.length;i++){
                  if (month[i].equalsIgnoreCase("August")){
                      for (WebElement day : days) {
                          if (day.getText().equalsIgnoreCase("10")){
                              day.click();
                              break;

                          }flag=false;
                  }
              }else {
                      next.click();
                  }
            }
        }
    }
}
