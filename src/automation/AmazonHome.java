package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AmazonHome {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/Users/prodipbhowmik/eclipse-workspace/selenium1/driver/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.navigate().to("https://amazon.com");
            String title = driver.getTitle();
            Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
            driver.manage().window().maximize();
            driver.close();


        }

    }