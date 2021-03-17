import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class UC5Profile {

	@Test
	void TC5001Profile1() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\intel\\Desktop\\geckodriver.exe");
		WebDriver browser = new FirefoxDriver();
		
		browser.get("http://alumni61-47.byethost12.com/Alumni61-47/index.php/alumni/login");
		browser.findElement(By.name("s_email")).click();
		browser.findElement(By.name("s_email")).sendKeys("614259055@webmail.npru.ac.th");
		browser.findElement(By.name("s_password")).click();
		browser.findElement(By.name("s_password")).sendKeys("12345678");
		browser.findElement(By.name("but")).click();
		Thread.sleep(4000);
		browser.switchTo().alert().accept();
		Thread.sleep(6000);		browser.findElement(By.name("Search")).click();
		browser.findElement(By.id("bar")).click();
		browser.findElement(By.name("Profile")).click();
        String result = browser.findElement(By.id("Edit")).getText();
		
		Thread.sleep(4000);

		browser.close();
		assertEquals("แก้ไขข้อมูล",result);

		
	}
	@Test
	void TC5001Profile2() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\intel\\Desktop\\geckodriver.exe");
		WebDriver browser = new FirefoxDriver();
		
		browser.get("http://alumni61-47.byethost12.com/Alumni61-47/index.php/alumni/login");
		browser.findElement(By.name("s_email")).click();
		browser.findElement(By.name("s_email")).sendKeys("614259099@webmail.npru.ac.th");
		browser.findElement(By.name("s_password")).click();
		browser.findElement(By.name("s_password")).sendKeys("12345678");
		browser.findElement(By.name("but")).click();
		Thread.sleep(4000);
		browser.switchTo().alert().accept();
		Thread.sleep(6000);		browser.findElement(By.name("Search")).click();
		browser.findElement(By.id("bar")).click();
		browser.findElement(By.name("Profile")).click();
        String result = browser.findElement(By.id("Edit")).getText();
		
		Thread.sleep(4000);

		browser.close();
		assertEquals("แก้ไขข้อมูล",result);

		
	}
	@Test
	void TC5001Profile3() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\intel\\Desktop\\geckodriver.exe");
		WebDriver browser = new FirefoxDriver();
		
		browser.get("http://alumni61-47.byethost12.com/Alumni61-47/index.php/alumni/login");
		browser.findElement(By.name("s_email")).click();
		browser.findElement(By.name("s_email")).sendKeys("614259020@webmail.npru.ac.th");
		browser.findElement(By.name("s_password")).click();
		browser.findElement(By.name("s_password")).sendKeys("12345678");
		browser.findElement(By.name("but")).click();
		Thread.sleep(4000);
		browser.switchTo().alert().accept();
		Thread.sleep(6000);		browser.findElement(By.name("Search")).click();
		browser.findElement(By.id("bar")).click();
		browser.findElement(By.name("Profile")).click();
        String result = browser.findElement(By.id("Edit")).getText();
		
		Thread.sleep(4000);

		browser.close();
		assertEquals("แก้ไขข้อมูล",result);

		
	}
}
	
	

