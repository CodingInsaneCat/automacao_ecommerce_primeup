package StepDefinitions;

import PageObjects.PaginaInicialPageObject;
import TestsRunners.BuscarItemRunner;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class BuscarItemStepDefinitions {
    WebDriver driver;
    BuscarItemRunner pageBuscar = new BuscarItemRunner();
    PaginaInicialPageObject pageInicial = new PaginaInicialPageObject(null);

    @Dado("que usuário possa acessar o site de compras")
    public void que_usuário_possa_acessar_o_site_de_compras() {
        pageBuscar.setup();

    }

    @Quando("informar um dress valido no campo de busca")
    public void informar_um_dress_valido_no_campo_de_busca() {
        pageBuscar.buscarItem();
    }

    @Quando("selecionar o botão de buscar item")
    public void selecionar_o_botão_de_buscar_item() {
        pageInicial.btnBuscarItem();
    }


}
