import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreate {
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

        //Clicking in Creating new acc hyperlink
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"openAccountForm\"]/form/div/input")).click();

        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"type\"]"));

        // Instantiate the Select class
        Select dropdown = new Select(dropdownElement);

        // Select an option by value
        dropdown.selectByValue("Savings");

        // Select an option by index
        //dropdown.selectByIndex(1);


    }

}
