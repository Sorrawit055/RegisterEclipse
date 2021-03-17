import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class UC4Search{
	@Disabled
	//@Test
	void TC4001SeachById() throws InterruptedException {
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
		browser.findElement(By.name("searchalumni")).click();
		browser.findElement(By.name("searchalumni")).sendKeys("614259099");
		browser.findElement(By.name("searchalumni")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
        String result = browser.findElement(By.id("gen")).getText();
		browser.close();
		assertEquals("614259099",result);

		
	}
	//@Test
	@Disabled
	void TC4002SearchByGroupClass() throws InterruptedException {
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
		browser.findElement(By.name("searchalumni")).click();
		browser.findElement(By.name("searchalumni")).sendKeys("61/100");
		browser.findElement(By.name("searchalumni")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
        String result = browser.findElement(By.id("class")).getText();
		browser.close();
		assertEquals("61/100",result);

		
	}
	//@Test
	@Disabled
	void TC4003SearchByName() throws InterruptedException {
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
		browser.findElement(By.name("searchalumni")).click();
		browser.findElement(By.name("searchalumni")).sendKeys("สหัสวุฒิ");
		browser.findElement(By.name("searchalumni")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
	    String result = browser.findElement(By.id("namelast")).getText();
		browser.close();
		assertEquals("สหัสวุฒิ มูลสิงห์",result);

		
	}
	//@Test
	@Disabled
	void TC4004SearchByYear() throws InterruptedException {
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
		browser.findElement(By.name("searchalumni")).click();
		browser.findElement(By.name("searchalumni")).sendKeys("2544");
		browser.findElement(By.name("searchalumni")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
	    String result = browser.findElement(By.id("year")).getText();
		

				browser.close();
				assertEquals("2544",result);

		
	}
	//@Test
	@Disabled
	void TC4005SearchByCountry() throws InterruptedException {
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
		Thread.sleep(6000);			browser.findElement(By.name("Search")).click();
		browser.findElement(By.name("searchalumni")).click();
		browser.findElement(By.name("searchalumni")).sendKeys("เชียงใหม่");
		browser.findElement(By.name("searchalumni")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
	    String result = browser.findElement(By.id("address")).getText();

					browser.close();
					assertEquals("เชียงใหม่",result);
		
	}
	
	@Test
	void TC4006SearchFail() throws InterruptedException {
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
		Thread.sleep(6000);			browser.findElement(By.name("Search")).click();
		browser.findElement(By.name("searchalumni")).click();
		browser.findElement(By.name("searchalumni")).sendKeys("เชียงกง");
		browser.findElement(By.name("searchalumni")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
        String result = browser.findElement(By.id("h2")).getText();
		browser.close();
		assertEquals("ไม่มีรายชื่อศิษย์เก่านี้",result);
		
	}
}
	
	

	



