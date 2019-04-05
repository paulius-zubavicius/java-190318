package com.vcs.lects.l15.res.res_05_json;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

public class AppGsonWriter {

	public static void main(String[] args) throws IOException {

		ModelObject mo = new ModelObject();

		Gson gson = new Gson();

		String moJson = gson.toJson(mo);

		File file = new File("aaa.json");

		FileUtils.writeStringToFile(file, moJson, StandardCharsets.UTF_8, false);

		System.out.println("Done");
	}

}
