import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/stevemu/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");

//        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys("abc");

//        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[1]")).click();
//        driver.findElement(By.id("Login")).click();
        //*[@id='Login']

//        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("abc");

//        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("abc");
        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();

        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
//        driver.quit();
    }
}
