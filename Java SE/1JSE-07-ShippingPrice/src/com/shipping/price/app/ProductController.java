package com.shipping.price.app;

import com.shipping.price.model.PurchasedProduct;

public class ProductController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PurchasedProduct products [] = {
				new PurchasedProduct ("Armoire", 800, 100),
				new PurchasedProduct ("Bidet", 1000, 500),
				new PurchasedProduct ("Transat", 200, 80),
				new PurchasedProduct ("Lit", 500, 10),
				new PurchasedProduct ("Buffet", 800, 120),
		};
		for (PurchasedProduct e:products) {
			e.run();
			System.out.println(products);
		}

	}
}
