package SignInModule;

import org.baseOneSelf.BaseClass;
import org.datadriven.DataDriven;
import org.locator.Page_Element;
import org.report.Report;
import org.testng.annotations.BeforeClass;

public class _01_valid_username_valid_password extends BaseClass implements Page_Element{
	@BeforeClass
	public static void start() throws Throwable{
		Report.Report();
		Report.ReportCreateTestcase("To validate Sign In Functionality");
		browserLaunch("https://oneself-admin-test.optisolbusiness.com/login");
		
	try {		
		sendkeys(email,DataDriven.readData(8, 0, "TestData"));
		sendkeys(password,DataDriven.readData(8, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(txtWelcome);
		Report.Pass("8._valid_username_empty_password");
		}
		catch(Exception e){
		Report.Fail("Error message not displayed successfully");
		}	
				
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(7, 0, "TestData"));
		sendkeys(password,DataDriven.readData(7, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(txtWelcome);
		Report.Pass("7._empty_username_invalid_password");
		}
		catch(Exception e){
		Report.Fail("Error message not displayed successfully");
		}		
		
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(6, 0, "TestData"));
		sendkeys(password,DataDriven.readData(6, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(txtWelcome);
		Report.Pass("6._valid_username_empty_password");
		}
		catch(Exception e){
	    Report.Fail("Error message not displayed successfully");
	    }	
		
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(5, 0, "TestData"));
		sendkeys(password,DataDriven.readData(5, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(txtWelcome);
		Report.Pass("5.empty_username_valid_password");
	    }
		catch(Exception e){
	    Report.Fail("Error message not displayed successfully");
		}
	
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(4, 0, "TestData"));
		sendkeys(password,DataDriven.readData(4, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(txtWelcome);
		Report.Pass("4.invalid_username_valid_password");
	    }
	    catch(Exception e){
		Report.Fail("Error message not displayed successfully");
	    }
	    		
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(3, 0, "TestData"));
		sendkeys(password,DataDriven.readData(3, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(txtWelcome);
		Report.Pass("3.valid_username_invalid_password");
	    }
	    catch(Exception e){
		Report.Fail("Error message not displayed successfully");
	    }
		
	try	{
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(2, 0, "TestData"));
		sendkeys(password,DataDriven.readData(2, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(errEmail);
		Report.Pass("2.invalid_username_invalid_password");
	    }
	    catch(Exception e){
		Report.Fail("Error message not displayed successfully");
	    }

	try {	
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);		
		sendkeys(email,DataDriven.readData(1, 0, "TestData"));
		sendkeys(password,DataDriven.readData(1, 1, "TestData"));
		click(signin);
		IsElementDisplayed(welcome);
		Report.Pass("1.It successfully signin into the page");
	    }
	    catch(Exception e) {
		Report.Fail("It not successfully signin into the page");
	    }	
	Report.ReportCooldown();
	}
	
}
	




	
	
	
	




		/*Report.Fail("user failed to create a role");
		click(btnClose);
		}catch(Exception e){
			Report.Pass("Role creation done successfully");
		}*/
	/*public static void signIn() throws Throwable {
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		email.sendKeys(DataDriven.readData(1, 0, "TestData"));

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		password.sendKeys(DataDriven.readData(1, 1, "TestData"));
        
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}
		
		/*public static void main(String[] args) throws Throwable {
			start();
		    signIn();
		    System.out.println("It Successfully sign in with valid username and valid password");
			
	}*/
  
                                           