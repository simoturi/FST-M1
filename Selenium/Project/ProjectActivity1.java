package Project;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.*;

public class ProjectActivity1 {

		    WebDriver driver;
	    
	    @BeforeTest
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	            
	        //Open the browser
	        driver.get("https://alchemy.hguy.co/jobs");
	    }
	    
	    @Test
	    public void testCase1() {
	        //This test case will pass
	        String title = driver.getTitle();
	        System.out.println("Title is: " + title);
	        Assert.assertEquals(title, "Alchemy Jobs � Job Board Application");
	    }
	    
	   

	    @AfterTest
	    public void afterMethod() {
	        //Close the browser
	        driver.close();
	    }

	}
