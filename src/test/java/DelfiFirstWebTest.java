import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelfiFirstWebTest {
    /**
     * ljuboj tekst
     */
//    tozhe ljuboj koment v predelah stroki

    @Test
    public void delfiFirstTitleTest() {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://delfi.lv");

    }
}
