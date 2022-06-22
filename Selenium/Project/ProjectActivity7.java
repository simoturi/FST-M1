package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity7 {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();

		// Open browser
		driver.get("https://alchemy.hguy.co/jobs");
	}

	@Test
	public void postJob() throws InterruptedException // throws InterruptedException
	{
       // click on Post
		driver.findElement(By.xpath("//a[contains(@href,'post')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//click on sign in
		driver.findElement(By.xpath("//a[@class='button']")).click();
		// Enter login credentials
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement pwd = driver.findElement(By.id("user_pass"));
		username.sendKeys("root");
		pwd.sendKeys("pa$$w0rd");
		// lOGIN
		driver.findElement(By.id("wp-submit")).click();
		System.out.print("Login Success \n");
		// Company details & job title
		WebElement jobTitle = driver.findElement(By.id("job_title"));
		/// Description
		driver.switchTo().frame(0);
		WebElement el = driver.switchTo().activeElement();
		new Actions(driver).moveToElement(el).perform();
		driver.findElement(By.xpath("/html/body")).sendKeys("Banking jobs");
		driver.switchTo().parentFrame();
        // Company name and tag line 
		WebElement companyname = driver.findElement(By.id("company_name"));
		WebElement companytag = driver.findElement(By.id("company_tagline"));
		jobTitle.sendKeys("Banking");
		// description;
		companyname.clear();
		companytag.clear();
		companyname.sendKeys("IBM India");
		companytag.sendKeys("IBM ");
		// Preview click
		driver.findElement(By.xpath("//input[@class='button']")).click();
		// Submit Post
		driver.findElement(By.id("job_preview_submit_button")).click();
		// click on the click here 
		driver.findElement(By.xpath("//a[contains(@href,'https://alchemy.hguy.co/jobs/job/')]")).click();
		// Get the post name which we entered
		String postName = driver.findElement(By.className("job_description")).getText();
		System.out.print(postName);
		Assert.assertEquals(postName, "Banking jobs");

	}

	@AfterClass
	public void afterClass() {
		// Close browser
		driver.close();

	}
}
