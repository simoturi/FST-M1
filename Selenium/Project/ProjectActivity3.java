package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import org.testng.Assert;


public class ProjectActivity3 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();

		// Open browser
		driver.get("https://alchemy.hguy.co/jobs");
	}

	@Test
	public void getImageURL() {

		
		String imageURL = driver.findElement(By.xpath("//img[contains(@class,'post-image')]")).getAttribute("src");
		System.out.print(imageURL);
		
	}

	@AfterClass
	public void afterClass() {
		// Close browser
		driver.close();

	}
}
