import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users//punchh_akansha//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com");
		driver.findElement(By.xpath(""));
		

	}

}
