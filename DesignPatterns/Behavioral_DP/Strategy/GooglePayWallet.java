package DesignPatterns.Behavioral_DP.Strategy;

public class GooglePayWallet implements PaymentWallet {

	@Override
	public void pay(Product product) {
		System.out.println("Paying with google pay.."+product.getValue());
	}

}
