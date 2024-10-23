package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties properties= new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		properties.load(file);
		String url = properties.getProperty("appurl");
		String email = properties.getProperty("email");
		String password = properties.getProperty("password");
		String orderid = properties.getProperty("orderid");
		String customerid= properties.getProperty("customerid");
		
		System.out.println(url +" "+ email +" "+ password + " "+orderid + " "+customerid);
		
		//reading all the keys from properties file
//		Set<String> keys = properties.stringPropertyNames();
		
		Set<Object> keys = properties.keySet();
		System.out.println(keys);
		
		
		//reading all the values
		Collection<Object> values=properties.values();	
		System.out.println(values);
		file.close();
	
	}
}
