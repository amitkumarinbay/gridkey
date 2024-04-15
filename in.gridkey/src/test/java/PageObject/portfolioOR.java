package PageObject;

import org.openqa.selenium.By;

public class portfolioOR {
	
	public static final By PHONE_NUMBER = By.cssSelector("input[id=':r0:'][placeholder='Phone Number']");
	public static final By PASSWORD  = By.name("password");
	public static final By lOGIN = By.cssSelector("button[id=':r4:']");
	
	public static final By CREATE_PORTFOLIO_FIRST = By.cssSelector("#root .overFlowAuto div[class='MuiGrid-root MuiGrid-container css-fzxdby'] div[class='MuiGrid-root MuiGrid-grid-xs-9 css-1y0vq07'] button[tabindex='0']");
	public static final By PORTFOLIO_NAME = By.cssSelector("input[name='name'][placeholder='Portfolio Name']");
	public static final By PORTFOLIO_CODE = By.cssSelector("input[name='portfolioId'][placeholder='Portfolio Code']");
	public static final By SELECT_CLIENT = By.cssSelector(".MuiBox-root div.MuiGrid-item :nth-of-type(3) div.MuiAutocomplete-hasPopupIcon div.MuiInputBase-root");
	public static final By CREATE_PORTFOLIO_SUBMIT = By.cssSelector("button[form='add-portfolio-form']");
	
	
	

}
