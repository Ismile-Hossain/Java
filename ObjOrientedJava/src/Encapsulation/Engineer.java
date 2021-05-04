package Encapsulation;

import java.util.Scanner;

public class Engineer {
    private String name;
    private long engACno;
    private String email;
    private double acBalance;
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getEngACno() {
		return engACno;
	}
	public void setEngACno(long engACno) {
		this.engACno = engACno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAcBalance() {
		System.out.println("Please enter your Acount Name:");
		Scanner sco= new Scanner (System.in);
		String acName=sco.nextLine();
		
		System.out.println("Please enter your Acount Number:");
		Scanner sc1= new Scanner (System.in);
		long acNo=sc1.nextLong();
		
		if(acName.equals(name) && acNo==engACno) {
		   System.out.println("Your current AC Balance: "+acBalance);
		   
		}
		else {System.out.println("Wrong AC Name or AC number!!!");}
		
		return acBalance;
	}
	public void setAcBalance(double acBalance) {
		this.acBalance = acBalance;
	}
    
    
    
}
