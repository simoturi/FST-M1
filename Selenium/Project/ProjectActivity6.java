package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import org.testng.Assert;

public class ProjectActivity6 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();

		// Open browser
		driver.get("https://alchemy.hguy.co/jobs");
	}

	@Test
	public void jobLabelClick() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(@href,'jobs/jobs')]")).click();
		WebElement jobs1 = driver.findElement(By.id("search_keywords"));
		jobs1.sendKeys("dev");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//h3[text()='Application Developer']")).click();

		// driver.findElement(By.tagName("h3")).click();
		// System.out.print(jobname);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		String email = driver.findElement(By.xpath("//a[contains(@href,'ibm')]")).getText();
		System.out.print(email);
	}

	@AfterClass
	public void afterClass() {
		// Close browser
		driver.close();

	}
}
