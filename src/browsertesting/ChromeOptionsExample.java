package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeOptionsExample {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");   //Disable browser notification
        options.addArguments("--incognito"); //open Browser in private/incognito window
        options.addArguments("--headless"); // headless browser

        String baseUrl = "https://www.redbus.com/";
        WebDriver driver = new ChromeDriver(options);

        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        System.out.println("Page Title is : " + driver.getTitle());


    }
}
