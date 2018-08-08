package com.lic.zip;

import java.io.File;
import java.io.IOException;


import org.junit.Test;

public class FileTest {

	@Test
	public void t01() throws IOException {
		String pathname = "D:\\123.txt";
		File file = new File(pathname);
		if (file.exists()) {
			file.delete();
		} else {
			file.createNewFile();
		}
	}

	@Test
	public void t02() throws IOException {
		File file = new File("D:" + File.separator + "tt.txt");
		if (file.exists()) {
			file.delete();
		} else {
			file.createNewFile();
		}
	}
	
	// ²âÊÔÐÞ¸Ä
}
