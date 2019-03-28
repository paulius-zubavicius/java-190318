package com.vcs.lects.l09.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

	public static void main(String[] args) {

		Map<Integer, String> savaite = new HashMap<>();
		savaite.put(1, "pr");
		savaite.put(2, "an");
		savaite.put(3, "tr");
		savaite.put(4, "kt");
		savaite.put(5, "pn");
		savaite.put(6, "ss");
		savaite.put(7, "sk");
		savaite.put(8, "sk");

		// System.out.println(savaite.get(0)); // null

		for (Integer key : savaite.keySet()) {
			// Key : Value
			System.out.println(key + " : " + savaite.get(key));

		}

		for (String value : savaite.values()) {
			System.out.println(value);

		}

	}

}
