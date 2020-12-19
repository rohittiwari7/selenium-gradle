import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class Google
{
    @Test
    public void login() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","ChromeDriver");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");

    driver.findElement(By.name("q")).sendKeys("IntelliJ IDEA");
    Thread.sleep(4000);
    driver.quit();
    }
}
