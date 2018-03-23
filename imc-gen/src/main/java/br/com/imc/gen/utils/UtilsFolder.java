package br.com.imc.gen.utils;

import java.io.File;

public final class UtilsFolder {  
	public static final boolean createFolder(final File file) {
		if (!file.exists()) {
			if (file.mkdirs()) {
				System.out.println(">> CREATED: " + file.getAbsolutePath());
				return true;
			} else {
				System.out.println(">> ERROR TO CREATE: " + file.getAbsolutePath());
				return false;
			}
		}
		System.out.println(">> EXISTS: " + file.getAbsolutePath());
		return true;
	}
}
