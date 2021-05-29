package InterfaceRealWorld;

public class AmerPayTransaction implements AmerPay {
	public void rocketPayment(double payable_amount)
	{
		System.out.println("Payment successfully done by Rocket: "+payable_amount); 
	}
	public void bikasPayment(double payable_amount)
	{
		System.out.println("Payment successfully done by Bikas: "+payable_amount);  
	}
	public void nexusPayment(double payable_amount)
	{
		System.out.println("Payment successfully done by Nexus: "+payable_amount);  
	}
}
