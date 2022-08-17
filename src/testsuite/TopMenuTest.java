package testsuite;

import browserfactory.BaseTest;
import com.sun.xml.internal.ws.wsdl.writer.W3CAddressingWSDLGeneratorExtension;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String BaseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp()
    {
        openBrowser(BaseUrl);

    }

    @Test

    public void userShouldNavigateToComputerPageSuccessfully()
    {
        //click on the ‘Computers’ Tab
        WebElement ClickComputer = driver.findElement(By.linkText("Computers"));
        ClickComputer.click();

        //* Verify the text ‘Computers’
        WebElement VerifyText = driver.findElement(By.linkText("Computers"));
        String actualText = VerifyText.getText();
        String expectedText = "Computers";
        Assert.assertEquals(expectedText,actualText);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully()
    {
        //click on the ‘Electronics’ Tab
        WebElement ClickElectronic = driver.findElement(By.linkText("Electronics"));
        ClickElectronic.click();

        //* Verify the text ‘Electronics’
        WebElement VerifyText1 = driver.findElement(By.linkText("Electronics"));
        String actualText = VerifyText1.getText();
        String expectedText = "Electronics";
        Assert.assertEquals(expectedText,actualText);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully()
    {
        //click on the ‘Apparel’ Tab
        WebElement ClickApparel = driver.findElement(By.linkText("Apparel"));
        ClickApparel.click();

        //* Verify the text ‘Apparel’
        WebElement VerifyText2 = driver.findElement(By.linkText("Apparel"));
        String actualText = VerifyText2.getText();
        String expectedText = "Apparel";
        Assert.assertEquals(expectedText,actualText);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully()
    {
        //click on the ‘Digital downloads’ Tab
        WebElement ClickDigital = driver.findElement(By.linkText("Digital downloads"));
        ClickDigital.click();

        //* Verify the text ‘Digital downloads’
        WebElement VerifyText3 = driver.findElement(By.linkText("Digital downloads"));
        String actualText = VerifyText3.getText();
        String expectedText = "Digital downloads";
        Assert.assertEquals(expectedText,actualText);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully()
    {
        //click on the ‘Books’ Tab
        WebElement ClickBooks =driver.findElement(By.linkText("Books"));
        ClickBooks.click();

        //* Verify the text ‘Books’
        WebElement VerifyText4 = driver.findElement(By.linkText("Books"));
        String actualText = VerifyText4.getText();
        String expectedText = "Books";
        Assert.assertEquals(expectedText,actualText);

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully()
    {
        //click on the ‘Jewelry’ Tab
        WebElement ClickJewelry = driver.findElement(By.linkText("Jewelry"));
        ClickJewelry.click();

        //* Verify the text ‘Jewelry’
        WebElement VerifyText5 = driver.findElement(By.linkText("Jewelry"));
        String actualText = VerifyText5.getText();
        String expectedText = "Jewelry";
        Assert.assertEquals(expectedText,actualText);

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully()
    {
        //click on the ‘Gift Cards’ Tab
        WebElement ClickGiftCard = driver.findElement(By.linkText("Gift Cards"));
        ClickGiftCard.click();

        //* Verify the text ‘Gift Cards’
        WebElement VerifyText6 = driver.findElement(By.linkText("Gift Cards"));
        String actualText = VerifyText6.getText();
        String expectedText = "Gift Cards";
        Assert.assertEquals(expectedText,actualText);

    }
    @After

    public void closeBrowser()
    {

    }



}
