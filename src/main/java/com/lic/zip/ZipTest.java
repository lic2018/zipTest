package com.lic.zip;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import org.junit.Test;

public class ZipTest {

	@Test
	public void t01() throws ZipException, IOException {
		
		String pathname = "D:\\123.zip";
		File file = new File(pathname);
		if (!file.exists()) {
			file.createNewFile();
		}
	}
}
