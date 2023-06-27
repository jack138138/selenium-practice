package testsuit;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){

        //find the login link and click on login link
       WebElement loginLink =  driver.findElement(By.linkText("Log in"));
       loginLink.click();
       String expectedText = "Welcome, Please Sign In!";
      String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Not redirected to login page", expectedText,actualText);

    }

    @Test
    public void verifyErrorMessageWtihInvalidCredentials(){

        //Find the login link and click on login link
        WebElement loginLink =  driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //find the Email Field Enter Email Address
        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");

        //Find the password field and enter the password
        driver.findElement(By.name("Password")).sendKeys("Prime123");

        //click on Login Button
        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();

        Assert.assertEquals("Error message not displayed", expectedMessage, actualMessage);


    }

    @After
    public void tearDown(){
        closeBrowser();

    }
}
