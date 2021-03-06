package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAmazon {

    public WebDriver driver = null;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/prodipbhowmik/eclipse-workspace/selenium1/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://amazon.com");
        driver.manage().window().maximize();
    }


    @Test
    public void test1() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

    @Test
    public void test2() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books", Keys.ENTER);

    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

}