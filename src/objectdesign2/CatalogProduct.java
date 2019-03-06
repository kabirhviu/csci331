package objectdesign2;

public class CatalogProduct {
	private String id;
	private ProductSpecification specification;
	private double price;
	private int stock;
	
	public CatalogProduct(String id, String type, String manufacturer, 
			String model, String madeOf, String color, double price,
			int stock) {
		this.id = id;
		this.specification = new ProductSpecification(id, type, manufacturer, model, madeOf, color);
		this.price = price;
		this.stock = stock;
	}
	
	public CatalogProduct(String id, ProductSpecification specification, double price,
			int stock) {
		this.id = id;
		this.specification = specification;
		this.price = price;
		this.stock = stock;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * @return the specification
	 */
	public ProductSpecification getSpecification() {
		return specification;
	}

	/**
	 * @param specification the specification to set
	 */
	public void setSpecification(ProductSpecification specification) {
		this.specification = specification;
	}
	
//	public boolean match(String name, String type, String manufacturer, 
//		String model, String color) {
//	
//		if(this.specification.match(name, type, manufacturer, model, color)) {
//			return true;
//		}
//		return false;	
//	}
//	
//	public boolean match(ProductSpecification otherSpecification) {
//		if(this.id.equals(otherSpecification.getId())) {
//			if(this.specification.match(otherSpecification)) {
//				return true;
//			}
//		}
//		return false;	
//	}
}


