import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class UC2Register {
	//@Disabled
	@Test
	void TC2001RegisterSucess() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\intel\\Desktop\\geckodriver.exe");
		WebDriver browser = new FirefoxDriver();
		
		browser.get("http://alumni61-47.byethost12.com/Alumni61-47/index.php/alumni/reg");
		browser.findElement(By.id("input_33")).click();
		browser.findElement(By.id("input_33")).sendKeys("นาย");
	        WebElement uploadElement = browser.findElement(By.id("fileupload"));
	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("D:\\Downloads\\01.jpg");
	        // check the "I accept the terms of service" check box
	        
		browser.findElement(By.id("first_4")).click();
		browser.findElement(By.id("first_4")).sendKeys("สรวิชญ์");
		browser.findElement(By.id("last_4")).click();
		browser.findElement(By.id("last_4")).sendKeys("เอกณรงค์พันธ์");
		browser.findElement(By.id("input_6")).click();
		browser.findElement(By.id("input_6")).sendKeys("เจมส์");
		browser.findElement(By.id("input_32")).click();
		browser.findElement(By.id("input_32")).sendKeys("ชาย");
		browser.findElement(By.id("input_13")).click();
		browser.findElement(By.name("s_bday")).sendKeys("2021-01-21");
		browser.findElement(By.id("input_14")).click();
		browser.findElement(By.id("input_14")).sendKeys("Sorrawit Eaknarongpan");
		browser.findElement(By.id("input_5")).click();
		browser.findElement(By.id("input_5")).sendKeys("614259055@webmail.npru.ac.th");
		browser.findElement(By.id("input_30")).click();
		browser.findElement(By.id("input_30")).sendKeys("12345678");
		browser.findElement(By.id("input_31")).click();
		browser.findElement(By.id("input_31")).sendKeys("12345678");
		browser.findElement(By.id("input_19")).click();
		browser.findElement(By.id("input_19")).sendKeys("48/4");
		browser.findElement(By.id("input_20")).click();
		browser.findElement(By.id("input_20")).sendKeys("นครปฐม");
		browser.findElement(By.id("input_21")).click();
		browser.findElement(By.id("input_21")).sendKeys("เมืองนครปฐม");
		browser.findElement(By.id("input_22")).click();
		browser.findElement(By.id("input_22")).sendKeys("นครปฐม");
		browser.findElement(By.id("input_23")).click();
		browser.findElement(By.id("input_23")).sendKeys("73000");
		browser.findElement(By.name("s_class")).click();
		browser.findElement(By.name("s_class")).sendKeys("61/47");
		browser.findElement(By.name("s_year")).click();
		browser.findElement(By.name("s_year")).sendKeys("2560");
		browser.findElement(By.name("s_generation")).click();
		browser.findElement(By.name("s_generation")).sendKeys("614259055");
		browser.findElement(By.name("s_position")).click();
		browser.findElement(By.name("s_position")).sendKeys("นักศึกษา");
		browser.findElement(By.id("input_27")).click();
		browser.findElement(By.id("input_27")).sendKeys("มหาลัย");
		browser.findElement(By.id("input_28")).click();
		browser.findElement(By.id("input_28")).sendKeys("0863616258");
		browser.findElement(By.id("input_2")).click();
		Thread.sleep(6000);
        String result = browser.findElement(By.id("title")).getText();
		Thread.sleep(6000);

		//Thread.sleep(4000);
		browser.close();
		assertEquals("ล็อคอิน",result);
		
		

		
		//Thread.sleep(4000);
	}
	@Test
	void TC2002RegisterFailImage() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\intel\\Desktop\\geckodriver.exe");
		WebDriver browser = new FirefoxDriver();
		
		browser.get("http://alumni61-47.byethost12.com/Alumni61-47/index.php/alumni/reg");
		browser.findElement(By.id("input_33")).click();
		browser.findElement(By.id("input_33")).sendKeys("นาย");
		browser.findElement(By.id("first_4")).click();
		browser.findElement(By.id("first_4")).sendKeys("สรวิชญ์");
		browser.findElement(By.id("last_4")).click();
		browser.findElement(By.id("last_4")).sendKeys("เอกณรงค์พันธ์");
		browser.findElement(By.id("input_6")).click();
		browser.findElement(By.id("input_6")).sendKeys("เจมส์");
		browser.findElement(By.id("input_32")).click();
		browser.findElement(By.id("input_32")).sendKeys("ชาย");
		browser.findElement(By.id("input_13")).click();
		browser.findElement(By.name("s_bday")).sendKeys("2021-01-21");
		browser.findElement(By.id("input_14")).click();
		browser.findElement(By.id("input_14")).sendKeys("Sorrawit Eaknarongpan");
		browser.findElement(By.id("input_5")).click();
		browser.findElement(By.id("input_5")).sendKeys("614259055@webmail.npru.ac.th");
		browser.findElement(By.id("input_30")).click();
		browser.findElement(By.id("input_30")).sendKeys("12345678");
		browser.findElement(By.id("input_31")).click();
		browser.findElement(By.id("input_31")).sendKeys("12345678");
		browser.findElement(By.id("input_19")).click();
		browser.findElement(By.id("input_19")).sendKeys("48/4");
		browser.findElement(By.id("input_20")).click();
		browser.findElement(By.id("input_20")).sendKeys("นครปฐม");
		browser.findElement(By.id("input_21")).click();
		browser.findElement(By.id("input_21")).sendKeys("เมืองนครปฐม");
		browser.findElement(By.id("input_22")).click();
		browser.findElement(By.id("input_22")).sendKeys("นครปฐม");
		browser.findElement(By.id("input_23")).click();
		browser.findElement(By.id("input_23")).sendKeys("73000");
		browser.findElement(By.name("s_class")).click();
		browser.findElement(By.name("s_class")).sendKeys("61/47");
		browser.findElement(By.name("s_year")).click();
		browser.findElement(By.name("s_year")).sendKeys("2560");
		browser.findElement(By.name("s_generation")).click();
		browser.findElement(By.name("s_generation")).sendKeys("614259055");
		browser.findElement(By.name("s_position")).click();
		browser.findElement(By.name("s_position")).sendKeys("นักศึกษา");
		browser.findElement(By.id("input_27")).click();
		browser.findElement(By.id("input_27")).sendKeys("มหาลัย");
		browser.findElement(By.id("input_28")).click();
		browser.findElement(By.id("input_28")).sendKeys("0863616258");
		browser.findElement(By.id("input_2")).click();
		Thread.sleep(4000);
        String result = browser.findElement(By.id("fail")).getText();
		Thread.sleep(3000);

		//Thread.sleep(4000);

		browser.close();
		assertEquals("กรุณาใส่รูป",result);
		
	   
	      

		
		//Thread.sleep(4000);
	}
	@Test
	void TC3003RegisterFailRequire() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\intel\\Desktop\\geckodriver.exe");
		WebDriver browser = new FirefoxDriver();
		
		browser.get("http://alumni61-47.byethost12.com/Alumni61-47/index.php/alumni/reg");
		browser.findElement(By.id("input_33")).click();
		browser.findElement(By.id("input_33")).sendKeys("นาย");
		browser.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(6000);
        String result = browser.findElement(By.xpath("//*[@class='form-error-message']")).getText();

	
		browser.close();
		assertEquals("This field is required.",result);
		
		

		
		//Thread.sleep(4000);
	}
}
	

	
	

