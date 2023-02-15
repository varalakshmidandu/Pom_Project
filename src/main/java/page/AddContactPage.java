package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPage extends BasePage{

WebDriver driver;
	
	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"account\"]") WebElement fullNameElement;
	@FindBy(how = How.XPATH, using ="//*[@id=\"cid\"]") WebElement companyElement;
	@FindBy(how = How.XPATH, using ="//*[@id=\"email\"]") WebElement emailElement;
	@FindBy(how = How.XPATH, using ="//*[@id=\"phone\"]") WebElement phoneElement;
	@FindBy(how = How.XPATH, using ="//*[@id=\"address\"]") WebElement addressElement;
	@FindBy(how = How.XPATH, using ="//*[@id=\"city\"]") WebElement cityElement;
	@FindBy(how = How.XPATH, using ="//*[@id=\"state\"]") WebElement stateElement;
	@FindBy(how = How.XPATH, using ="//*[@id=\"zip\"]") WebElement zipElement;
	@FindBy(how = How.XPATH, using ="//*[@id=\"country\"]") WebElement countryElement;
	@FindBy(how = How.XPATH, using ="//*[@id=\"submit\"]") WebElement saveElement;
	
	public void insertFullName(String fullName) {
		fullNameElement.sendKeys(fullName + generateRandomNum(999));
	}
	
	public void selectCompany(String company) {
		selectFromDropdown(companyElement, company);
	}
	
	public void insertEmail(String email) {
		emailElement.sendKeys(generateRandomNum(9999) + email);
	}
	public void insertPhone(String phone) {

       phoneElement.sendKeys(phone);
	}
	public void insertAddress(String address) {
		addressElement.sendKeys(address);
	}
	public void insertCity(String city) {
		cityElement.sendKeys(city);
	}
	
	public void insertState(String state) {
		stateElement.sendKeys(state);
	}
	public void insertZip(String zip) {
		zipElement.sendKeys(zip);
	}
	public void insertCountry(String country) {
		countryElement.sendKeys(country);
	}
	public void clickSaveButton(){
		saveElement.click();
	}
	
}

