package br.com.testedsmovie.testedsmovie.test;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*

--Pausas no tempo de execução para aguardar Elemento--

Implicitamente, é aplicavel para todos os elementos da pagina.
driver.manage().timeouts().implicitlyWait(ALGUM_NUMERO, TimeUnit.SECONDS);

//Explicitamente, aplicado para um elemento particular.
WebDriverWait.until(CONDICAO_QUE_BATE_COM_O_ELEMENTO);

//E para casos mais específicos.
WebDriverWait espera = new WebDriverWait(driver, 40);
WebElement element = espera.until(ExpectedConditions.elementToBeClickable(By.id("algumid")));
}

*/

public class baseTest {
    protected static WebDriver driver;
    private static final String URL_BASE = "https://jeannrezende7dsmovie.netlify.app/";

    @BeforeAll
    public static void iniciar() {
        driver = new ChromeDriver();
        driver.get(URL_BASE);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterAll
    public static void finalizar() {
       driver.quit();
    }

}
