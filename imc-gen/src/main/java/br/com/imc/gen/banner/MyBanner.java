package br.com.imc.gen.banner;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;
public class MyBanner implements Banner  {
	@Override
	public void printBanner(Environment arg0, Class<?> arg1, PrintStream arg2) {
		arg2.println("================================"); 
		arg2.println("---------IMC Generator!---------");
		arg2.println("================================"); 
		arg2.println("Application Version : 1.0.0"); 
		arg2.println("Application Title : IMC Generator");
		arg2.println("Spring Boot Version : 2.0.0.RELEASE"); 
		arg2.println("================================");
	}
} 