package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the URL into Browser
        driver.get(baseUrl);
        //Maximise Browser
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // find Login Link Element
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        // Click on Login link
        loginlink.click();


        //find the email Field Element

        WebElement emailField = driver.findElement(By.id("Email"));

        //Type the email address to the Email Field Element
        emailField.sendKeys("Prime123@gmail.com");

        //find the password Field and type the password

        WebElement password = driver.findElement(By.name("Password"));

        //Find field and type the password Field Element
        password.sendKeys("Prime123@");

        //Find the welcome text
        WebElement welcomeText = driver.findElement(By.tagName("h1"));
       String text = welcomeText.getText();
        System.out.println(text);
    }
}
