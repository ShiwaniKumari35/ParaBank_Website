import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ForgotLoginInfo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
        Thread.sleep(2000);

        //Clicking on Forgot Login Info Module
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[1]/a")).click();

        //Adding Details for login info
        driver.findElement(By.id("firstName")).sendKeys("Shiwani");
        driver.findElement(By.id("lastName")).sendKeys("Kumari");
        driver.findElement(By.id("address.street")).sendKeys("Jhajha");
        driver.findElement(By.id("address.city")).sendKeys("jhajha");
        driver.findElement(By.id("address.state")).sendKeys("Bihar");
        driver.findElement(By.id("address.zipCode")).sendKeys("811308");
        driver.findElement(By.id("ssn")).sendKeys("9999");
        driver.findElement(By.xpath("//*[@id=\"lookupForm\"]/table/tbody/tr[8]/td[2]/input")).click();
        Thread.sleep(2000);

        //Logging out after getting login info
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();

        driver.close();
    }
}
