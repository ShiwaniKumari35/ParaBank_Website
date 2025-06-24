import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RequestingLoan {
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

        //Clicking Request Loan module
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[7]/a")).click();

        //Entering the details for loan
        driver.findElement(By.id("amount")).sendKeys("5000");
        driver.findElement(By.id("downPayment")).sendKeys("500");
        driver.findElement(By.xpath("//*[@id=\"requestLoanForm\"]/form/table/tbody/tr[4]/td[2]/input")).click();
        Thread.sleep(2000);

        //Logging out after requesting loan amount

        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();

        driver.close();
    }
}
