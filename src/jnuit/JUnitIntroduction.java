package jnuit;

import org.junit.*;

public class JUnitIntroduction {

    @BeforeClass
    public static void connectToDB(){
        System.out.println("DB Connection");
    }

    @AfterClass
    public static void closeDBConnection(){
        System.out.println("close DB Connection");
    }



    @Before
    public void openBrowser(){

        System.out.println("Opening the browser");
    }

    @After
    public void closeBrowser(){
        System.out.println("Closing the Browser");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        System.out.println("Navigate to Login Page");

    }

    @Test
    public void test (){

        System.out.println("Test Method");
    }
}
