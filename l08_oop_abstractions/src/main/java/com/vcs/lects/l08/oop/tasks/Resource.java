package com.vcs.lects.l08.oop.tasks;

public class Resource implements ReadOnly, WriteOnly {
	private String data = "secret data";

	@Override
	public String readData() {
		return data;
	}

	@Override
	public void writeData(String data) {
		this.data = data;
	}
}

interface ReadOnly {
	String readData();
}

interface WriteOnly {
	void writeData(String data);
}

class Manager {
	public void readWrite(Resource data) {
		String secret = data.readData(); // Ok
		data.writeData("new data"); // Ok
	}
}

class Reader {
	public void read(ReadOnly data) {
		data.readData(); // Ok
//		data.writeData("new data"); // NOT OK
	}
}

class Writer {
	public void write(WriteOnly data) {
//		data.readData(); // NOT OK
		data.writeData("new data"); // Ok
	}
}
