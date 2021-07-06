package DesignPatterns.Behavioral_DP.Strategy;

public class PhonePayWallet implements PaymentWallet {

	@Override
	public void pay(Product product) {
		System.out.println("Paying from PhonePay = "+product.getValue());
	}

}
