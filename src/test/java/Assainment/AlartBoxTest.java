package Assainment;

import org.testng.annotations.Test;

public class AlartBoxTest extends BaseTest{
    @Test
    public void alareboxtest() throws InterruptedException {
        GetAlarBoxPage getalartboxpage = new GetAlarBoxPage(driver);
        getalartboxpage.visitPage("https://demo.automationtesting.in/Alerts.html");
        getalartboxpage.clickalartBox();
        Thread.sleep(2000);
        getalartboxpage.displayElament();
        Thread.sleep(2000);
        String massege = getalartboxpage.getalartboxText();
        System.out.println(massege);
        Thread.sleep(2000);
        getalartboxpage.acceptalart();


    }
}
