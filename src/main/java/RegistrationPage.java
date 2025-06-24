import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
        driver.findElement(By.id("customer.firstName")).sendKeys("Sonal");
        driver.findElement(By.id("customer.lastName")).sendKeys("Kumari");
        driver.findElement(By.id("customer.address.street")).sendKeys("Durga Mandir Jhajha");
        driver.findElement(By.id("customer.address.city")).sendKeys("Jhajha");
        driver.findElement(By.id("customer.address.state")).sendKeys("Bihar");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("811308");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9771598524");
        driver.findElement(By.id("customer.ssn")).sendKeys("987");
        driver.findElement(By.id("customer.username")).sendKeys("Sonal123");
        driver.findElement(By.id("customer.password")).sendKeys("Sonal555");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Sonal555");
        driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
        Thread.sleep(3000);

        //Logging out after successfully registration

        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
        driver.close();

    }

}
