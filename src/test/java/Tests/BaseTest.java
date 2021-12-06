package Tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest
{
    @BeforeClass
    public void Setup()
    {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.programiz.com/java-programming/hello-world");
        driver.manage().window().maximize();
        By.xpath("");
    }

    public void GetFirefoxDriver()
    {

    }
}