package com.register;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
public class DataProperties {
	String email,email1,url;
	String password,password2;
	 public DataProperties() {
			data();
	}

	public void data() {
		File file = new File("C:\\Users\\hviswanathan\\eclipse-workspace\\Harshavardhini_TechnicalAssessment3\\HarshaVardhiniViswanathan_TechnicalAssessment03\\src\\test\\resources\\login.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		}catch(IOException e) {
			e.printStackTrace();
		}
		url = prop.getProperty(url);
		email = prop.getProperty("email");
		password = prop.getProperty("password");
		email1= prop.getProperty(email1);
		password2 = prop.getProperty(password2);
	}

 
}