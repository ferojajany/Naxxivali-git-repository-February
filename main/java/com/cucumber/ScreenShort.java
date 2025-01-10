package com.cucumber;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenShort {
   public   static void as(WebDriver driver, String asFile){
        TakesScreenshot screenshot= (TakesScreenshot) driver;
        File picture = screenshot.getScreenshotAs(OutputType.FILE);
//        try{

//        }
//

    }
}
