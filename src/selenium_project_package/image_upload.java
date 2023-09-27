package selenium_project_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class image_upload {
  
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soubh\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://qavbox.github.io/demo/signup/");
		driver.manage().window().maximize();
		
		WebElement fileInput=driver.findElement(By.xpath("//*[@id=\"container\"]/div[6]/input"));
		fileInput.sendKeys("C:\\Users\\soubh\\Pictures\\Screenshots");
		//for scroll down the page
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		//wait for a few seconds to  ensure the file is uploaded
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
	   e.printStackTrace();
		}
		
//close the browser
		//driver.quit();
	}

}
