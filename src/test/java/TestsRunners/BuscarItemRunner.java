package TestsRunners;

import PageObjects.PaginaInicialPageObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class BuscarItemRunner {
    WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Giovanni\\IdeaProjects\\automacaoDemo\\src\\test\\Resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @Test
    public void buscarItem() {
        PaginaInicialPageObject pageInicial = new PaginaInicialPageObject(driver);
        pageInicial.buscarItem();
        pageInicial.btnBuscarItem();

    }

    @After
    public void tearDown(){
        driver.close();
    }

}