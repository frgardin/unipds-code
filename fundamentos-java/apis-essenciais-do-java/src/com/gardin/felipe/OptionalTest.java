package com.gardin.felipe;

import java.util.*;

public class OptionalTest {

	
	public static void main(String[] args) {
		var pr = new ProductRepo();
		System.out.println(pr.findById(1L).orElseThrow(() -> new RuntimeException("not found")));
		System.out.println(pr.findById(2L).orElseThrow(() -> new RuntimeException("not found")));
		System.out.println(pr.findById(3L).orElseThrow(() -> new RuntimeException("not found")));
		System.out.println(pr.findById(4L).orElseThrow(() -> new RuntimeException("not found")));
	}
}
