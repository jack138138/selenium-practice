package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LocatorDemo1 extends BaseTest {
    String baseUrl = "https://www.letskodeit.com/login";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo1(){
        //ID and name locators
        driver.findElement(By.id("email")).sendKeys("Prime123@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Prime123");

        //Link Text Locator
        driver.findElement(By.linkText("Forgot Password?")).click();

        // Partial link text locator
        driver.findElement(By.partialLinkText("Sign")).click();

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
