import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {

		//System.setProperty("webdriver.gecko.driver", "//Users//punchh_akansha//Downloads//geckodriver");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "//Users//punchh_akansha//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://aj.punchh.io/whitelabel/nativegrill");
		driver.navigate().back();
		driver.close();
		driver.quit();
		
	}

}
