package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;


public class ProjectActivity5 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();

		// Open browser
		driver.get("https://alchemy.hguy.co/jobs");
	}

	@Test
	public void jobLabelClick() {

		// Read login message
		// String header = driver.findElement(By.id(class="entry-title")).getText();
		//String jobslabel = driver.findElement(By.xpath("//a[contains(@href,'jobs/jobs')]")).getText();
		//System.out.print(jobslabel);
		driver.findElement(By.xpath("//a[contains(@href,'jobs/jobs')]")).click();
		String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Jobs – Alchemy Jobs");
		// Assert.
	}

	@AfterClass
	public void afterClass() {
		// Close browser
		driver.close();

	}
}
