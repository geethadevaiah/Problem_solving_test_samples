package DesignPatterns.Behavioral_DP.Strategy;

public class StrategyTester {

	
	public static void main(String[] args) {
		Product product1 = new Product("p1", 1234);

		// add the product to the cart
		AmazonCart newCart = new AmazonCart(product1, new GooglePayWallet());
//		AmazonCart newCart = new AmazonCart(product1, new PhonePayWallet());
		newCart.pay();
		
	}
}

/**
 * 
 * Strategy Pattern
 *  
 * Used when there will be multiple options for the client to provide to
 * 
 *  Here client has the option to select payment via 
 *  GooglePay or PhonePay
 *  
 *  PaymentWallet ------> interface
 *  GooglePay and PhonePay extends this interface
 *  
 *  Wallet consists of a product and the payment interface
 *  
 *  StrategyTester is the mango method to invoke the different payment types
 * 
 */