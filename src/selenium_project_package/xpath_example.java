package selenium_project_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soubh\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//ABSOLUTE XPATH
		
		//search
	/*	WebElement searchbox=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		searchbox.sendKeys("watches for women");
		//click button
		WebElement searchbutton=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
		searchbutton.click();
		//clear text
		WebElement cleartext = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		cleartext.clear();
		//search men
		WebElement searchbox1=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		searchbox1.sendKeys("watches for men");
		//click button
		WebElement searchbutton1=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
		searchbutton1.click();	*/
		
		//RELATIVE XPATH
		//WebElement searchbox=driver.findElement(By.xpath("//pre[@id='twotabsearchtextbox']"));
		//searchbox.sendKeys("watches for women");
		//click button
		//WebElement searchbutton=driver.findElement(By.xpath("//input[@value='Go']"));
		//searchbutton.click();
		//clear text
		//WebElement cleartext = driver.findElement(By.xpath("//pre[@value='watches for men']"));
		//cleartext.clear();
		//search html  men/
		//WebElement searchbox1=driver.findElement(By.xpath("//pre[@name='field_ketwords']"));
		//searchbox1.sendKeys("watches for men");
		//click button
		//WebElement searchbutton1=driver.findElement(By.xpath("//pre[@type='submit']"));
		//searchbutton1.click();
		
		
		//xpath_options
		//OR
		
		
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
//		WebElement searchbox=driver.findElement(By.xpath("//input[@type='text' or @value='watches for women']"));
//		searchbox.sendKeys("watches for women");
//		WebElement searchbutton=driver.findElement(By.xpath("//input[@value='Go' or @type='submit']"));
//		searchbutton.click();
		
		//AND options
		
//		WebElement searchbox1=driver.findElement(By.xpath("//input[@type='text' AND @value='watches for women']"));
//		searchbox1.sendKeys("watches for women");
//		WebElement searchbutton1=driver.findElement(By.xpath("//input[@value='Go' AND @type='submit']"));
//		searchbutton1.click();
		
		//CONTAINS
//		WebElement searchbox2=driver.findElement(By.xpath("//input[contains(@id,'twotab')]"));
		//searchbox2.sendKeys("watches for women");
		
	//STARTS_WITH
	
//	WebElement searchbox2=driver.findElement(By.xpath("//input[starts-with(@dir,'auto')]"));
//	searchbox2.sendKeys("watches for women");
//	
//	WebElement searchbutton=driver.findElement(By.xpath("//input[starts-with(@type,'submit')]"));
//    searchbutton.click();	
    
    //TEXT
    WebElement searchbox2=driver.findElement(By.xpath("//input[text()='watch']"));
	searchbox2.sendKeys("watches for women");
		
	//CHAINE
	
	WebElement searchbox=driver.findElement(By.xpath("//input[@type='text' // @value='watches for women']"));
	searchbox.sendKeys("watches for women");
	WebElement searchbutton=driver.findElement(By.xpath("//input[@value='Go'// @type='submit']"));
	searchbutton.click();
	
	}

}
