package scripts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class JpetstoreTest {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		
		FirefoxOptions options = new FirefoxOptions().setProfile(new FirefoxProfile());
		options.addPreference("browser.tabs.remote.autostart", false);
		
		
		System.setProperty("webdriver.gecko.driver","C:/Users/Formation/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver(options);
		
		
		driver.get("http://localhost:8089/jpetstore");	
		
		
	}

	@Test
	public void test() {

		//WebElement monBouton = driver.findElement(By.id("button"));
	//	monBouton.click();
		WebElement monElementAVerifier = driver.findElement(By.xpath("//div[1]/h2"));
		String texteAVerifier = monElementAVerifier.getText();
		System.out.println(texteAVerifier);
		Assert.assertEquals("Welcome to JPetStore 6", texteAVerifier);
	}
}
