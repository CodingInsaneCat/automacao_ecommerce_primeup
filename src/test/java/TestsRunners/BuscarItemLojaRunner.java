package TestsRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features = "src\\test\\Resources\\Features",plugin = { "pretty", "html:target/cucumber-reports"}, glue = "\\src\\test\\java\\StepDefinitions\\BuscarItemStepDefinitions")
public class BuscarItemLojaRunner {

    // Botão direito para executar o step
}
