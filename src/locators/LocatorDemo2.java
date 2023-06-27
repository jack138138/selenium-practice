package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorDemo2 extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo2() {
        //Class Name Locator ---> To find multiple elements
        List<WebElement> slideElements = driver.findElements(By.className("nivo-imageLink"));
        System.out.println("Total Slides Are : " + slideElements.size());
        //Tag name locator ---> to find multiple elements
        List<WebElement> links =driver.findElements(By.tagName("a"));
        System.out.println("Total Links are Available : " + links.size());



    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
