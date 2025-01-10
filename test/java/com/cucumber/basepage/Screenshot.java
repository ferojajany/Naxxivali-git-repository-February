package com.cucumber.basepage;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Screenshot {

  public   static void as(WebDriver driver, String asFile){
    TakesScreenshot screenshot= (TakesScreenshot) driver;
    File picture = screenshot.getScreenshotAs(OutputType.FILE);

      



}
}

