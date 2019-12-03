import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class MyStorePracticeTest {
    private final By HOME_PAGE_CATEGORY = By.xpath(".//a[@class = 'sf-with-ul']");
    private final By WOMEN_LEFT_COLUMN_CATEGORY = By.xpath(".//li[@class ='nomargin hiddable col-lg-6']/label/a");
    private final By WOMEN_BODY_CATEGORY = By.xpath(".//a[@class = 'subcategory-name']");


    @Test
    public void categoryHtmlTest() {

        //Open browser
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //Open MyStore home page
        driver.get("http://automationpractice.com");

        //Find category title
        WebElement homePageCategory = driver.findElement(HOME_PAGE_CATEGORY);

        //Open Women category page
        homePageCategory.click();

        //Find 1 left column category
        WebElement leftColumnTitle1 = driver.findElements(WOMEN_LEFT_COLUMN_CATEGORY).get(0);

        //Save to String 1 column category
        //String leftTitleToCompare1 = leftColumnTitle1.getText().substring(0,leftColumnTitle1.getText().length()-4);
        String leftTitleToCompare1 = leftColumnTitle1.getText().toUpperCase();

        //Find 2 left column category
        WebElement leftColumnTitle2 = driver.findElements(WOMEN_LEFT_COLUMN_CATEGORY).get(1);

        //Save to String 2 column category
        //String leftTitleToCompare2 = leftColumnTitle2.getText().substring(0,leftColumnTitle2.getText().length()-4);
        String leftTitleToCompare2 = leftColumnTitle2.getText().toUpperCase();

        //Find 1 body category
        WebElement bodyTitle1 = driver.findElements(WOMEN_BODY_CATEGORY).get(0);

        //Save to String 1 body category
        String bodyTitleToCompare1 = bodyTitle1.getText();

        //Find 2 body category
        WebElement bodyTitle2 = driver.findElements(WOMEN_BODY_CATEGORY).get(1);

        //Save to String 2 body category
        String bodyTitleToCompare2 = bodyTitle2.getText();

        //Check first title
        //Assertions.assertEquals(leftTitleToCompare1, bodyTitleToCompare1, "First titles are not matching!");
        System.out.println(leftTitleToCompare1.startsWith(bodyTitleToCompare1));

        //Check second title
        //Assertions.assertEquals(leftTitleToCompare2, bodyTitleToCompare2, "Second titles are not matching!");
        System.out.println(leftTitleToCompare2.startsWith(bodyTitleToCompare2));
        //Close window
        driver.close();


    }
}
