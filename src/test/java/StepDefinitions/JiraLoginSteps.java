package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class JiraLoginSteps {
	WebDriver driver = null;
	@Given("browser is open")
	public void browser_open() {

		System.out.println("Inside step - Browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is:" + projectPath);

		System.setProperty("webdriver.chrome.driver",
				projectPath + "/src/test/resources/BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {

		driver.navigate().to("https://tejira.tataelxsi.co.in/login.jsp");
		
		Thread.sleep(2000);

	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() throws InterruptedException {

		driver.findElement(By.id("login-form-username")).sendKeys("anjitha.s");
		driver.findElement(By.id("login-form-password")).sendKeys("Elxsi@1996");

		Thread.sleep(2000);
		
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {

		driver.findElement(By.id("login-form-submit")).click();

	}

	@Then("user is navigated to the home page of Bigpicture")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		driver.navigate().to("https://tejira.tataelxsi.co.in/plugins/servlet/softwareplant-bigpicture/#/box/ROOT/o/hierarchy");
		
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
	}
}
