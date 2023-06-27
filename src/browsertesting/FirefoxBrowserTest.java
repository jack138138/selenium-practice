package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.close();


    }
}
