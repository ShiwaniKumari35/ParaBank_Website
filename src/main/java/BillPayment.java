import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BillPayment {
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

        //Clicking Bill Pay Module
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a")).click();

        //Entering Details for bill pay
        driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Shiwani Kumari");
        driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("NewTown");
        driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("Kolkata");
        driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("West Bengal");
        driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("712123");
        driver.findElement(By.xpath("//*[@id=\"9f3a270a-a5b9-4271-9275-3411491f7d86\"]")).sendKeys("8974562589");
        driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("897456");
        driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[9]/td[2]/input")).sendKeys("897456");
        driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[11]/td[2]/input")).sendKeys("500");

        driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[14]/td[2]/input")).click();

        //Logging out after Paying Bill

        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();

        Thread.sleep(2000);
        driver.close();
    }
}
