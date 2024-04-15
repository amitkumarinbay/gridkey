package Step;


import org.openqa.selenium.WebDriver;
import Method.portfolioMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class portfolioStep {
	
	
	private WebDriver driver;
	
	public portfolioStep() {
		driver = Hooks.driver ; 
	}
	

    @Given("the user navigates to the Browser Window Page at {string}")
    public void navigateToBrowserWindow(String url) {
    	portfolioMethod.launchBrowser(driver, url);
     
    }

    @When("the user enters the Phone Number as {string}")
    public void enterPhoneNumber(String phoneNumber) {
    	portfolioMethod.enterPhoneNumber(driver, phoneNumber);
     
    }

    @And("the user enters the password as {string}")
    public void enterPassword(String password) {
    	portfolioMethod.enterPassword(driver, password);
 
    }

    @And("the user clicks on the login button")
    public void clickLoginButton() {
    	portfolioMethod.clickLogin(driver);
  
    }

    @And("the user should log in successfully into the portal.")
    public void verifyLoginSuccess() throws InterruptedException {
    	portfolioMethod.verifyUrl(driver);
       
    }

    @And("the user clicks on {string}")
    public void clickOnElement(String element) throws InterruptedException {
    	portfolioMethod.createPortfolioFirst(driver);
    
    }

    @And("the user enters Portfolio Name as {string}")
    public void enterPortfolioName(String portfolioName) {
    	portfolioMethod.enterPortfolioName(driver, portfolioName);
    	
    }

    @And("the user enters Portfolio Code as {string}")
    public void enterPortfolioCode(String portfolioCode) {
    	portfolioMethod.enterPortfolioCode(driver, portfolioCode);
    }
    
    @And("the user clicks on {string} button")
    public void the_user_clicks_on_button(String string) {
    	portfolioMethod.selectClass(driver, string);

    }


    @Then("the portfolio is successfully created.")
    public void verifyPortfolioCreation() {
    	portfolioMethod.createPortfolioSubmit(driver);	
   
    }
}