import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStorePracticeTest {
    private final By HOME_PAGE_CATEGORY = By.xpath(".//a[@class = 'sf-with-ul']");


    @Test
    public void categoryHtmlAndMobileTest() {

        //Open browser
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //Open MyStore home page
        driver.get("http://automationpractice.com");

        //Find first article title
        WebElement homePageCategory = driver.findElement(HOME_PAGE_CATEGORY);

        //Open Women category page


        //Save to String
        // String titleToCompare = homePageTitle.getText();

        //Find comments count
        // WebElement homePageComments = driver.findElement(HOME_PAGE_COMMENTS);

        //Save to integer
        //  String comentsToParse = homePageComments.getText(); // получим (1)
        //  comentsToParse = comentsToParse.substring(1, comentsToParse.length() - 1);
        // Integer commentsToCompare = Integer.valueOf(comentsToParse); //peredelali rezuljta v cifru i zapisali


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
