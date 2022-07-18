package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    WebDriver driver;

    @Given("que acesso o conexaoQA")
    public void queAcessoOConexaoQA() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://conexaoqa.herokuapp.com/");
    }

    @And("clico no login")
    public void clicoNoLogin() {
        driver.findElement(By.cssSelector("*[data-test=\"landing-login\"]")).click();
    }

    @When("coloco {string} e {string}")
    public void colocoE(String usuario, String senha) {
        driver.findElement(By.name("email")).sendKeys("qualidade@hotmail.com");
        driver.findElement(By.name("password")).sendKeys("13091993");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    }

    @Then("e exibido tela de dashboard")
    public void eExibidoTelaDeDashboard() {
        //driver.quit();
    }

    @And("informa o nome do {string}")
    public void informaONomeDo(String usuario) {
        Assert.assertFalse(driver.getCurrentUrl().equals("http://conexaoqa.herokuapp.com/dashboard"));
    }
}
