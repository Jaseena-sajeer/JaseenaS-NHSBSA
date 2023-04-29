package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EnvConfig {
	
	public static String getBrowser() {
		 Properties prop = new Properties();
	        FileInputStream input = null;
	        String browser = null;

	        try {
	            input = new FileInputStream("runconfig.properties");
	            prop.load(input);
	            browser = prop.getProperty("browser");
	            System.out.println("Browser value is: " + browser);
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        } finally {
	            if (input != null) {
	                try {
	                    input.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
			return browser;
	}

	public static String getUrl() {
		 Properties prop = new Properties();
	        FileInputStream input = null;
	        String url = null;

	        try {
	            input = new FileInputStream("runconfig.properties");
	            prop.load(input);
	            url = prop.getProperty("url");
	            System.out.println("url value is: " + url);
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        } finally {
	            if (input != null) {
	                try {
	                    input.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
			return url;
	}
}
