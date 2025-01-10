package com.cucumber.stepDafinition;

import com.cucumber.basepage.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Dafinition {

    private static final Logger logger = LogManager.getLogger(Dafinition.class);
    WebDriver driver;
    BasePage baseTst;
    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Given("Student is on the regestration form")
    public void student_is_on_the_regestration_form() {
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("https://demoqa.com/automation-practice-form");
      logger.info("open url page");
     baseTst = new BasePage(driver);
    }

    @When("Student enters name email")
    public void student_enters_name_email() {

    }
    @When("Student choice gender")
    public void student_choice_gender() {
        baseTst.sizecheck(0);
        int print =baseTst.sizeAllcheckbox();
        System.out.println("CheckBox ="+print);
        logger.info("student chooce gender");
    }
    @When("Student give phonenumber")
    public void student_give_phonenumber() {

    }

    @Then("Student give date of birth")
    public void student_give_date_of_birth() throws InterruptedException {

        baseTst.dateOfBirthClick();
        baseTst.monthSelect(7);
        int monthsize= baseTst.sizemonth();
        System.out.println("All month ="+monthsize);
        baseTst.yearSelect(110);
     int size = baseTst.size();
        System.out.println("All year ="+size);
        //Thread.sleep(3000);
        baseTst.DateSelect();
    }
    @When("Student provide subject")
    public void student_provide_subject() {

    }

    @When("Student choice hobbies")
    public void student_choice_hobbies() {
     baseTst.sizecheck(4);
     baseTst.sizecheck(5);

    }

    @When("Student provide current address")
    public void student_provide_current_address() {

    }

    @When("Student will select state and city")
    public void student_will_select_state_and_city() {
    }

    

    @After
    public void tearDown(){
        driver.quit();
    }

}