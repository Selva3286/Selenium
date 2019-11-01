package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Marta {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selva\\2. PURE\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test-web.marta.mobiguider.net/");

		WebElement Login = driver.findElement(By.linkText("Log in"));
		Login.click();
		Thread.sleep(3000);		

		WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div[2]/form/fieldset/div[1]/input"));
		username.sendKeys("uat.test1@cst.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("aF3DO59F");
		//Thread.sleep(5000);

		WebElement authenticate = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div[2]/form/fieldset/div[4]/button"));
		authenticate.click();
		Thread.sleep(3000);

		WebElement FareManagement = driver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div[2]/section/nav/section[1]/header/span[2]"));
		FareManagement.click();
		Thread.sleep(5000);

		//WebElement importversions = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/article/ul/li/button"));
		//importversions.click();
		//WebElement chooseversion = driver.findElement(By.name("file"));
		//chooseversion.sendKeys("C:\\Selva\\2. PURE\\Export of version 683998786.json");
		//WebElement upload = driver.findElement(By.xpath("//*[@id=\'root\']/div/div[1]/article/section/div/article/footer/div/div/button[1]"));
		//upload.click();

		WebElement eye = driver.findElement(By.xpath("//td[normalize-space()=201907535]//following::td[4]/button[@class='automation-view']"));
		Thread.sleep(10000);
		eye.click();






	}

}
