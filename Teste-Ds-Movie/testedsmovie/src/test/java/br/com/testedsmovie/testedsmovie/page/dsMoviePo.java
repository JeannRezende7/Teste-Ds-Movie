package br.com.testedsmovie.testedsmovie.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dsMoviePo extends BasePo {

    public dsMoviePo(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/a/div" )
    public WebElement ButtonAvaliar;

    @FindBy(className = "dsmovie-contact-link")
    public WebElement ContactLink;
    
    @FindBy(className = "dsmovie-flip-horizontal")
    public WebElement ButtonProximaPagina;

    @FindBy (xpath = "/html/body/div/div[1]/div/p")
    public WebElement NumeroDasPaginas;

    @FindBy (id =  "email")
    public WebElement CampoEmail;
    
}
