package Assainment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Basepage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By userInputLocator=By.id("user-name");
    private final By passwordInputLocator=By.id("password");
    private final By loginInputLocator=By.id("login-button");

public void visitLoginPage(String wibsideurl){
    visitPage(wibsideurl);
}

//    @FindBy(id="user-name")
//    private WebElement userElement;
//    @FindBy(id = "password")
//    private WebElement passwordElement;
//    @FindBy(id = "login-button")
//    private WebElement  clickElement;

    public void enteruser(String username){
       WebElement userElement = driver.findElement(userInputLocator);
        sendkey(userElement,username);
    }
    public void enterpassword(String password){
       WebElement passwordElement = driver.findElement(passwordInputLocator);
        sendkey(passwordElement,password);
    }
    public void clickButton(){
        WebElement clickElement = driver.findElement(loginInputLocator);
        clickon(clickElement);
    }


}
