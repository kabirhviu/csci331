package design.pattern.decorator;

public abstract class Beverage {
	
	private String description = "Abstract beverage.";
	
	
	public abstract double cost();
	

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
}
