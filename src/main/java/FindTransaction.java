import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTransaction {
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

        //Clicking Find Transaction Module
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[5]/a")).click();

        //Finding transaction By id
        driver.findElement(By.id("transactionId")).sendKeys("985647");
        driver.findElement(By.id("findById")).click();


        //Finding transaction By Date
        driver.findElement(By.id("transactionDate")).sendKeys("06-22-2025");
        driver.findElement(By.id("findByDate")).click();

        //Finding transaction by Date Range
        driver.findElement(By.id("fromDate")).sendKeys("06-10-2025");
        driver.findElement(By.id("toDate")).sendKeys("06-30-2025");
        driver.findElement(By.id("findByDateRange")).click();

        //Find transaction by Amount
        driver.findElement(By.id("amount")).sendKeys("500");
        driver.findElement(By.id("findByAmount")).click();

        //Logging out after Finding Transactions

        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();

        Thread.sleep(2000);
        driver.close();


    }
}
