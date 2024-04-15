package Method;


import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import PageObject.portfolioOR;

public class portfolioMethod {
	
	
		final static Logger logger = LogManager.getLogger(portfolioMethod.class);

		public static void launchBrowser(WebDriver driver, String url) {
			try {
				driver.get(url);
				logger.info("Browser is launched successfully");
			} catch (TimeoutException e) {
				logger.error("Timeout occurred while loading the URL", e);
			}
		}

		public static void enterPhoneNumber(WebDriver driver, String PhoneNumber) {
			try {
				driver.findElement(portfolioOR.PHONE_NUMBER).sendKeys(PhoneNumber);
				logger.info("Value is entered into Phone Number Text box");
			} catch (NoSuchElementException e) {
				logger.error("Phone Number Text box not found", e);
			}
		}

		public static void enterPassword(WebDriver driver, String password) {
			try {
				driver.findElement(portfolioOR.PASSWORD).sendKeys(password);
				logger.info("Value is entered into Password Text box");
			} catch (NoSuchElementException e) {
				logger.error("Password Text box not found", e);
			}
		}

		public static void clickLogin(WebDriver driver) {
			try {
				driver.findElement(portfolioOR.lOGIN).click();
				logger.info("Login Button is successfully clicked");
			} catch (NoSuchElementException e) {
				logger.error("Login Button not found", e);
			}
		}

		public static void verifyUrl(WebDriver driver) {
		    try {
		        String expectedUrl = "https://stage.gridkey.in/app/portfolio-page";
		        
		        // Wait until the URL changes to the expected URL
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Adjust the timeout as needed
		        wait.until(ExpectedConditions.urlToBe(expectedUrl));

		        String actualUrl = driver.getCurrentUrl();
		        Assert.assertEquals(actualUrl, expectedUrl);
		        logger.info("User successfully logged in to the portal");
		    } catch (TimeoutException e) {
				logger.error("Timed out waiting for URL to be: " + "https://stage.gridkey.in/app/portfolio-page" , e);
		    } catch (NoSuchElementException e) {
		        logger.error("actualUrl not matched with expectedUrl", e);
		    }
		}
		
		
		public static void createPortfolioFirst(WebDriver driver) throws InterruptedException {
		    try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Adjust the timeout as needed
		        
		        // Wait until the element is present and visible
		        WebElement createPortfolioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(portfolioOR.CREATE_PORTFOLIO_FIRST));
		        
		        // Attempt to click with retry mechanism
		        int attempts = 0;
		        while (attempts < 2) { // Retry at most twice
		            try {
		                createPortfolioButton.click();
		                logger.info("Create Portfolio Button is successfully clicked");
		                break; // If click succeeds, exit the loop
		            } catch (StaleElementReferenceException e) {
		                // Handle StaleElementReferenceException by refreshing the element
		                createPortfolioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(portfolioOR.CREATE_PORTFOLIO_FIRST));
		            }
		            attempts++;
		        }
		    } catch (NoSuchElementException e) {
		        logger.error("Create Portfolio Button not found", e);
		    }
		}
		
		
		
		public static void enterPortfolioName(WebDriver driver, String PortfolioName) {
			try {
				driver.findElement(portfolioOR.PORTFOLIO_NAME).sendKeys(PortfolioName);
				logger.info("Value is entered into Portfolio Name Text box");
			} catch (NoSuchElementException e) {
				logger.error("Portfolio Name Text box not found", e);
			}
		}
		
		public static void enterPortfolioCode(WebDriver driver, String PortfolioCode) {
			try {
				driver.findElement(portfolioOR.PORTFOLIO_CODE).sendKeys(PortfolioCode);
				logger.info("Value is entered into Portfolio Code Text box");
			} catch (NoSuchElementException e) {
				logger.error("Portfolio Code Text box not found", e);
			}
		}
		
		
		public static void selectClass(WebDriver driver, String classValue) {
		    try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Waiting up to 10 seconds
		        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(portfolioOR.SELECT_CLIENT));
		        element.click();
		        Select obj = new Select(element);
		        obj.selectByIndex(1);
		        logger.info("Value is entered into Select Class Combobox");
		    } catch (NoSuchElementException e) {
		        logger.error("Select Class combobox not found", e);
		    } catch (ElementClickInterceptedException e) {
		        logger.error("Element click intercepted", e);
		    }
		}


		    
		    
		
		public static void createPortfolioSubmit(WebDriver driver) {
			try {
				
				driver.findElement(portfolioOR.CREATE_PORTFOLIO_SUBMIT).click();
				logger.info("Create Portfolio Button is successfully clicked");
			} catch (NoSuchElementException e) {
				logger.error("Create Portfolio Button not found", e);
			}
		}
		
		
		
		
		
	}
