package selenium_project_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dummy_path {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\soubh\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/signup/");
		driver.manage().window().maximize();
		
		//full_name
		//WebElement fullname=driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[2]/input"));
		//fullname.sendKeys("Soubhagya Somarajan");
		
		//email
		//WebElement email=driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[3]/input"));
		//email.sendKeys("soubhagya@gmail.com");
		
		//phone number
		//WebElement phone_number=driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[4]/input"));
		//phone_number.sendKeys("9998887770");
		
		//XPATH CONTAINS EXAMPLE
		
		//full name
		WebElement fullname=driver.findElement(By.xpath("//input[contains(@id,'user')]"));
		fullname.sendKeys("Soubhagya Somarajan");
				
		//email
		WebElement email=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		email.sendKeys("soubhagya@gmail.com");
		
		//phone number
		WebElement phone_number=driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		phone_number.sendKeys("9998887770");
		
		
		//fax_no
		//WebElement fax_no=driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[5]/input"));
	   // fax_no.sendKeys("123");	
	    
//	    //image_upload
//	    WebElement fileInput=driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[6]/input"));
//	    fileInput.sendKeys("C:\\Users\\soubh\\Pictures\\Screenshots");
//	    
//	    //gender
//	    Select drop = new Select(driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[7]/select")));
//	    drop.selectByValue("female");
//	    //experience
//	    WebElement fileInput1=driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[6]/input"));
//	    fileInput1.sendKeys("3");
//		
//	    //automation_tools
//	   Select drop2=new Select(driver.findElement(By.xpath("/html/body/form/fieldset/div/div/label")));
//	    drop2.selectByIndex(3);
//	    
//	    //submit
//	    WebElement submitbutton=driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[10]/input"));
//	    submitbutton.click();
//	    
	    //WebElement skills=driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[9]/label"));
	    //skills.s
	    
		//RELATIVE PATH
	    
		//WebElement full_name=driver.findElement(By.xpath("//input[@id='username']"));
	    //full_name.sendKeys("Soubhagya Soubhagya");
	     
	    //WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	   // email.sendKeys("soubhagya@gmail.com");
	    
	    //WebElement fileInput=driver.findElement(By.xpath("//input[@name='datafile']"));
	    //fileInput.sendKeys("C:\\Users\\soubh\\Pictures\\Screenshots");
		
		


	    
	}

}
