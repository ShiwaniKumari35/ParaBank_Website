import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateProfile {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Shiwani035");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("Shiwani035");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        Thread.sleep(2000);

        //Clicking Update Contact Info  Module
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[6]/a")).click();
        driver.findElement(By.id("customer.firstName")).sendKeys("Shiwani");
        driver.findElement(By.id("customer.lastName")).sendKeys("Mathuri");
        driver.findElement(By.id("customer.address.street")).sendKeys("Purani Bazar");
        driver.findElement(By.id("customer.address.city")).sendKeys("Jhajha");
        driver.findElement(By.id("customer.address.state")).sendKeys("Bihar");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("811308");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("8529637410");
        driver.findElement(By.xpath("//*[@id=\"updateProfileForm\"]/form/table/tbody/tr[8]/td[2]/input")).click();

        //Logging out after Updating Contact Info

        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();

        Thread.sleep(2000);
        driver.close();
    }

    }
