package com.crm.genericUtility;

import java.io.FileInputStream;
import java.util.Properties;


public class File_Utility {

	public static Properties p;
	public static void initializefile(String path) throws Throwable {

		FileInputStream fis = new FileInputStream(path);

		 p = new Properties();
		p.load(fis);
	}	
	public static String fetchDataFromProperty(String key) throws Throwable {
		
		String value=p.getProperty(key);
		return value;
	}



}
