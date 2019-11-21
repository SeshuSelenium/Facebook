package com.wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitsss {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://www.hireitpeople.com/resume-database/82-quality-assurance-resumes/47807-sr-qa-automation-engineer-resume-profile-charlotte-nc");
		
		
	}

}
