package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


//import org.testng.Assert;

public class ProjectActivity9 {
	WebDriver driver;
	WebDriverWait wait ;
	String jobName;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 5);
		jobName="Developer Jobs";
		// Open browser
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	}

	@Test
	public void jobLabelClick() throws InterruptedException {
		// login 
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement pwd = driver.findElement(By.id("user_pass"));
		username.clear();
		pwd.clear();
		username.sendKeys("root");
		pwd.sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Job Listing
				driver.findElement(By.id("menu-posts-job_listing")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
				
		// Add new click
				driver.findElement(By.className("page-title-action")).click();
				
				try {
				    				     driver.findElement(By.xpath("//button[@aria-label='Close dialog']")).click();
				     				    
				} catch (Exception e) {
				    //handle the exception
					System.out.print("No Dialog Box found");
									}
				
				driver.findElement(By.xpath("//textarea[@placeholder='Position']")).sendKeys(jobName,Keys.ENTER);
				//Thread.sleep(10000);
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//button[contains(@class,'post-publish-panel')]")).click();
				//Thread.sleep(10000);
				driver.findElement(By.xpath("//div[contains(@class,'publish-button')]")).click();
				
				 String publish=driver.findElement(By.xpath("//div[contains(@class, 'editor-post-publish-panel__header-published')]")).getText();
				 System.out.print(publish);
				 Assert.assertEquals(publish, "Published");
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 driver.findElement(By.xpath("//a[contains(@class,'components-button is-secondary')]")).click();
				 String postName=driver.findElement(By.xpath("//h1[contains(@class, 'entry-title')]")).getText();
				 System.out.print(postName);
				 Assert.assertEquals(postName, jobName);
				 //Thread.sleep(10000);
				

		}

	@AfterClass
	public void afterClass() {
		// Close browser
		driver.close();

	}
}
