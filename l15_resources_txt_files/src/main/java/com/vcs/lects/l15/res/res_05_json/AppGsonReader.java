package com.vcs.lects.l15.res.res_05_json;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

public class AppGsonReader {

	public static void main(String[] args) throws IOException {

		
		
		File file = new File("aaa.json");
		Reader reader = new FileReader(file); 
		
		
		Gson gson = new Gson();
		
		
		ModelObject mo = gson.fromJson(reader, ModelObject.class);
		
		for (String personKey : mo.getPersons().keySet()) {
			
			System.out.println("KEY: " + personKey);
			System.out.println(mo.getPersons().get(personKey).getName());
			System.out.println(mo.getPersons().get(personKey).getAge());
			System.out.println();
			
		}

		

		

		System.out.println("Done");
	}

}
