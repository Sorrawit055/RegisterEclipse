import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class UC1Login {

	@Test
	void TC1001LoginSuccess() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\intel\\Desktop\\geckodriver.exe");
		WebDriver browser = new FirefoxDriver();
		
		browser.get("http://alumni61-47.byethost12.com/Alumni61-47/index.php/alumni/login");
		browser.findElement(By.name("s_email")).click();
		browser.findElement(By.name("s_email")).sendKeys("614259055@webmail.npru.ac.th");
		browser.findElement(By.name("s_password")).click();
		browser.findElement(By.name("s_password")).sendKeys("12345678");
		browser.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(4000);
		browser.switchTo().alert().accept();
		Thread.sleep(6000);
        String result = browser.findElement(By.id("bar")).getText();
		
		//Thread.sleep(4000);

		browser.close();
		assertEquals("ยินดีต้อนรับคุณ614259055@webmail.npru.ac.th",result);

		
		
	}
	@Test
	void TC1002LoginSuccess() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\intel\\Desktop\\geckodriver.exe");
		WebDriver browser = new FirefoxDriver();
		
		browser.get("http://alumni61-47.byethost12.com/Alumni61-47/index.php/alumni/login");
		browser.findElement(By.name("s_email")).click();
		browser.findElement(By.name("s_email")).sendKeys("614259099@webmail.npru.ac.th");
		browser.findElement(By.name("s_password")).click();
		browser.findElement(By.name("s_password")).sendKeys("12345678");
		browser.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(4000);
		browser.switchTo().alert().accept();
		Thread.sleep(6000);
        String result = browser.findElement(By.id("bar")).getText();
		
		//Thread.sleep(4000);

		browser.close();
		assertEquals("ยินดีต้อนรับคุณ614259099@webmail.npru.ac.th",result);

		
		
	}
	@Test
	void TC1003LoginFaill() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\intel\\Desktop\\geckodriver.exe");
		WebDriver browser = new FirefoxDriver();
		
		browser.get("http://alumni61-47.byethost12.com/Alumni61-47/index.php/alumni/login");
		browser.findElement(By.name("s_email")).click();
		browser.findElement(By.name("s_email")).sendKeys("614259055@webmail.npru.ac.th");
		browser.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(4000);
		browser.switchTo().alert().accept();
		Thread.sleep(6000);
        String result = browser.findElement(By.id("title")).getText();
		Thread.sleep(6000);
		browser.close();
		assertEquals("ล็อคอิน",result);

		
		
	}
}
	
	

