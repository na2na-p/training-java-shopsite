package dev.na2na.trainingjavashopsite.bean;

public class ProductBean implements java.io.Serializable {
	private int id;
	private String name;
	private int price;

	public ProductBean() {
	}

	public ProductBean(int id, String name, int price) {
		this.setId(id);
		this.setName(name);
		this.setPrice(price);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
