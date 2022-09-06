package entities;

public class Product {
	
		private String name;
		private double price;
		private int quantity;

		public Product(String name, double price, int quantity) {
			super();
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}

		@Override
		public String toString() {
			return "Product [Name = " + name + ", Price = $" + String.format("%.2f", price) + ", Quantity = " + quantity + " units, Total: $" + String.format("%.2f", totalValueInStock()) + "]";
		}

		public double totalValueInStock() {
			return price * quantity;
		}
		
		public void addProducts(int quantity) {
			this.quantity += quantity;
		}
		
		public void removeProducts(int quantity) {
			this.quantity -= quantity;
		}
}
