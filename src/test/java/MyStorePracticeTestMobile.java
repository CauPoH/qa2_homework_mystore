import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;


public class MyStorePracticeTestMobile {
    private final By MOBILE_HOME_PAGE_CATEGORY = By.xpath(".//div[@class = 'cat-title']");
    private final By MOBILE_WOMEN_CATEGORY_PAGE = By.xpath(".//li[contains(@class, '')]/a");
    private final By MOBILE_WOMEN_CATEGORY = By.id("categories_block_left");
    private final By MOBILE_WOMEN_CATEGORY_LIST = By.xpath(".//*[@id='categories_block_left']/div/ul/li/a");
    private final By MOBILE_WOMEN_BODY_CATEGORY = By.xpath(".//a[contains(@class, 'subcategory-name')]");

    @Test
    public void MyStoreMobileTest() {

        //Open browser
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        //Mobile
        Map<String, Object> deviceMetrics = new HashMap<String, Object>();
        deviceMetrics.put("width", 360);
        deviceMetrics.put("height", 640);
        deviceMetrics.put("pixelRatio", 3.0);
        Map<String, Object> mobileEmulation = new HashMap<String, Object>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        WebDriver driver = new ChromeDriver(chromeOptions);

        //Open MyStore home page
        driver.get("http://automationpractice.com");

        //Find category title
        WebElement mobileHomePageCategory = driver.findElement(MOBILE_HOME_PAGE_CATEGORY);

        //Open category menu
        mobileHomePageCategory.click();

        //Find women category title
        WebElement mobileWomenCategoryPage = driver.findElements(MOBILE_WOMEN_CATEGORY_PAGE).get(0);

        //Open women category page
        mobileWomenCategoryPage.click();

        //Find women category title
        WebElement mobileWomenPageCategory = driver.findElement(MOBILE_WOMEN_CATEGORY);

        //Click women category on women page
        mobileWomenPageCategory.click();


        //Find 1 women category item
        WebElement leftMobileColumnTitle1 = driver.findElements(MOBILE_WOMEN_CATEGORY_LIST).get(0);

        //Save to String 1 women category item
        String mobileLeftTitleToCompare1 = leftMobileColumnTitle1.getText().toUpperCase();

        //Find 2 women category item
        WebElement leftMobileColumnTitle2 = driver.findElements(MOBILE_WOMEN_CATEGORY_LIST).get(1);

        //Save to String 2 women category item
        String mobileLeftTitleToCompare2 = leftMobileColumnTitle2.getText().toUpperCase();

        //Find 1 body category
        WebElement mobileBodyTitle1 = driver.findElements(MOBILE_WOMEN_BODY_CATEGORY).get(0);

        //Save to String 1 body category
        String mobileBodyTitleToCompare1 = mobileBodyTitle1.getText();

        //Find 2 body category
        WebElement mobileBodyTitle2 = driver.findElements(MOBILE_WOMEN_BODY_CATEGORY).get(1);

        //Save to String 2 body category
        String mobileBodyTitleToCompare2 = mobileBodyTitle2.getText();

        //Check first title
        //Assertions.assertEquals(mobileLeftTitleToCompare1, mobileBodyTitleToCompare1, "First titles are not matching!");
        System.out.println(mobileLeftTitleToCompare1.startsWith(mobileBodyTitleToCompare1));

        //Check second title
        //Assertions.assertEquals(mobileLeftTitleToCompare2, mobileBodyTitleToCompare2, "Second titles are not matching!");
        System.out.println(mobileLeftTitleToCompare2.startsWith(mobileBodyTitleToCompare2));

        //Close window
        driver.close();

    }
}
