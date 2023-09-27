package selenium_projects;



import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actual_title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soubh\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		//maximize window
		driver.manage().window().maximize();
		//to get title
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.close();
		//Current date and time
		Calendar calendar_Date_Time=Calendar.getInstance();
		Date currentDateTime=calendar_Date_Time.getTime();
		System.out.println(currentDateTime);
		driver.close();
		//future Date and time
		Calendar calendar1_Date_Time=Calendar.getInstance();
		calendar1_Date_Time.add(Calendar.DAY_OF_YEAR,20);
		Date futureDateTime=calendar1_Date_Time.getTime();
		System.out.println(futureDateTime);
		driver.close();
		//past date and time
		
		
		
		
		
		
				

	}

}
