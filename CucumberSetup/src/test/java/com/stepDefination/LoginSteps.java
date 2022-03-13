package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Step1: User is on login page");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	
	  @When("user enters username and passoward") public void
	  user_enters_username_and_passoward() {
	  System.out.println("Step2: User enters username and password");
	  driver.findElement(By.id("txtUsername")).sendKeys("admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  
	  }
	 
	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Step3: user is clicking on login button");
		driver.findElement(By.name("Submit")).click();

	}

	@Then("user should land on homepage")
	public void user_should_land_on_homepage() {
		System.out.println("User lands on home page");
		driver.close();

	}

}
