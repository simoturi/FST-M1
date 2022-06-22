package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;


public class ProjectActivity2 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();

		// Open browser
		driver.get("https://alchemy.hguy.co/jobs");
	}

	@Test
	public void webHeader() {

		// Read login message
		// String header = driver.findElement(By.id(class="entry-title")).getText();
		String header = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
		System.out.print(header);
		Assert.assertEquals(header, "Welcome to Alchemy Jobs");
		// Assert.
	}

	@AfterClass
	public void afterClass() {
		// Close browser
		driver.close();

	}
}
