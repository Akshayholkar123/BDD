
package stepdefinations;  

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


class SSLogin
{
	public WebDriver driver;
	

@Given("browser is open URL is navigated")
public void browser_is_open_url_is_navigated()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
}

@Given("login page is displayed")
public void login_page_is_displayed() 
{

	driver.findElement(By.id("loginBtn")).click();
}

@When("user enters {string} and {string}")
public void user_enters_and(String username, String password) {
	driver.findElement(By.id("Email")).sendKeys(username);
	driver.findElement(By.id("Password")).sendKeys(password);

}

@When("clicks on login button")
public void clicks_on_login_button() 
{
	driver.findElement(By.xpath("//span[text()='Login']"));
}

@Then("Shopper should be successfully logged in")
public void shopper_should_be_successfully_logged_in() 
{
	Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='Akshay']")).isDisplayed());
	
}

@Then("browser should closed")
public void browser_should_closed() {
	System.out.println("1");
}

@When("user enters \"qa_merchantlogin@gmail.com and \"Password@{int}\"")
public void user_enters_qa_merchantlogin_gmail_com_and_password(Integer int1) {
	System.out.println("1");
}

@Then("Merchant should be successfully logged in")
public void merchant_should_be_successfully_logged_in() {
	System.out.println("1");
}

@When("user enters \"qa_testadmindell@gmail.com and \"Password@{int}\"")
public void user_enters_qa_testadmindell_gmail_com_and_password(Integer int1) {
	System.out.println("1");
}

@Then("Admin must be successfully logged in")
public void admin_must_be_successfully_logged_in() {
	System.out.println("1");
}

@Given("Admin login is displayed")
public void admin_login_is_displayed() {
System.out.println("4");
}

@Given("merchant login is displayed")
public void merchant_login_is_displayed() {
System.out.println("3");
}

@Given("shopper login is displayed")
public void shopper_login_is_displayed() {
	System.out.println("2");
}











}
