package com.gardin.felipe;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class TimeTest {
	
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy'T'HH:mm:ss.SSSSSSSSS");
		System.out.println(ldt.format(dtf));	
	}
}
