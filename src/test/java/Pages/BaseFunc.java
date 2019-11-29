package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseFunc {

    private WebDriver driver;

    public BaseFunc () {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void goToUrl (String url) {
        if (url.startsWith("http://") || url.startsWith("https://")) {  // "||" means OR

        } else {
            url = "http://" + url;
        }
        driver.get(url);
    }

    public WebElement getElement (By locator) {
        return driver.findElement(locator);  //funkcija poiska elementa
    }

}
