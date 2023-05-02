public class BankAccountDriver
{
	public static void main (String [] args)
	{
		BankAccount a1 = new BankAccount("Akshay","ICICI","Saving","ICIN0154",12123652,100000,36363);
		
		a1.setbalance(100000,36363,10000);
		
		a1.setPin(12123652, 36363, 25225);
		
		a1.setbalance(12123652,25225,10000);
	}
}