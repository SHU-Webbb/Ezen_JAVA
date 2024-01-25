package sec06_properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyEx1 {

	public static void main(String[] args) {

		Properties prop = new Properties();

		prop.setProperty("timeout", "30");
		prop.setProperty("language", "korea");
		prop.setProperty("capacity", "10");

		Enumeration em = prop.propertyNames();

		while (em.hasMoreElements()) {

			String element = (String) em.nextElement();
			System.out.println(element + "=" + prop.getProperty(element));

		}
		prop.list(System.out);

		try {
			prop.store(new FileOutputStream("output.txt"), "Properties Example");
			prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
