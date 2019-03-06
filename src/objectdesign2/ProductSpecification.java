package objectdesign2;

public class ProductSpecification {
	private String id;
	private String name;
	private String type;
	private String manufacturer;
	private String model;
	private String color;
	
	
	public ProductSpecification(String id, String name, String type, String manufacturer, 
			String model, String color) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.manufacturer = manufacturer;
		this.model = model;
		this.color = color;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean match(String name, String type, String manufacturer, 
			String model, String color) {
		if(	this.name.equals(name) &&
			this.type.equals(type) &&
			this.manufacturer.equals(manufacturer) &&
			this.model.equals(model) &&
			this.color.equals(color)) {
			return true;
		}
		return false;
	}
	
	public boolean match(ProductSpecification other) {
		if(this.name.equals(other.getName()) &&
				this.type.equals(other.getType()) &&
				this.manufacturer.equals(other.getManufacturer()) &&
				this.model.equals(other.getModel()) &&
				this.color.equals(other.getColor())) {
			return true;
		}
		return false;
	}
	
}


