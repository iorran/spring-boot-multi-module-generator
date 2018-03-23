package br.com.imc.gen.domain;

import br.com.imc.gen.utils.AppConstants;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Application {
	private String name;
	private String defaultPackage;

	public String getCoreName() {
		return name + "-core";
	}

	public String getRestName() {
		return name + "-rest";
	}
	
	public String getClientName() {
		return name + "-client";
	}

	public String getParentProjectFolder() {
		return AppConstants.USER_DIR + AppConstants.FILE_SEPARATOR + name + AppConstants.FILE_SEPARATOR;
	}
	
	public String getCoreProjectFolder() {
		return getParentProjectFolder() + AppConstants.FILE_SEPARATOR + getCoreName() + AppConstants.FILE_SEPARATOR;
	} 

	public String getRestProjectFolder() {
		return getParentProjectFolder() + AppConstants.FILE_SEPARATOR + getRestName() + AppConstants.FILE_SEPARATOR;
	} 
	
	public String getClientProjectFolder() {
		return getParentProjectFolder() + AppConstants.FILE_SEPARATOR + getClientName() + AppConstants.FILE_SEPARATOR;
	} 

	public String getJavaFolder() {
		return AppConstants.SRC_JAVA + defaultPackage.replace(".", AppConstants.FILE_SEPARATOR);
	}

	public String getResourceFolder() {
		return AppConstants.SRC_RESOURCES;
	}

	public String getTestFolder() {
		return AppConstants.SRC_TEST + defaultPackage.replace(".", AppConstants.FILE_SEPARATOR);
	}

}
