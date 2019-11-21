package properties;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("./resources/config.properties");
			// create a Properties class object
			Properties prop = new Properties();
			// load the file into Properties class object from which we want to read the
			// properties
			prop.load(fis);
			// read the properties by using property kye
			String url = prop.getProperty("url");
			String username = prop.getProperty("username", "sunshine");
			String password = prop.getProperty("password");
			String email = prop.getProperty("email");
			String browser = prop.getProperty("browser", "chrome");
			System.out.println("url = " + url + "\nusername = " + username + "\npassword " + password + "\nemail = "
					+ email + "\nbrowser = " + browser);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
