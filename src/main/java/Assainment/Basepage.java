package Assainment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Basepage {
    WebDriver driver;
    public  void  visitPage(String url){
        driver.get(url);
    }

    public Basepage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendkey(WebElement eleement, String input){

        eleement.sendKeys(input);
    }
    public void clickon(WebElement element){
        element.click();
    }

    public String getalartboxText(){
        String text= driver.switchTo().alert().getText();
        return text;

    }
    public void acceptalart(){
        driver.switchTo().alert().accept();
    }
}
