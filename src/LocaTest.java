import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaTest {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/stevemu/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:5000/");


        driver.findElement(By.id("new-todo")).sendKeys("abc");
        driver.findElement(By.id("add-todo")).sendKeys(Keys.ENTER);


    }
}
