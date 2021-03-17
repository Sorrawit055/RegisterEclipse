import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class UC3EditProfile {

	private WebDriver driver;

	@Test
	void TC3001EditProfile() throws InterruptedException {
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
		Thread.sleep(6000);
		browser.findElement(By.name("Search")).click();
		browser.findElement(By.id("bar")).click();
		browser.findElement(By.name("Profile")).click();
		Thread.sleep(3000);
		browser.findElement(By.name("s_fname")).click();
		browser.findElement(By.name("s_lname")).sendKeys("payut");
		browser.findElement(By.name("sub")).click();
		Thread.sleep(4000);
		browser.switchTo().alert().accept();
		Thread.sleep(6000);
        String result = browser.findElement(By.id("find-Search")).getText();
		browser.close();

		assertEquals("ค้นหารายชื่อศิษย์เก่า",result);
		
	}
	@Test
	void TC3002EditProfile() throws InterruptedException {
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
		Thread.sleep(3000);
		browser.findElement(By.name("s_fname")).click();
		browser.findElement(By.name("s_lname")).sendKeys("Hello");
		browser.findElement(By.name("sub")).click();
		Thread.sleep(4000);
		browser.switchTo().alert().accept();
		Thread.sleep(6000);
        String result = browser.findElement(By.id("find-Search")).getText();
		browser.close();

		assertEquals("ค้นหารายชื่อศิษย์เก่า",result);
		
	}
	@Test
	void TC3003EditProfile() throws InterruptedException {
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
		Thread.sleep(3000);
		browser.findElement(By.name("s_fname")).click();
		browser.findElement(By.name("s_lname")).sendKeys("Hello");
		browser.findElement(By.name("sub")).click();
		Thread.sleep(4000);
		browser.switchTo().alert().accept();
		Thread.sleep(6000);
        String result = browser.findElement(By.id("find-Search")).getText();
		browser.close();

		assertEquals("ค้นหารายชื่อศิษย์เก่า",result);
		
	}
}
	
	

