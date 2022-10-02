package AdactinPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AdactinSep23bPOM {
	WebDriver driver;
	public AdactinSep23bPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@CacheLookup
	@FindBy(id="username")
	public WebElement txtUsername;
	@CacheLookup
	@FindBy(id="password")
	public WebElement txtPassword;
	@CacheLookup
	@FindBy(id="login") 
	public WebElement btnLogin;
	public void getTxtUsername(String Username) {
		txtUsername.sendKeys(Username);}
	public void getTxtPassword(String password) {
		txtPassword.sendKeys(password);	}
	public void getBtnLogin() {
		btnLogin.click();
		}
}


