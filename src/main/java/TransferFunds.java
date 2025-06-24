import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TransferFunds {
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

        //clicking transfer funds module
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("500");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"transferForm\"]/div[2]/input")).click();

        Thread.sleep(2000);

        //Logging out after transfering amount

        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
        driver.close();
    }
}
