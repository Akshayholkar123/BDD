package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	String searchItem;
	WebDriver driver;
	@Given("Welcome page is dispalyed")
	public void welcome_page_is_dispalyed()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	}

	@When("user enters {string} in search text field")
	public void user_enters_in_search_text_field(String searchItem) 
	{
		this.searchItem=searchItem;
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys(searchItem);
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		
	}

	@Then("Search result must be dispalyed")
	public void search_result_must_be_dispalyed()
	{
		Assert.assertTrue(driver.findElement(By.name("Q")).getAttribute("value").contains(searchItem));
	}


}
