package Assainment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAlarBoxPage extends Basepage {
    public GetAlarBoxPage(WebDriver driver) {
        super(driver);
    }
    public void visitAlartBox(String alarturl){
        visitPage(alarturl);
    }
   By alartLocator = By.xpath("//a[text()='Alert with OK & Cancel ']");
    By okLocator = By.xpath("//button[text()='click the button to display a confirm box ']");

public  void clickalartBox(){
    WebElement alartElement= driver.findElement(alartLocator);
    clickon(alartElement);
}
public void displayElament(){
    WebElement displayelement = driver.findElement(okLocator);
    clickon(displayelement);
}
public String getalartboxtext(){
   return getalartboxText();

}
}
