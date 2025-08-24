package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Read_property {
	
	@Test
	public String property(String path,String key) throws IOException {
	FileInputStream fis = new FileInputStream(path);
	Properties p = new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
	}

}
