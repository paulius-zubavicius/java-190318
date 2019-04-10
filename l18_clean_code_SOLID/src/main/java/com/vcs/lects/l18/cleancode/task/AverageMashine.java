package com.vcs.lects.l18.cleancode.task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Random;

public class AverageMashine {
	@SuppressWarnings("resource")
	private double counting(String failas) throws IOException { // static pakeistas ir metodo pavadinimas

		File file = new File(failas); //

		if (file.exists()) {
			Reader reader = new FileReader(file); //

			BufferedReader buffReader = new BufferedReader(reader);
			String line = buffReader.readLine();

			System.out.println("Failo turinys:");
			int counter = 0;

			double avg = 0;
			while (null != line && line.isEmpty()) {
				avg += Integer.getInteger(line);
				System.out.println("" + ++counter + " ) " + line);
				line = buffReader.readLine();
			}
			buffReader.close();
			System.out.println("Pabaiga");
			return avg;

		}

		// if (!file.exists()) { jau patikrinta
		else {
			file.createNewFile();
			System.out.println("Sukure: " + file.getAbsolutePath());

			System.out.println("Egzistuoja: " + file.getAbsolutePath());

			FileWriter fw = new FileWriter(file, true);
			Random roma = new Random();

			int x = roma.nextInt(200);
			int y = roma.nextInt(250);

			for (int i = 0; i < x * y; i++) { /// ?
				// for (int j = 0; j < y; j++) {
				fw.write(roma.nextInt(Integer.MAX_VALUE));
				fw.write("\n");
				fw.flush();
				fw.close();
			}
			File ff = new File(failas);
			BufferedReader buffReader = new BufferedReader(new FileReader(ff));
			String line = buffReader.readLine();
			double avg = 0; // ??

			while (null != line && !line.isEmpty()) {
				avg += Integer.getInteger(line);
				line = buffReader.readLine();

				// avg = avg / (x * y);

			}

			buffReader.close();

			return avg / (x * y);
		}

	}
}
