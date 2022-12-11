package com.driver;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Main {
	public static void main(String...strings) {
		final Logger logger = System.getLogger("Main");
		A b = new B();
		logger.log(Level.INFO, b.meth());
	}
}
