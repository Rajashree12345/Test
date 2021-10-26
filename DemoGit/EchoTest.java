package Demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import com.beust.jcommander.Parameters;

public class EchoTest {

	WebDriver driver;
	//@Parameters({"username","password"})
	@Test
	public void login(String username,String password) {
		driver.findElement(By.id("")).sendKeys(username);
		driver.findElement(By.id("")).sendKeys(password);
		driver.findElement(By.id("")).click();
		String acterror = driver.findElement(By.id("")).getText();
		assertEquals(acterror,"Invalid Username/Password");
	}

	
}
