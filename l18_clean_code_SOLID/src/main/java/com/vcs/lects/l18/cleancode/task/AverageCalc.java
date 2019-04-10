package com.vcs.lects.l18.cleancode.task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Random;

public class AverageCalc {

	public static void main(String[] args) throws IOException {

		AverageCalc c = new AverageCalc();
		double avg = c.calc("aaa.txt");

		System.out.println(avg);
	}

	private double calc(String path) throws IOException {

		File file = new File(path);

		if (!file.exists()) {
			createWithRandomData(file);
		}

		return readAndCalc(file);
	}

	private void createWithRandomData(File file) throws IOException {
		file.createNewFile();

		FileWriter fw = new FileWriter(file, true);
		Random rnd = new Random();
		int randomCount = rnd.nextInt(50000);
		for (int i = 0; i < randomCount; i++) {
			fw.write("" + rnd.nextInt(Integer.MAX_VALUE) + "\n");
		}
		fw.close();
	}

	private double readAndCalc(File file) throws IOException {
		Reader reader = new FileReader(file);

		BufferedReader buffReader = new BufferedReader(reader);
		String line = buffReader.readLine();

		int counter = 0;

		Integer avg = 0;
		while (null != line && !line.isEmpty()) {
			avg += Integer.getInteger(line);
			counter++;
			line = buffReader.readLine();
		}
		buffReader.close();
		return avg / counter;

	}

}
