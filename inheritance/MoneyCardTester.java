import java.beans.DesignMode;

public class MoneyCardTester{
	public static void main(String[] args){
		System.out.println("GiftCard Class");
		GiftCard gc = new GiftCard(150);
		gc.makePurchase(149);
		System.out.println("Balance: " + gc.getBalance());
		System.out.println(gc.getAcceptability());

		System.out.println();
		System.out.println("The debit card class");
		DebitCard dc = new DebitCard(500);
		dc.makePurchase(400);
		dc.deposit(400);
		System.out.println("The balance on the dc is " + dc.getBalance());
		System.out.println(dc.getAcceptability());


		System.out.println();
		System.out.println("The credit card class");
		CreditCard cc = new CreditCard(1500);
		cc.makePurchase(111);
		cc.makePayment(222);
		System.out.println(cc.getAcceptability());
		System.out.println("Balance: " + cc.getBalance());
		System.out.println("Available Credit " + cc.getAvailableCredit());
	}
}