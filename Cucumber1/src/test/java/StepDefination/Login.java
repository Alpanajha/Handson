package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	@Given("^user open TestMeApp$")
	public void useropenTestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\UFT\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@When("^user click signin$")
	   public void userclickclicksignin() {
		   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	   }
	   @And("^user enter credentials as$")
	   public void userentercredentialsas(DataTable dt) {
		   List<String> cred=dt.asList(String.class);
		   driver.findElement(By.name("userName")).sendKeys(cred.get(0));
		   driver.findElement(By.name("password")).sendKeys(cred.get(1));
		   
		   
	   }
	   @Then("^click on login$")
	   public void clickonlogin()
	   {
		   driver.findElement(By.name("Login")).click();
	   }
}
