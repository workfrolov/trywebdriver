package TestSuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WDTests {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.random.org");
        driver.quit();
    }
}
