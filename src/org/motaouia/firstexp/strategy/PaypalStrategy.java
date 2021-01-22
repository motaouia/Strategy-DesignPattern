package org.motaouia.firstexp.strategy;

public class PaypalStrategy implements IPaymentStrategy {

	private String emailId;
	private String password;

	public PaypalStrategy() {
		super();
	}

	public PaypalStrategy(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void pay(double amount) {
		System.out.println(amount + " paid with paypal");
	}

}
