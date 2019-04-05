package com.vcs.lects.l15.res.res_01_txt_plain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class PlainText {

	public static void main(String[] args) {

		File f = new File("duomenys.dat");

		if (f.exists() && !f.isDirectory()) {

			// Egzistuoja

			BufferedReader buffreader = null;

			try {

				Reader reader = new FileReader(f);
				buffreader = new BufferedReader(reader);
				String lineFromFile = buffreader.readLine();

				System.out.println(f.getAbsolutePath() + " " + f.length());

				int lNb = 0;
				while (lineFromFile != null && !lineFromFile.isEmpty()) {
					System.out.println("" + ++lNb + " : " + lineFromFile);
					lineFromFile = buffreader.readLine();
				}

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					buffreader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		} else {

			// Neegzistuoja
			try {

				if (f.createNewFile()) {
					System.out.println("Sukurtas: " + f.getAbsolutePath());
				} else {
					System.out.println("Egzistuoja, nors neturetu :/ " + f.getAbsolutePath());
				}

				FileWriter w = new FileWriter(f);
				w.write("duomenys :)\n");
				w.flush();
				w.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
