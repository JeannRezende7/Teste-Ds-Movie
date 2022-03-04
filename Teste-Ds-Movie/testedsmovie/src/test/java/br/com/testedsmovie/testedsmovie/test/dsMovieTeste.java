package br.com.testedsmovie.testedsmovie.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.Keys;

import br.com.testedsmovie.testedsmovie.page.dsMoviePo;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class dsMovieTeste extends baseTest {

    dsMoviePo dsmoviePage = new dsMoviePo(driver);

    @Test
    public void TC001_DeveAbrirAPaginaEVerificarSeExistemCards() {
        String textoBotao = dsmoviePage.ButtonAvaliar.getText();
        assertEquals("Avaliar", textoBotao);
    }

    @Test
    public void TC002_DeveVerificarSeIniciouNaPagina1() throws InterruptedException {
        Thread.sleep(1000);
        String Paginas = dsmoviePage.NumeroDasPaginas.getText();
        assertEquals("1 de 3", Paginas);
    }

    @Test
    public void TC003_DeveVerificarSeMudaDePagina() throws InterruptedException {
        dsmoviePage.ButtonProximaPagina.click();
        Thread.sleep(1000);
        String Paginas = dsmoviePage.NumeroDasPaginas.getText();
        assertEquals("2 de 3", Paginas);

    }

    @Test
    public void TC004_DeveVerificarSeClicarNoBotaoAvaliarMudaDePagina() {
        dsmoviePage.ButtonAvaliar.click();
        String classeEmail = dsmoviePage.CampoEmail.getTagName();
        assertEquals("input", classeEmail);
    }

    @Test
    public void TC005_DeveTestarOCampoEmailComEmailInvalidoEVerSeNaoVaiSalvar() {
        dsmoviePage.CampoEmail.sendKeys("emailerrado#gmail.com" + Keys.ENTER);
        String classeEmail = dsmoviePage.CampoEmail.getTagName();
        assertEquals("input", classeEmail);
    }

    @Test
    public void TC006_DeveTestarOCampoEmailComEmailValidoESalvar() {
        dsmoviePage.CampoEmail.sendKeys("emailcerto@gmail.com" + Keys.ENTER);
        String textoBotao = dsmoviePage.ButtonAvaliar.getText();
        assertEquals("Avaliar", textoBotao);
    }

}
