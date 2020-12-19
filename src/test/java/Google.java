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
    driver.manage().window().maximize();
    driver.get("https://www.google.com");

    driver.findElement(By.name("q")).sendKeys("IntelliJ IDEA");

        driver.findElement(By.cssSelector("div.hsuHs")).click();
    Thread.sleep(2000);
    driver.quit();
    }
}
