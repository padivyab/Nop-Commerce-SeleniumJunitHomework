package testsuite;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String BaseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp()
    {
        openBrowser(BaseUrl);

    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully()
    {
        //click on the ‘Login’ link
        WebElement ClickLogin = driver.findElement(By.xpath("//a[@class='ico-login']"));
        ClickLogin.click();

        //Verify the text ‘Welcome, Please Sign IN!'
        WebElement VerifyTest = driver.findElement(By.xpath("//div[@class='page-title']"));
        VerifyTest.getText(); // check krva mate
        System.out.println("Test Done");

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {
        //click on the ‘Login’ link
        WebElement ClickLogin = driver.findElement(By.xpath("//a[@class='ico-login']"));
        ClickLogin.click();

        //Enter valid username
        WebElement username = driver.findElement(By.xpath("//input[@class='email']"));
        username.sendKeys("divya123456@gmail.com");

        //Enter valid password
        WebElement password = driver.findElement(By.xpath("//input[@class='password']"));
        password.sendKeys("padivyab96");

        //Click on ‘LOGIN’ button
        WebElement ClickButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        ClickButton.click();

        //Verify the ‘Log out’ text is display
        //WebElement LogOut = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        //LogOut.getText();
        WebElement logOut =driver.findElement(By.xpath("//a[@class='ico-logout']"));
        logOut.getText();



    }

    @Test
    public void verifyTheErrorMessage()
    {
        //click on the ‘Login’ link
        WebElement ClickLogin = driver.findElement(By.xpath("//a[@class='ico-login']"));
        ClickLogin.click();

        //* Enter invalid username
        WebElement InvalidUsername = driver.findElement(By.xpath("//input[@class='email']"));
        InvalidUsername.sendKeys("div12@gmail.com");

        //* Enter invalid password
        WebElement InvalidPassword = driver.findElement(By.xpath("//input[@class='password']"));
        InvalidPassword.sendKeys("divya12");

        //* Click on Login button
        WebElement ClickButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        ClickButton.click();

        //* Verify the error message'
        WebElement verifyText = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualText = verifyText.getText();
        String expectedText="Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";


    }

    @After
    public void closeBrowser()
    {

        //closeBrowser();

    }

}
