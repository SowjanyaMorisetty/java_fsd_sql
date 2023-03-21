package batch3.Selenium_Testing;

/**
 * Hello world!
 *
 */

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class App{
	   public static void main(String[] args) {
		   
		   WebDriver driver = new ChromeDriver();
		   
		         // browser type and chromedrover.exe path as parameters
		         System.setProperty("webdriver.chrome.driver",
		         "C:\\Users\\Administrator\\Downloads");
		         String url = " https://www.tutorialspoint.com/questions/index.php";
		         driver.get(url);
		      }
		   }
	  
	     
	   
		
	

