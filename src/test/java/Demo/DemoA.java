package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoA {
    @Test
    public static void main(String[] arg ){
        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=BriK_W_XpPA");

        //Tắt browser
        driver.quit();
    }
}
