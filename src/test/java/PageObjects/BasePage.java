package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        if(driver ==null) {
            this.driver = new ChromeDriver();
        }else {
            this.driver = driver;
        }
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Giovanni\\IdeaProjects\\automacaoDemo\\src\\test\\Resources\\drivers\\chromedriver.exe");
    }

    public void urlNavegate(String url) {
        driver.navigate().to(url);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void closeNavegator() {
        getDriver().close();
    }

}