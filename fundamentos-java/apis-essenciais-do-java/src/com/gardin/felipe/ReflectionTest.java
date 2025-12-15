package com.gardin.felipe;

public class ReflectionTest {

	public static void main(String[] args) throws Exception {
		var p = new Product(1L, "nome", 110.0);
		ClassExplorer.exploreMetadata(p);
	}
}
