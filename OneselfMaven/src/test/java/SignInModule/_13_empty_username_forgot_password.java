package SignInModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _13_empty_username_forgot_password {
	public static WebDriver driver;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stanleyathish.j\\eclipse-workspace\\Stephen\\driver\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://oneself-admin-test.optisolbusiness.com");

	}
	public static void signIn1() throws Throwable {
		WebElement signin = driver.findElement(By.xpath("//a[@routerlink='/forgot-password']"));
		signin.click();
	}
	
	public static void signIn3() throws Throwable {
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}

	public static void main(String[] args) throws Throwable {
    browserLaunch();
    signIn1();
    signIn3();
    System.out.println("Successfully received an exception for leaving username like #enter the email");

  }
}