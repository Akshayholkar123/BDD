package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	@Given("Browser is open and URL is navigated")
	public void browser_is_open_and_url_is_navigated()
	{
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
	}

	@Given("Login page is displayed")
	public void login_page_is_displayed() 
	{
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}

	@When("user enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() 
	{
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("qa_testuser123@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password@123");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("User should be successfully logged in")
	public void user_should_be_successfully_logged_in() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}

	@Then("browser should close")
	public void browser_should_close() 
	{
		driver.close();
	}




}
