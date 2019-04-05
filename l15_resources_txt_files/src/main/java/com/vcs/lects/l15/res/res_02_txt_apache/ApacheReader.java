package com.vcs.lects.l15.res.res_02_txt_apache;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class ApacheReader {

	public static void main(String[] args) throws IOException {

		File f = new File("duomenys.dat");

		List<String> lines = FileUtils.readLines(f, java.nio.charset.StandardCharsets.UTF_8);

		int c = 0;
		for (String line : lines) {
			System.out.println("" + ++c + " : " + line);
		}

	}

}
