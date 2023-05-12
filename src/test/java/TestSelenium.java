import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium {
    @Test
    public void openDemoPage(){
        System.setProperty("/webdriver.chrome.driver","/usr/local/bin/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("/opt/google/chrome/google-chrome.exe");
        options.addArguments("--headless");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://demo.guru99.com/");
        WebElement element = driver.findElement(By.xpath("//div[@id='site-name']"));
        System.out.println(element.getText());
        driver.close();
    }
}