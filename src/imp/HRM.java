package imp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
driver.manage().window().maximize();
System.out.println("Hello");
System.out.println(driver.getTitle());
driver.findElement(By.id("txtUsername")).sendKeys("vaidehi");

	}

}
