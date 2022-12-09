package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wappalyzer {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urloading()
	{
		driver.get("https://www.wappalyzer.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"list-item-50\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div[3]/div/div/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/form/div[1]/div[1]/div[1]/div/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"input-1560\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"input-1560\"]")).sendKeys("java",Keys.ENTER);
	}

}
