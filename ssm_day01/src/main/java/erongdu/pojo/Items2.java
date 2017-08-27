package erongdu.pojo;

public class Items2 {

	private String name;

	private Float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Items2 [name=" + name + ", price=" + price + "]";
	}

}