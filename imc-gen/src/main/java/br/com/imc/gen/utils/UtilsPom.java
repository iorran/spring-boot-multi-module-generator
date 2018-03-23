package br.com.imc.gen.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;

import br.com.imc.gen.domain.Application;

public final class UtilsPom {

	public static final void createPomParent(final Application application) {
		try { 
			File fileToBeModified = new ClassPathResource("ParentPom.xml").getFile();
			String oldContent = "";
			BufferedReader reader = new BufferedReader(new FileReader(fileToBeModified));

			String line = reader.readLine();
			while (line != null) {
				oldContent = oldContent + line + System.lineSeparator();
				line = reader.readLine();
			} 

			 String newContent = oldContent.replaceAll("artifactIdAqui", application.getName()); 
			 newContent = newContent.replaceAll("groupIdAqui", application.getDefaultPackage()); 
			 
			 FileWriter writer = new FileWriter(application.getParentProjectFolder() + "pom.xml", true);

			 writer.write(newContent);
			
			 reader.close();
			 writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
