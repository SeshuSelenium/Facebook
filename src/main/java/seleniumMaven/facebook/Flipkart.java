package seleniumMaven.facebook;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
	public static String free;
	public static int withDelevaryFee;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/mens-footwear/sports-shoes/pr?sid=osp,cil,1cu&otracker=nmenu_sub_Men_0_Sports%20Shoes");
		String parentWindow = driver.getWindowHandle();
		Actions a = new Actions(driver);
		WebElement men =driver.findElement(By.xpath("//*[text()='Men']"));
		a.moveToElement(men).build().perform();
		Thread.sleep(10000);
		WebElement shoes = driver.findElement(By.xpath("(//*[text()='Casual Shoes'])[1]"));
		a.moveToElement(shoes).click().build().perform();
		Thread.sleep(10000);
		String actual = driver.findElement(By.xpath("(//*[text()='Casual Shoes'])[5]")).getText();
		if(actual.equalsIgnoreCase("Casual Shoes")) {
			System.out.println("actual and  expected matched");
		}else {
			System.out.println("actual and  expected not match");
		}
		WebElement maxPrice = driver.findElement(By.xpath("//div[@class='_3G9WVX _2N3EuE']/div[@class='_3aQU3C']"));
		WebElement minPrice = driver.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']"));
		
		Thread.sleep(5000);
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,100)");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='_1qKb_B']/select[@class='fPjUPw']/option"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
//		Select s = new Select(driver.findElement(By.xpath("//div[@class='_1qKb_B']/select[@class='fPjUPw']/option")));
//		s.deselectByValue("500");
		driver.findElement(By.xpath("//div[@class='_1qKb_B']/select[@class='fPjUPw']")).click();
		driver.findElement(By.xpath("//div[@class='_1qKb_B']/select[@class='fPjUPw']/option[@value='1000']")).click();
		Thread.sleep(5000);
//		Select s1 = new Select(driver.findElement(By.xpath("//div[@class='_1YoBfV']/select[@class='fPjUPw']/option")));
//		s1.deselectByValue("3000");
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,100)");
		
		driver.findElement(By.xpath("//div[@class='_1YoBfV']/select[@class='fPjUPw']")).click();
		driver.findElement(By.xpath("//div[@class='_1YoBfV']/select[@class='fPjUPw']/option[@value='3000']")).click();
	
		
		js.executeScript("window.scrollBy(0,100)");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='Puma']")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='_2mylT6 _3Ockxk'])[1]")));
		driver.findElement(By.xpath("(//*[@class='_2mylT6 _3Ockxk'])[1]")).click();
		
		Set<String> childWindows = driver.getWindowHandles();
		for(String names : childWindows)
		if(!parentWindow.equals(names)) {
			driver.switchTo().window(names);
		}
		
		Thread.sleep(5000);
		String proDetails = driver.findElement(By.xpath("//div[text()='Product Details']")).getText();
		if(proDetails.equalsIgnoreCase("Product Details")) {
			System.out.println("product details available");
		}else { 
			System.out.println("product details not available");
		}
		
		driver.findElement(By.id("swatch-3-size")).click();
		
		driver.findElement(By.xpath("//*[text()='BUY NOW']")).click();
		
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_39M2dM _2ZvOfP']/input")));
		
		driver.findElement(By.xpath("//div[@class='_39M2dM _2ZvOfP']/input")).sendKeys("9515599998");
		
		driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
		
		driver.findElement(By.xpath("(//div[@class='_39M2dM _2ZvOfP'])[2]/input")).sendKeys("darling143");
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		driver.findElement(By.xpath("//button[text()='Use my current location']")).click();
		
		driver.findElement(By.xpath("//button[text()='Confirm address']")).click();
		
		String Items = driver.findElement(By.xpath("//div[text()='Price (1 item)']")).getText();
		
		String priceOfitems = driver.findElement(By.xpath("(//div[@class='_3GoQc2'])[1]")).getText();
		
		String totalPayable = driver.findElement(By.xpath("//div[text()='Total Payable']")).getText();
		
		String payableAmount = driver.findElement(By.xpath("(//div[@class='_3GoQc2'])[2]")).getText();
		
		String delevery = driver.findElement(By.xpath("//div[text()='Delivery Charges']")).getText();
		
		String delevaryType = driver.findElement(By.xpath("//span[@class='_27kB8M _3Oa-sk']")).getText();
		
		
		
		
		System.out.println(Items +" : " + priceOfitems);
		
		System.out.println(totalPayable +" : " + payableAmount);
		
		System.out.println(delevery +" : " + delevaryType);
		
		
		
		if(delevaryType.equalsIgnoreCase("free")) {
			free = delevaryType;
		}else {
			int Delevaryfee = Integer.parseInt(delevaryType);
			int ItemsPrice = Integer.parseInt(priceOfitems);
			withDelevaryFee = Delevaryfee + ItemsPrice;
		}
		
		System.out.println(withDelevaryFee);
		
		driver.findElement(By.name("name")).sendKeys("Seshu Reddy");
		
		driver.findElement(By.name("phone")).sendKeys("9515599998");
		
		driver.findElement(By.name("addressLine1")).clear();
		
		driver.findElement(By.name("addressLine1")).sendKeys(" #82, Sri venkateshwara nilaya, vinayaka lyout, marathalli ");
		
		driver.findElement(By.name("addressLine2")).sendKeys("marathalli ");
		
		driver.findElement(By.name("landmark")).sendKeys("manjunatha beakary");
		
		driver.findElement(By.name("alternatePhone")).sendKeys("9490072254");
		
		driver.findElement(By.xpath("//span[text()='Home (All day delivery)']")).click();
		
		
		
			
			
			
	if(delevaryType.equalsIgnoreCase(free)) {
		if(priceOfitems.equalsIgnoreCase(payableAmount)) {
			driver.findElement(By.xpath("//button[text()='Save and Deliver Here']")).click();
		}
			
		}
		
	
	
	}

}
