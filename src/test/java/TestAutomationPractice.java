import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.LoginAction;
import utils.Constants;
import utils.DriverContext;


class TestAutomationPractice {
	WebDriver driver;
	LoginAction account;

	@BeforeEach
	void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", Constants.PATH_CHOMEDRIVER);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
		account = new LoginAction();
			
	}

	@Test
	void testLogin() {
		
		account.clicarSignIn();
		account.preencheEmail("katiasilva@gmail.com");
		account.preencherPasswd("86100231");
		account.clicarSubmit();
		account.clicarHeader();
		//Compras
		account.preencherCampo("Dress");
		account.clicarSearch();
		account.clicarCenter();
		account.clicarQuanti("2");
		account.clicarSize();
		account.clicarColor();
		account.clicarButton();
		account.clicarProceed();
		account.clicarProceedTo();
		account.preencherObser("Estou em casa a partir das 11:00 h.");
		account.clicarCheckout();
		account.clicarTerms();
		account.clicarTocheckkout();
		account.clicarPayment();
		account.clicarNavegation();
		account.clicarCentercolum();
		account.clicarHome();
		
		
		
		


		
	
	}
	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
		
	}

	
}
