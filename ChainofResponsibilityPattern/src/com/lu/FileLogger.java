package com.lu;

public class FileLogger extends AbstractLogger {
	private int level;

	public FileLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		 System.out.println("File::Logger: " + message);
	}

}
