package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;


public class ProjectActivity4 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();

		// Open browser
		driver.get("https://alchemy.hguy.co/jobs");
	}

	@Test
	public void web2ndHeader() {

		// Read login message
		// String header = driver.findElement(By.id(class="entry-title")).getText();
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.print(header);
		Assert.assertEquals(header, "Quia quis non");
		// Assert.
	}

	@AfterClass
	public void afterClass() {
		// Close browser
		driver.close();

	}
}
