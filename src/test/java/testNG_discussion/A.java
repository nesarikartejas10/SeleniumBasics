package testNG_discussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class A {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String path = System.getProperty("user.dir")+"\\config.properties";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		
		try {
			prop.load(fis);
		} catch ( Exception e) {
			// TODO: handle exception
		}
		
		String username = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		System.out.println(username);
		System.out.println(pwd);
		
	}
}
