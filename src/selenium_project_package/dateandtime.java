package selenium_project_package;


import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dateandtime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soubh\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//future 
Calendar calendar2_Date_Time=Calendar.getInstance();
calendar2_Date_Time.add(Calendar.DAY_OF_YEAR, 10);
Date futureDateTime=calendar2_Date_Time.getTime();
System.out.println(futureDateTime);
driver.close();
	}

}
