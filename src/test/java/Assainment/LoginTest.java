package Assainment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    //private static final Logger logger = LogManager.getLogger(LoginTest.class);


    @Test(testName = "Test case 1")
    public void test1() throws InterruptedException {

        LoginPage homePage = new LoginPage(driver);
        homePage.visitLoginPage("https://www.saucedemo.com/");

        homePage.enteruser("standard_user");
        homePage.enterpassword("secret_sauce");
        homePage.clickButton();
        Thread.sleep(3000);

        String actule = null;
        try {
            actule = driver.findElement(By.xpath("//span[text()='Products']")).getAttribute("innerHTML");
        } catch (Exception e) {

        }
        Assert.assertEquals(actule, "Products", "not match");


    }

    @Test(testName = "Test case 2")
    public void test2() {
        LoginPage homePage = new LoginPage(driver);
        homePage.enteruser("locked_out_user");
        homePage.enterpassword("secret_sauce");
        homePage.clickButton();
        // homePage.geterrormassage();
        // logger.info("Test case 2=Input username,password,click");


    }
}
