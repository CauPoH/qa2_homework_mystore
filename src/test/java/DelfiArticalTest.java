import com.sun.java.util.jar.pack.DriverResource;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.types.CIntegerField;

public class DelfiArticalTest {
    private final By HOME_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'text-size-22')]");
    private final By HOME_PAGE_COMMENTS = By.xpath(".//a[@class = 'comment-count text-red-ribbon']");


    @Test
    public void titleAndCommentsTest() {

        //Open browser
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //Open Delfi home page
        driver.get("http://rus.delfi.lv");

        //Find first article title
        WebElement homePageTitle = driver.findElement(HOME_PAGE_TITLE);

        //Save to String
        String titleToCompare = homePageTitle.getText();

        //Find comments count
        WebElement homePageComments = driver.findElement(HOME_PAGE_COMMENTS);

        //Save to integer
        String comentsToParse = homePageComments.getText(); // получим (1)
        comentsToParse = comentsToParse.substring(1, comentsToParse.length() - 1);
        Integer commentsToCompare = Integer.valueOf(comentsToParse); //peredelali rezuljta v cifru i zapisali


        //Open article page
        //Find Title
        //Check title
        //Find comments count
        //Check comments count
        //Open comments page
        //Find title
        //Check title
        //Get comment count
        //Check comment count
        //Close browser

    }
}
