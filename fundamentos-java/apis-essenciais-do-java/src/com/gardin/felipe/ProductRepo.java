package com.gardin.felipe;

import java.util.*;

public class ProductRepo {
	
	List<Product> products;
	
	public ProductRepo() {
		products = new ArrayList<>();
		products.add(new Product(1L, "Computer 1", 1000.0));
		products.add(new Product(2L, "Computer 2", 2000.0));
		products.add(new Product(3L, "Computer 3", 3000.0));
	}
	
	public Optional<Product> findById(Long id) {
		for (var p : products) {
			if (id == p.id()) {
				return Optional.of(p);
			}
		}
		return Optional.empty();
	}

}
