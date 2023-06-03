import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.After;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {
    private WebDriver driver;
    JavascriptExecutor js;

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void 크롬을_통해_제가만든_두둥에_접속한다() throws InterruptedException {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;

        driver.get("https://dudoong.com/");
        driver.manage().window().setSize(new Dimension(1552, 840));
//        WebDriverW
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/a[2]")).click();

        WebDriverWait _wait = new WebDriverWait(driver, Duration.ofMinutes(1));

        _wait.until(d -> d.findElement(By.xpath("/html/body/div/div/div[3]/div/div/main/div[3]/a[2]")));

        driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div/main/div[3]/a[2]")).click();

        _wait.until(d -> d.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div[1]/div[2]/div[2]/div[2]/div[5]/div[1]/div/div[1]/div/span[1]")));
//        Thread.sleep(1000);
//
//        driver.findElement(By.cssSelector("#__next > div > div.css-1bb8jlx > div > div > main > div.css-3xzg0 > a:nth-child(2) > div")).click();
//        Thread.sleep(1000);

    }
    @Test
    public void safari를_통해_구글에서_검색할_수_있다() throws InterruptedException {
        driver = new SafariDriver();
        js = (JavascriptExecutor) driver;

        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(1536, 824));
        {
            WebElement element = driver.findElement(By.linkText("로그인"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".a4bIc")).click();
        driver.findElement(By.cssSelector(".ikrT4e")).click();
        driver.findElement(By.id("APjFqb")).click();
        driver.findElement(By.id("APjFqb")).sendKeys("홍익대학교");
        driver.findElement(By.cssSelector(".LLD4me")).click();
        driver.findElement(By.cssSelector("center:nth-child(1) > .gNO89b")).click();

        WebDriverWait _wait = new WebDriverWait(driver, Duration.ofMinutes(1));

        _wait.until(d -> d.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/a/h3")));


    }
}

