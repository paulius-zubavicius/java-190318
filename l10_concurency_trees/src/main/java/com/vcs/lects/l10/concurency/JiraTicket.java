package com.vcs.lects.l10.concurency;

import java.util.ArrayList;
import java.util.List;

public class JiraTicket {

	private int number = 0;

	private List<String> tasks = new ArrayList<>();

	public void addTicket() {
		synchronized ("raktas") {
			tasks.add("" + ++number);
		}
	}

	public int getTasksAmount() {
		return tasks.size();
	}

	public boolean takeOneAndResolve() {

		synchronized ("raktas") {
			if (!tasks.isEmpty()) {
				tasks.remove(tasks.size() - 1);
				return true;
			}
		}

		return false;

	}

}
