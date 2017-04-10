public class MoneyCard{
	protected int balance;
	protected Acceptability acceptability;
	public int getBalance(){
		return balance;
	}
	public void makePurchase(int amount){
		if(balance < amount){
			throw new IllegalArgumentException("Amount exceeds balance");
		}
		
		balance = balance - amount;
	}

	public String getAcceptability(){
		return acceptability.location();
	}
	
}