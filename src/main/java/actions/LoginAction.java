package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.LoginPage;
import utils.DriverContext;

public class LoginAction extends LoginPage {
	protected WebDriverWait wait;
	
	
	public LoginAction() {
		wait = new WebDriverWait(DriverContext.getDriver(), 30);
		//PageFactory.initElements(DriverContext.getDriver(), this);
		
	}
	//Login
	public void clicarSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSignIn)).click();	
	}
	
	public void preencheEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);	
	}
	
	public void preencherPasswd(String Passwd) {
		wait.until(ExpectedConditions.visibilityOf(txtPasswd)).sendKeys(Passwd);	
    }
	
	public void clicarSubmit() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSubmit)).click();
	}
	
	public void clicarHeader() {
		wait.until(ExpectedConditions.elementToBeClickable(linkHeader)).click();
	}
	//Compras 
	public void preencherCampo(String nome) {
		wait.until(ExpectedConditions.visibilityOf(txtNome)).sendKeys(nome);	
	}
	
	public void clicarSearch() {
		wait.until(ExpectedConditions.elementToBeClickable(submitSearch)).click();
	}
	
	public void clicarCenter() {
		wait.until(ExpectedConditions.elementToBeClickable(clickCenter)).click();
	}
	
	public void clicarQuanti(String Quanti) {
		wait.until(ExpectedConditions.visibilityOf(clickQuantity)).clear();
		wait.until(ExpectedConditions.visibilityOf(clickQuantity)).sendKeys(Quanti);		
	}
	
	public void clicarSize() {
		wait.until(ExpectedConditions.elementToBeClickable(clickGroup)).click();
	}
	
	public void clicarColor() {
		wait.until(ExpectedConditions.elementToBeClickable(clickColor)).click();
	}
 
	public void clicarButton() {
		wait.until(ExpectedConditions.elementToBeClickable(clickButton)).click();
	}
	
	public void clicarProceed() {
		wait.until(ExpectedConditions.elementToBeClickable(clickProceed)).click();
	}
	
	public void clicarProceedTo() {
		wait.until(ExpectedConditions.elementToBeClickable(clickProceedto)).click();
	}
	
	public void preencherObser(String texto) {
		wait.until(ExpectedConditions.visibilityOf(txtObserv)).sendKeys(texto);
	}
	
	public void clicarCheckout() {
		wait.until(ExpectedConditions.elementToBeClickable(clickCheckout)).click();
	}
	
	public void clicarTerms() {
		wait.until(ExpectedConditions.elementToBeClickable(clickTerms)).click();
	}
	
	public void clicarTocheckkout() {
		wait.until(ExpectedConditions.elementToBeClickable(clickTocheckout)).click();
	}
	
	public void clicarPayment() {
		wait.until(ExpectedConditions.elementToBeClickable(clickPayment)).click();
	}
	
	public void clicarNavegation() {
		wait.until(ExpectedConditions.elementToBeClickable(clickNavigation)).click();
	}
	
	public void clicarCentercolum() {
		wait.until(ExpectedConditions.elementToBeClickable(clickCentercolum)).click();
	}
	
	public void clicarHome() {
		wait.until(ExpectedConditions.elementToBeClickable(clickHome)).click();
	}

	
}


