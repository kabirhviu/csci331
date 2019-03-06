package objectdesign2;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
	List<CatalogProduct> catalogProducts;
	
	public Catalog() {
		catalogProducts = new ArrayList<CatalogProduct>();
	}
	
	public boolean addProduct(CatalogProduct newProduct) {
		if(catalogProducts.contains(newProduct)) {
			return false;
		}
		catalogProducts.add(newProduct);
		return true;
	}
	
	public boolean removeProduct(CatalogProduct oldProduct) {
		return catalogProducts.remove(oldProduct);
	}
	
	public boolean addToStock(String productId, int quantity) {
		CatalogProduct catProduct = null;
		catProduct = getProduct(productId);
		if(catProduct != null) {
			int currentStock = catProduct.getStock();
			catProduct.setStock(currentStock + quantity);
			return true;
		}
		return false;
	}
	
	public boolean removeFromStock(String productId, int quantity) {
		CatalogProduct catProduct = null;
		catProduct = getProduct(productId);
		if(catProduct != null) {
			int currentStock = catProduct.getStock();
			catProduct.setStock(currentStock - quantity);
			return true;
		}
		return false;
	}
	
	public int getStock(String productId) {
		CatalogProduct catProduct = null;
		catProduct = getProduct(productId);
		if(catProduct != null) {
				return catProduct.getStock();
		}
		return -1; //CatalogProduct does not exists in the catalog
	}
	
	public boolean setPrice(String productId, double price) {
		CatalogProduct catProduct = null;
		catProduct = getProduct(productId);
		if(catProduct != null ) {
			catProduct.setPrice(price);
			return true;
		}
		return false;
	}
	
	public double getPrice(String productId) {
		CatalogProduct catProduct = null;
		catProduct = getProduct(productId);
		if(catProduct != null ) {
			return catProduct.getPrice();
		}
		return -1.0;
	}
	
	public CatalogProduct getProduct(String productId) {
		for (CatalogProduct catalogProduct: catalogProducts) {
			if(catalogProduct.getId().equals(productId)) {
				return catalogProduct;
			}
		}
		return null; //CatalogProduct does not exist in the catalog
	}
	
	public List<CatalogProduct> matchingProducts(String name, String type, String manufacturer, 
			String model, String color) {
		List<CatalogProduct> matchingProducts = new ArrayList<CatalogProduct>();
		for(CatalogProduct catalogProduct: catalogProducts) {
			if(catalogProduct.getSpecification().match(name, type, manufacturer, model, color)) {
				matchingProducts.add(catalogProduct);
			}
		}
		return matchingProducts;
	}
	
	public List<CatalogProduct> matchingProducts(ProductSpecification specificationToMatch) {
		List<CatalogProduct> matchingProducts = new ArrayList<CatalogProduct>();
		for(CatalogProduct catalogProduct: catalogProducts) {
			if(catalogProduct.getSpecification().match(specificationToMatch)) {
				matchingProducts.add(catalogProduct);
			}
		}
		return matchingProducts;
	}
	
	public int getSize() {
		return catalogProducts.size();
	}
}
