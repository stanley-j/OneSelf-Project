package SignInModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _09_checkbox_remember_me {
	public static WebDriver driver;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stanleyathish.j\\eclipse-workspace\\Stephen\\driver\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://oneself-admin-test.optisolbusiness.com");

	}

	public static void signIn1() throws Throwable {
		WebElement signin = driver.findElement(By.xpath("//label[@for='checkbox']"));
		signin.click();
	}

	public static void main(String[] args) throws Throwable {
    browserLaunch();
    signIn1();
    System.out.println("Successfully enable the checkbox #remember me next time");

  }
}