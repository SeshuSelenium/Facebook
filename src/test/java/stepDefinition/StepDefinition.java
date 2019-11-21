package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver driver;
	@Given("^I launch \"([^\"]*)\" browser$")
	public void i_launch_browser(String browser) throws Throwable {
		if(browser.equalsIgnoreCase("chrome")) {
	    	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
	    }else if(browser.equalsIgnoreCase("Firefox")) {
	    	System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			driver = new FirefoxDriver();
	    }else if(browser.equalsIgnoreCase("IE")) {
	    	System.setProperty("webdriver.ie.driver", "E:\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
	    }else {
	    	System.setProperty("webdriver.edge.driver", "E:\\Drivers\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
	    }
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfcsDG64SLoqdO_qwBAwiUgPkjSXofnRfdZ4sCQx7bU5JyzJgDTd-knaDgLMm0-k6rGfBGjbeHAX5CXnwgbzIgEfSo6qgO76hlxamLzD9fkrKA&smuh=26896&lh=Ac_jQ6-XVMf193rt");
	}

	@When("^I enter facebook username (.*) and password (.*) click n login$")
	public void i_enter_facebook_username_and_password_click_n_login(String arg1, String arg2) throws Throwable {

	    driver.findElement(By.id("email")).sendKeys(arg1);
	    driver.findElement(By.name("pass")).sendKeys(arg2);
	    driver.findElement(By.id("loginbutton")).click();
	}

	@Then("^validate home page$")
	public void validate_home_page() throws Throwable {
	   
	}

	@Then("^I logout facebook account$")
	public void i_logout_facebook_account() throws Throwable {
	   
	}
}
