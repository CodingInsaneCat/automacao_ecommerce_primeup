package PageObjects;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaInicialPageObject extends PageObject {

    @FindBy(id = "search_query_top")
    private WebElement cmpBuscar;
    @FindBy(name = "submit_search")
    private WebElement btnBuscar;


    public PaginaInicialPageObject(WebDriver driver) {

        super(driver);
    }


    public void buscarItem(String nomeProduto) {
        this.cmpBuscar.sendKeys(nomeProduto);


    }

    public void btnBuscarItem() {
        this.btnBuscar.click();
    }


}
