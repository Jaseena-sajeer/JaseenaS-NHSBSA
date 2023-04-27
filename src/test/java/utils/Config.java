package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Config {
	 static WebDriver driver = null;
	    static String browserName = null;
	
	   public static String getBrowserName() {
	        browserName = EnvConfig.getBrowser();

	        if (browserName == null)
	            browserName = "chrome";
	        return browserName;
	    }
	

	 public static WebDriver CreateWebDriver(String browser) {
		 
		 switch(browser)
		 {
		 case "chrome":
			  WebDriverManager.chromedriver().setup();
              driver = new ChromeDriver();
              driver.manage().window().maximize();
              break;
              
		 case "firefox":
			 WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
             break;
		 default:
             System.out.println("Invalid browser name " + browser);
             System.exit(0);
             break;
             
		 }
		 Runtime.getRuntime().addShutdownHook(new Thread() {
             public void run() {
                driver.quit();
             }
         });
      return driver;
  }
	       

}

