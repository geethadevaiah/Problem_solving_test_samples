package DesignPatterns.Behavioral_DP.Strategy;

public class AmazonCart {

	private Product product;
	private PaymentWallet wallet;
	
	
	public AmazonCart(Product product, PaymentWallet wallet) {
		super();
		this.product = product;
		this.wallet = wallet;
	}


	public void pay() {
		wallet.pay(product);
	}
}
