package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String BaseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp()
    {
        openBrowser(BaseUrl);

    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully()
    {
        //click on the ‘Register’ link
        WebElement ClickRegister = driver.findElement(By.linkText("Register"));
        ClickRegister.click();

        //* Verify the text ‘Register’
        WebElement VerifyText7 = driver.findElement(By.linkText("Register"));
        String actualText = VerifyText7.getText();
        String expectedText = "Register";
        Assert.assertEquals(expectedText,actualText);


    }

    @Test
    public void userShouldRegisterAccountSuccessfully()
    {
        //click on the ‘Register’ link
        WebElement ClickRegister = driver.findElement(By.xpath("//a[@class='ico-register']"));
        ClickRegister.click();

        //* Select gender radio button
        WebElement SelectMale = driver.findElement(By.xpath("//input[@id='gender-male']"));
        SelectMale.click();

        WebElement SelectFemale = driver.findElement(By.xpath("//input[@id='gender-female']"));
        SelectFemale.click();


        //* Enter First name
        WebElement EnterFirstname =driver.findElement(By.xpath("//input[@id='FirstName']"));
        EnterFirstname.sendKeys("test1");

        //* Enter Last name
        WebElement EnterLastname = driver.findElement(By.xpath("//input[@id='LastName']"));
        EnterLastname.sendKeys("patel");

        //* Select Day Month and Year
        WebElement Day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Day.sendKeys("25");

        WebElement Month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        Month.sendKeys("May");

        WebElement Year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        Year.sendKeys("1998");

        //* Enter Email address
        WebElement EnterEmail = driver.findElement(By.xpath("//input[@id='Email']"));
        EnterEmail.sendKeys("test1234@gmail.com");

        //* Enter Password
        WebElement EnterPassword = driver.findElement(By.xpath("//input[@id='Password']"));
        EnterPassword.sendKeys("Test123456");

        //* Enter Confirm password
        WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        ConfirmPassword.sendKeys("Test123456");

        //* Click on REGISTER button
        WebElement RegisterButton = driver.findElement(By.xpath("//button[@id='register-button']"));
        RegisterButton.click();

        //* Verify the text 'Your registration completed’
        WebElement VerifyText = driver.findElement(By.xpath("//div[@class='result']"));
        String actualText = VerifyText.getText();
        String expectedText = "Your registration completed";
        Assert.assertEquals(expectedText,actualText);

    }


    @After
    public void closeBrowser()
    {


    }

}
