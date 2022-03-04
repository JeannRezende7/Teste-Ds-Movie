# Teste-Ds-Movie
Teste Aplicação Ds-Movie feita na semana SpringReact Disponivel no Link : https://jeannrezende7dsmovie.netlify.app/.

Anotações para guardar:
Funções de tempo:

-- Pausa na aplicação.
Thread.sleep(1000); -- Adiciona um throws

--Pausas no tempo de execução para aguardar Elemento--

Implicitamente, é aplicavel para todos os elementos da pagina.
driver.manage().timeouts().implicitlyWait(ALGUM_NUMERO, TimeUnit.SECONDS);

//Explicitamente, aplicado para um elemento particular.
WebDriverWait.until(CONDICAO_QUE_BATE_COM_O_ELEMENTO);

//E para casos mais específicos.
WebDriverWait espera = new WebDriverWait(driver, 40);
WebElement element = espera.until(ExpectedConditions.elementToBeClickable(By.id("algumid")));
}
