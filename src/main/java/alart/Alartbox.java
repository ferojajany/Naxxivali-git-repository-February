package alart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alartbox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();

        Alert alart = driver.switchTo().alert();
        System.out.println(alart.getText());
        alart.accept();
    }
}
