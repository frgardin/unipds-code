package com.gardin.felipe;

import java.util.Arrays;

public class ClassExplorer {
	
	public static void exploreMetadata(Object o) throws Exception {
		System.out.println("-----> Extraindo os atributos");
		Arrays.stream(o.getClass().getDeclaredFields())
				.map(f -> "%s : %s".formatted(f.getName(), f.getType().getName()))
				.forEach(System.out::println);
		System.out.println("-----> Extraindo os métodos");
		Arrays.stream(o.getClass().getDeclaredMethods())
				.map(m -> "%s : %s".formatted(m.getName(), m.getReturnType().getName()))
				.forEach(System.out::println);
		System.out.println("-----> Extraindo dados do objeto");
		
		for (var f : o.getClass().getDeclaredFields()) {
			f.setAccessible(true);
			System.out.println(f.get(o));
			f.setAccessible(false);
		}
		System.out.println("-----> Extraindo dados do objeto atraves de metodos");
		
		for (var m : o.getClass().getDeclaredMethods()) {
			if (m.getParameterCount() == 0) {
				System.out.println("%s : %s".formatted(m.getName(), m.invoke(o)));	
			}
		}
	}
}
