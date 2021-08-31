import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class Exercise1 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "//Users//punchh_akansha//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://aj.punchh.io/whitelabel/myrewards");
		driver.findElement(By.className("signup-link")).click();
		driver.findElement(By.id("user_email")).sendKeys("akanksha+1@punchh.com");
		driver.findElement(By.id("user_first_name")).sendKeys("Akansha");
		driver.findElement(By.id("user_last_name")).sendKeys("Automation User");
		driver.findElement(By.id("user_password")).sendKeys("qwertyui");
		driver.findElement(By.id("user_password_confirmation")).sendKeys("qwertyui");
		driver.findElement(By.name("commit")).click();
		System.out.println(driver.findElement(By.className("error-messages")).getText());
		driver.findElement(By.xpath("//*[@id=\'user_email\']")).clear();
		driver.findElement(By.xpath("//*[@id=\'user_email\']")).sendKeys("akanksha+testuser3@punchh.com");
		driver.findElement(By.id("user_first_name")).sendKeys("Akansha");
		driver.findElement(By.id("user_last_name")).sendKeys("Automation User");
		driver.findElement(By.id("user_password")).sendKeys("qwertyui");
		driver.findElement(By.id("user_password_confirmation")).sendKeys("qwertyui");
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.className("account-link")).click();
		driver.findElement(By.className("setting-link")).click();
		driver.navigate().back();
		driver.findElement(By.className("signout-link")).click();
		System.out.println(driver.findElement(By.className("alert-message")).getText());
		driver.findElement(By.className("login-link")).click();
		driver.findElement(By.id("user_email")).sendKeys("akanksha+testuser1@punchh.com");
		driver.findElement(By.id("user_password")).sendKeys("qwertyui");
		driver.findElement(By.name("commit")).click();
		System.out.println(driver.findElement(By.className("alert-message")).getText());
		driver.findElement(By.className("signout-link")).click();
		System.out.println(driver.findElement(By.className("alert-message")).getText());
		/*File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("//Users//punchh_akansha//screenshot.png"));*/
		driver.close();
		driver.quit();
	}

}
