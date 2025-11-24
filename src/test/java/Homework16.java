import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework16 extends BaseTest {

    @Test

    public void testRegistrationLink() {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://qa.koel.app/";
        driver.get(url);
        WebElement Reg = driver.findElement(By.xpath("//a[contains(@href, 'registration')]"));
        Reg.click();
        String url1;
        url1 = driver.getCurrentUrl();
        Assert.assertTrue(url1.contains(url));
        driver.quit();
    }

}