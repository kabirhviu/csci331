package objectdesign1;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
	List<Product> products;
	int size = 0;
	
	public Catalog() {
		products = new ArrayList<Product>();
		size = 0;
	}
	
	public boolean addProduct(Product newProduct) {
		if(products.contains(newProduct)) {
			return false;
		}
		products.add(size++, newProduct);
		return true;
	}
	
	public boolean removeProduct(Product oldProduct) {
		if(products.remove(oldProduct)){
			size--;
			return true;
		}
		return false;
	}
	
	public boolean addToStock(String productId, int quantity) {
		for (Product product: products) {
			if(product.getId().equals(productId)) {
				int currentStock = product.getStock();
				product.setStock(currentStock + quantity);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeFromStock(String productId, int quantity) {
		for (Product product: products) {
			if(product.getId().equals(productId)) {
				int currentStock = product.getStock();
				product.setStock(currentStock - quantity);
				return true;
			}
		}
		return false;
	}
	
	public boolean setPrice(String productId, double price) {
		for (Product product: products) {
			if(product.getId().equals(productId)) {
				product.setPrice(price);
				return true;
			}
		}
		return false;
	}
	
	public double getPrice(String productId) {
		for (Product product: products) {
			if(product.getId().equals(productId)) {
				return product.getPrice();
			}
		}
		return -1.0;
	}
	
	public int getStock(String productId) {
		for (Product product: products) {
			if(product.getId().equals(productId)) {
				return product.getStock();
			}
		}
		return -1; //CatalogProduct does not exists in the catalog
	}
	
	public Product getProduct(String productId) {
		for (Product product: products) {
			if(product.getId().equals(productId)) {
				return product;
			}
		}
		return null; //CatalogProduct does not exist in the catalog
	}
	
	public List<Product> matchingProducts(String name, String type, String manufacturer, 
			String model, String color) {
		List<Product> matchingProducts = new ArrayList<Product>();
		for(Product product: products) {
			if(		product.getName().equals(name) &&
					product.getType().equals(type) &&
					product.getManufacturer().equals(manufacturer) &&
					product.getModel().equals(model) &&
					product.getColor().equals(color)) {
				matchingProducts.add(product);
			}
		}
		return matchingProducts;
	}
	
	public int getSize() {
		return size;
	}
}
