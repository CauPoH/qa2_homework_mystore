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
        private final By MOBILE_WOOMEN_LEFT_COLUMN_CATEORY = By.xpath(".//h2[contains(@class,  'title')]");
        private final By MOBILE_WOOMEN_LEFT_COLUMN_CATEORY1 = By.xpath(".//ul[contains(@class,  'tree dynamized')]/li/a");
        private final By MOBILE_WOOMEN_BODY_CATEORY = By.xpath(".//a[contains(@class, 'subcategory-name')]");


        @Test
        public void MyStoreMobileTest() {

            //Open browser
            System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
            //Mobile
            Map<String, String> mobileEmulation = new HashMap<String, String>();
            mobileEmulation.put("deviceName", "Galaxy S5");
            Map<String, Object> chromeOptions = new HashMap<String, Object>();
            chromeOptions.put("mobileEmulation", mobileEmulation);
            DesiredCapabilities capabilities= DesiredCapabilities.chrome();
            capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
            WebDriver driver= new ChromeDriver(capabilities);


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
            WebElement mobileWomenPageCategory = driver.findElement(MOBILE_WOOMEN_LEFT_COLUMN_CATEORY);

            //Click women category on women page
            mobileWomenPageCategory.click();


            //Find 1 left column category
            WebElement leftMobileColumnTitle1 = driver.findElements(MOBILE_WOOMEN_LEFT_COLUMN_CATEORY1).get(0);

            //Save to String 1 column category
            String mobileLeftTitleToCompare1 = leftMobileColumnTitle1.getText();

            //Find 2 left column category
            WebElement leftMobileColumnTitle2 = driver.findElements(MOBILE_WOOMEN_LEFT_COLUMN_CATEORY1).get(1);

            //Save to String 2 column category
            String mobileLeftTitleToCompare2 = leftMobileColumnTitle2.getText();


            //Find 1 body category
            WebElement mobileBodyTitle1 = driver.findElements(MOBILE_WOOMEN_BODY_CATEORY).get(0);

            //Save to String 1 body category
            String mobileBodyTitleToCompare1 = mobileBodyTitle1.getText();

            //Find 2 body category
            WebElement mobileBodyTitle2 = driver.findElements(MOBILE_WOOMEN_BODY_CATEORY).get(1);

            //Save to String 2 body category
            String mobileBodyTitleToCompare2 = mobileBodyTitle2.getText();

            //Check first title
            Assertions.assertEquals(mobileLeftTitleToCompare1, mobileBodyTitleToCompare1, "First titles are not matching!");

            //Check second title
            Assertions.assertEquals(mobileLeftTitleToCompare2, mobileBodyTitleToCompare2, "Second titles are not matching!");

            //Close window
            driver.close();


        }
    }
