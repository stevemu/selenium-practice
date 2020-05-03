import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.ZonedDateTime;

public class formMethods {
    public static void main(String[] args) {
        long startTime = ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println("start time: " + startTime);

        System.setProperty("webdriver.chrome.driver", "/Users/stevemu/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://todomvc.com/examples/react/#/active");

        // find todos

        if (!driver.findElement(By.xpath("//*[text()='todos']")).isDisplayed()) {
            System.out.println("todos not showing");
        } else {
            System.out.println("todo showing");
        }

        // enter input
        driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("Hello Yiwen");
        driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);

        if (!driver.findElement(By.xpath("//*[text()='Hello Yiwen']")).isDisplayed()) {
            System.out.println("Hello yiwen not showing");
        } else {
            System.out.println("Hello yiwen showing");
        }


        // click on completed
        driver.findElement(By.xpath("//*[text()='Completed']")).click();

        if (!driver.getCurrentUrl().equals("http://todomvc.com/examples/react/#/completed")) {
            System.out.println("url not changed to completed");
        } else {
            System.out.println("url changed to http://todomvc.com/examples/react/#/completed");
        }

        // find an nonexist element

        try {
            driver.findElement(By.xpath("//*[text()='todos1']"));

        } catch (Exception e) {
            System.out.println("todos1 not found");
            long endTime = ZonedDateTime.now().toInstant().toEpochMilli();
            System.out.println("end time: " + endTime);
            System.out.println((endTime - startTime) + " miliseconds");
        }


    }
}
