package stepdefinations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Book 
{
	WebDriver driver;
	
	@Given("browser is open to welcome page")
	public void browser_is_open_to_welcome_page()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	}

	@When("user is logged in")
	public void user_is_logged_in(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		String userName=data.get(0).get(0);
		String password=data.get(0).get(1);
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

	@When("user clicks on Book page")
	public void user_clicks_on_book_page() {
	}

	@When("Books page is displayed")
	public void books_page_is_displayed() {
	}

	@When("user chooses A-Z in sort by drop down")
	public void user_chooses_a_z_in_sort_by_drop_down() {
	}

	@Then("page should be sorted alphabetically")
	public void page_should_be_sorted_alphabetically() {
	}

	@When("user clicks on add to cart button for Computting and Internet book")
	public void user_clicks_on_add_to_cart_button_for_computting_and_internet_book() {
	}

	@Then("Book should be added to cart")
	public void book_should_be_added_to_cart() {
	}

	@When("user clicks on add to cart button for Health book")
	public void user_clicks_on_add_to_cart_button_for_health_book() {
	}




}
