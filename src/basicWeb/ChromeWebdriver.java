package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeWebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//http://chromedriver.storage.googleapis.com/index.html
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "/home/dev2/eclipse-workspace/SeleniumProject/libs/geckodriver");
		
		driver=new FirefoxDriver();
		
		String baseUrl ="http://192.168.3.5";
		

		
		driver.get(baseUrl);
		driver.findElement(By.id("email")).sendKeys("daniel.melfah@viamo.io");
		driver.findElement(By.id("password")).sendKeys("0v3r10rD");
		driver.findElement(By.xpath("/html//div[@class='login-page']//form[@action='https://192.168.3.5']/input[@value='Submit']")).click();
		
		//Smoke Tests - 1 Create new subscriber
		driver.findElement(By.xpath("//div[@id='viamo-app']//div[@class='bs-docs-sidebar']/ul/li[2]//span[1]")).click();
								////div[@id='viamo-app']/div[@class='sidebar-container']/div[1]//div[@class='aside-body']/div[2]/ul/li[@class='slider-menu-item']/div/div/ul/li[1]//ul/li[1]//a[@href='https://darkmatter.votomobile.org/subscribers']
		driver.findElement(By.xpath("//div[@id='viamo-app']/div[@class='sidebar-container']/div[1]//div[@class='aside-body']/div[2]/ul/li[@class='slider-menu-item']/div/div/ul/li[1]//ul/li[1]//a[@href='https://192.168.3.5/subscribers']")).click();
		driver.findElement(By.xpath("/html//div[@id='viamo-app']//a[@href='https://192.168.3.5/subscriber/new']")).click();

		driver.findElement(By.id("phone")).sendKeys("0554586956");
		driver.findElement(By.xpath("/html//div[@id='viamo-app']/div[@class='container-full']//form[@action='https://192.168.3.5/subscriber/new']//input[@name='fields[62]']")).sendKeys("Automatically generated subscriberxx");
		driver.findElement(By.xpath("/html//div[@id='viamo-app']//form[@action='https://192.168.3.5/subscriber/new']//button[@type='submit']")).click();
		
		
		
		//Smoke Test - 2 Send Call to record
		
		driver.findElement(By.xpath("//div[@id='viamo-app']//div[@class='bs-docs-sidebar']/ul/li[3]/a/div")).click();
		driver.findElement(By.xpath("//div[@id='viamo-app']/div[@class='sidebar-container']/div[1]//div[@class='aside-body']/div[2]/ul/li[@class='slider-menu-item']/div/div/ul/li[1]//ul/li[2]//a[@href='https://192.168.3.5/messages']")).click();
		
		//driver.findElement(By.xpath("//div[@id='viamo-app']/div[@class='sidebar-container']/div[1]//div[@class='aside-body']/div[2]/ul/li[@class='slider-menu-item']/div/div/ul/li[1]//ul/li[2]//a[@href='https://192.168.3.5/messages']")).click();
		driver.findElement(By.xpath("/html//div[@id='viamo-app']/div[@class='container-full']//a[@href='https://192.168.3.5/messages/new']")).click();
		driver.findElement(By.xpath("/html//div[@id='show_voice_box']/div[1]//div[@class='col-xs-6']/div[1]/a[@href='#']")).click();
		driver.findElement(By.xpath("/html//div[@id='show_voice_box']/div[1]//div[@class='col-xs-6']/div[1]/ul[@class='dropdown-menu']/li[2]/a[@href='#']")).click();
		driver.findElement(By.xpath("/html//input[@id='calltorecord_caller_select_0']")).click();
		driver.findElement(By.id("calltorecord-modal-btn-call")).click();
		

		/*Sending out various calls
		Fixed call**/
		
	}

}
