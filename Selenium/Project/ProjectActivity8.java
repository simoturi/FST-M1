package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import org.testng.Assert;

public class ProjectActivity8 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();

		// Open browser
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	}

	@Test
	public void jobLabelClick() throws InterruptedException {

		WebElement username = driver.findElement(By.id("user_login"));
		WebElement pwd = driver.findElement(By.id("user_pass"));
		username.sendKeys("root");
		pwd.sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String user=driver.findElement(By.xpath("//span[@class='display-name']")).getText();
		Assert.assertEquals(user, "root");
		System.out.print(user);

		}

	@AfterClass
	public void afterClass() {
		// Close browser
		driver.close();

	}
}
