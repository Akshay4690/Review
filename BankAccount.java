class BankAccount
{
	private int accno;
	private double balance ;
	private String bank;
	private String ifsc ;
	private String name;
	private int pin ;
	private String type;

	BankAccount ()
	{}

	BankAccount (String name,String bank, String type, String ifsc, int accno, double balance, int pin)
	{
		this.name=name;
		this.bank=bank;
		this.type=type;
		this.ifsc=ifsc;
		this.accno= accno;
		this.balance=balance;
		this.pin = pin;
	}
	
	public int getAccount()
	{
		return accno ;
	}

	public double getbalance (int acno, int pass)
	{
		if (acno == accno && pass == pin)
		{
			return balance ;
		}
		System.out.println ("Incorrect pin or Account Number")

		return 0 ;
	}

	public String getBank()
	{
		return bank ;
	}

	public String getIfsc()
	{
		return ifsc;
	}

	public String getName()
	{
		return name;
	}

	public String getType()
	{
		return type;
	}
	
	public void setbalance (int acno, int pass, double ammount)
	{
		if (acno == accno && pass== pin)
		{
			System.out.println("Login Success !");
				
			if (balance - ammount >= 1000)
			{
				balance = balance - ammount;
				
				System.out.println("withdraw successful..!");
				System.out.println(balance);
			}
			else
			{
				System.out.println("Insuficient Balance");
			}	
		}
		else
		{
			System.out.println ("Invalid Credential...!");
		}
	}

	public void setPin(int acno,int old_pin, int new_pin)
	{
		if (acno==accno && pin==old_pin)
		{
			this.pin = new_pin;
			System.out.println("pin updated!");
		}
		else
		{
			System.out.println("Incorrect Credintia!");
		}
	}
}
	
	
			
	