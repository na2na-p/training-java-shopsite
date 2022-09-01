package dev.na2na.trainingjavashopsite.bean;

public class ItemBean implements java.io.Serializable {
	private ProductBean product;
	private int count;

	public ItemBean() {
	}

	public ItemBean(ProductBean product, int count) {
		this.setProduct(product);
		this.setCount(count);
	}

	public ProductBean getProduct() {
		return product;
	}

	public void setProduct(ProductBean product) {
		this.product = product;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
