package selenium_project_package;

import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class past_dateandtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soubh\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//past
		Calendar calendar3_Date_Time=Calendar.getInstance();
		calendar3_Date_Time.add(Calendar.DAY_OF_YEAR, -10);
		Date PastDateTime=calendar3_Date_Time.getTime();
		System.out.println(PastDateTime);
		driver.close();
	}

}
