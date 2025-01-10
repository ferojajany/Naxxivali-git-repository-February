package com.cucumber.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    By dateOfBirthLocator=By.id("dateOfBirthInput");
    By monthLocator =By.xpath("//select[@class='react-datepicker__month-select']");
    By yearLocator = By.xpath("//select[@class='react-datepicker__year-select']");
    By DateSelectLocator = By.xpath("//div[@aria-label='Choose Thursday, August 19th, 2010']");

    @FindBy(xpath = "//label[@class='custom-control-label']")
    List<WebElement> chackbox;
     @FindBy(id = "uploadPicture")
     WebElement fileuplode;
//    public List<WebElement> checkBopxprint(){
//        List<WebElement>print=driver.findElements(checkboxLocator);
//        return print;
//    }
    public void sizecheck(int index){
       chackbox.get(index).click();

        }
        public int sizeAllcheckbox(){
        return chackbox.size();
        }

    public void dateOfBirthClick(){
        WebElement dateOfbiryhElement= driver.findElement(dateOfBirthLocator);
        dateOfbiryhElement.click();
    }
    public void monthSelect(int index){
        WebElement monthElement= driver.findElement(monthLocator);
        Select select = new Select(monthElement);
        select.selectByIndex(index);
    }
    public void yearSelect(int index){
        WebElement yearElement= driver.findElement(yearLocator);
        Select select=new Select(yearElement);
        select.selectByIndex(index);


    }
    public int size(){
        WebElement sizeElement= driver.findElement(yearLocator);
        Select select=new Select(sizeElement);
        List<WebElement>size=select.getOptions();
        return size.size();
    }

    public int sizemonth(){
        WebElement sizeElement= driver.findElement(monthLocator);
        Select select=new Select(sizeElement);
        List<WebElement>size=select.getOptions();
        return size.size();
    }

    public void DateSelect(){
        WebElement DateElement= driver.findElement(DateSelectLocator);
        DateElement.click();
    }
    public void  sendkeys(String input){
        fileuplode.sendKeys(input);
    }
}
