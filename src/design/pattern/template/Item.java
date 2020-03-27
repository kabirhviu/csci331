package design.pattern.template;

public class Item {
	private String code;
	private double price;
	
	public Item(String code, double price) {
		setCode(code);
		setPrice(price);
	}
	
	public String getCode() {return code;}
	public double getPrice() {return price;}
	public void setCode(String code) {
		this.code = code;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
