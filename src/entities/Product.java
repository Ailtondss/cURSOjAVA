package entities;

public class Product {
	public String nome;
	public Double price;
	public int quantity;

	public Product() {

	}

	public Product(String nome, Double price, int quantity) {
		this.nome = nome;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String nome, Double price) {
		this.nome = nome;
		this.price = price;
	}

	public Double totalValuesInStock() {
		return price * quantity;

	}

	public void addProducts(int quantitys) {
		this.quantity += quantitys;

	}

	public void removeProducts(int quantitys) {
		this.quantity -= quantitys;

	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", price) + ", " + quantity + " units Total: $ "
				+ String.format("%.2f", totalValuesInStock());
	}

}
