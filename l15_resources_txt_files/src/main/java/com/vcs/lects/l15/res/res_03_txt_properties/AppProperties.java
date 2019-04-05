package com.vcs.lects.l15.res.res_03_txt_properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class AppProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("config.properties");
		Reader reader = new FileReader(f);

		Properties prop = new Properties();
		prop.load(reader);

		String propValue = prop.getProperty("workingMode", "-1");
		int val = Integer.parseInt(propValue);

		switch (val) {
		case 0:
			System.out.println("Dirbam DEFAULT rezimu");
			break;
		case 1:
			System.out.println("Dirbam TEST rezimu");
			break;
		default:
			System.out.println("Dirbam DEVELOPMENT rezimu: " + val);
			break;
		}
		
	}

}
