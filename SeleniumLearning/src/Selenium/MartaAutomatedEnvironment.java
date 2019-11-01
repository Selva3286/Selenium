package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MartaAutomatedEnvironment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Selva\\2. PURE\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://du-mob-apigway.mobility.local:8443/login");
		
		
		WebElement	Login = driver.findElement(By.linkText("Log in"));
		Login.click();
		Thread.sleep(3000);
	
		WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div[2]/form/fieldset/div[1]/input"));
		username.sendKeys("test1@kapsch.net");
		
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Kapsch123");
		//Thread.sleep(2000);
		
		WebElement authenticate = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div[2]/form/fieldset/div[4]/button"));
		authenticate.click();
		Thread.sleep(3000);
		
		WebElement FareManagement = driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[2]/section/nav/section[1]/header/span[2]"));
		FareManagement.click();
		Thread.sleep(5000);
		
		//WebElement version = driver.findElement(By.className("automation-view"));
		
		WebElement eye = driver.findElement(By.xpath("//td[normalize-space()=20170207]//following::td[4]/button[1]"));
		Thread.sleep(8000);
		eye.click();
	
		
		
		
		
		
	}

}
