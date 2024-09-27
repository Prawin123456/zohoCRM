package baseTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestCase {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.zoho.com/");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("login_id")).sendKeys("prawinkumar.222@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		driver.findElement(By.id("password")).sendKeys("Prawin@1995");
		driver.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Sign in')]")).click();

		driver.findElement(By.xpath("//button[@class='remind_me_later link-btn']")).click();

		
	}

}
