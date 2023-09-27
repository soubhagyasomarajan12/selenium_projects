package selenium_project_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soubh\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to open email
		driver.get("https://gmail.com");
		//maximized the driver window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		//entering user_name
		email.sendKeys("soubhagyasomarajan2001@gmail.com");
		email.sendKeys(Keys.RETURN);
		//entering password
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		password.sendKeys("password");
		WebElement next=driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div"));
		next.click();
		

	}

}
