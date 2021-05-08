package Inheritance;
class Address
{
	String city,divition,country;

	public Address(String city, String divition, String country) {
		this.city = city;
		this.divition = divition;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDivition() {
		return divition;
	}

	public void setDivition(String divition) {
		this.divition = divition;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
class Employee
{
	String name;
	int id;
	Address address;//aggregation/composition/has-A relationship
	public Employee(String name, int id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	void dispaly()
	{
		System.out.println("Name:"+name+" Id:"+id);
		System.out.println("City:"+address.getCity()+" Divition:"+address.getDivition()+"\nCountry:"+address.getCountry());
	}
}

public class MyClassHasA {

	public static void main(String[] args) {
	Address address =new Address("Rangpur Sadar", "Rangpur", "Bangladesh");
	Employee obj=new Employee("Md.Ismile", 27, address);
	obj.dispaly();
   }

}
