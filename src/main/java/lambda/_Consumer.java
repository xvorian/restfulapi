package lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	// CONSUMERS
	static Consumer<Customer> functionalGreeting = c -> System.out.println(c.toString());

	// BI-CONSUMERS
	static BiConsumer<Customer, Boolean> biFunctionalGreeting = (customer, showPhoneNumber) -> {
		System.out.println("Hello "+customer.customerName + (showPhoneNumber ? "Phone No:"+customer.customerPhoneNumber:""));
	}; 
	
	public static void main(String[] args) {
		functionalGreeting.accept(new Customer("Amjad", "999-999-9999"));
		biFunctionalGreeting.accept(new Customer("Amjad", "999-999-9999"), new Boolean(false));
	}

	static class Customer {
		private String customerName;
		private String customerPhoneNumber;

		public Customer(String customerName, String customerPhoneNumber) {
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}

		@Override
		public String toString() {
			return "Customer [customerName=" + customerName + ", customerPhoneNumber=" + customerPhoneNumber + "]";
		}
		
		
	}

}
