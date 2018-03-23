package br.com.imc.gen.comands;

import java.io.File;

import javax.validation.constraints.Size;

import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import br.com.imc.gen.domain.Application;
import br.com.imc.gen.utils.UtilsFolder;
import br.com.imc.gen.utils.UtilsPom;
import lombok.Getter;
import lombok.Setter;

@ShellComponent
@ShellCommandGroup("Application")
@Getter
@Setter
public class ApplicationMethods {

	private Application application;

	@ShellMethod(value = "Criar uma aplicação", key = "new")
	public void createApplication(
			@ShellOption(value = { "-n",
					"--name" }, help = "Informe o nome da sua aplicação") @Size(min = 4, max = 10) String name,
			@ShellOption(value = { "-p", "--path" }, help = "Informe o pacote da sua aplicação") String path) {

		application = Application.builder().name(name).defaultPackage(path).build();

		boolean coreProject = createCoreProject();
		boolean restProject = createRestProject();
		boolean clientProject = createClientProject();

		if (coreProject && restProject && clientProject) {
			UtilsPom.createPomParent(application);
		}
	}

	private boolean createCoreProject() {
		boolean javaFolder = UtilsFolder
				.createFolder(new File(application.getCoreProjectFolder() + application.getJavaFolder()));
		boolean resourceFolder = UtilsFolder
				.createFolder(new File(application.getCoreProjectFolder() + application.getResourceFolder()));
		boolean testFolder = UtilsFolder
				.createFolder(new File(application.getCoreProjectFolder() + application.getTestFolder()));
		return javaFolder && resourceFolder && testFolder;
	}

	private boolean createRestProject() {
		boolean javaFolder = UtilsFolder
				.createFolder(new File(application.getRestProjectFolder() + application.getJavaFolder()));
		boolean resourceFolder = UtilsFolder
				.createFolder(new File(application.getRestProjectFolder() + application.getResourceFolder()));
		boolean testFolder = UtilsFolder
				.createFolder(new File(application.getRestProjectFolder() + application.getTestFolder()));
		return javaFolder && resourceFolder && testFolder;
	}

	private boolean createClientProject() {
		return UtilsFolder.createFolder(new File(application.getClientProjectFolder()));
	}
}