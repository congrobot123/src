public class TestClone
{
	public static void main(String[] args)
		throws CloneNotSupportedException
	{
		Address a1 = new Address("��������");
		User u1 = new User(20,a1);
		User u2 = u1.clone();

		System.out.println(u1 == u2);
		System.out.println(u1.address == u2.address);

		User[] array = new User[100];
		for(int i=0; i<array.length; ++i)
		{
			array[i] = u1.clone();
		}
	}
}

class Address
{
	String detail;

	public Address(String detail)
	{
		this.detail = detail;
	}
}

class User implements Cloneable 
{
	int age;
	Address address;

	public User clone()
		throws CloneNotSupportedException
	{
		User temp = (User)super.clone();
		return temp;
	}

	public User(int age, Address address)
	{
		this.age = age;
		this.address = address;
	}
}
