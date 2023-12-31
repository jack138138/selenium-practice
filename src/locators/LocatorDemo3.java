package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LocatorDemo3 extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo3() {
        //Relative xpath
       /*WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searchBox.sendKeys("Mobile"); */

        //xpath with or
        driver.findElement(By.xpath("//input[@placeholder='Search store' or @name= 'q']")).sendKeys("Mobile");

        // xpath with and
        driver.findElement(By.xpath("//input[@placeholder='Search store' and @id='small-searchterms']")).sendKeys("Mobile");

        //xpath with starts - with
        //tagName[starts-with(@attribute, 'value')]

        driver.findElement(By.xpath("//input[starts-with(@id, 'sma')]")).sendKeys("Mobile");


        //xpath with contains()
        //tagName[contains(@attribute, 'value')]
        driver.findElement(By.xpath("//input[contains(@id, 'sea')]")).sendKeys("Mobile");


        //xpath with text()
        //tagName[text() = 'Value']

        driver.findElement(By.xpath("//a[text() = 'Log in']")).click();

        //xpath with chained
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Computers ']")).click();






    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
