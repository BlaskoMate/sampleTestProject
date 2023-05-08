import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    @Test
    public void openDemoPage(){
        System.setProperty("/webdriver.chrome.driver","/src/test/resources/drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/");
        WebElement element = driver.findElement(By.xpath("//div[@id='site-name']"));
        System.out.println(element.getText());
        driver.close();
    }
}