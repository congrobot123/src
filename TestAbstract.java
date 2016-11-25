public class TestAbstract
{
	public static void main(String[] args) 
	{
		Apple apple = new Apple(2, "red", 5);
		apple.test2();
	}
}

class OBJECT
{
	public void test()
	{
		System.out.println("OBJECT test()");
	}

	public void test1()
	{
		System.out.println("OBJECT test1()");
	}

}

abstract class Fruit extends OBJECT
{
	private int weight;
	private String color;

	public void test()
	{
		System.out.println("Fruit test()");
	}

	public void test3()
	{
		super.test();
	}
	
 
	public abstract int GetPrice();

	public static Fruit getInstance()
	{
		Fruit fruit = new Apple(2, "red", 5);
		return fruit;
	}

	public Fruit(int weight, String color)
	{
		this.weight = weight;
		this.color = color;
	}
}

class Apple extends Fruit
{
	private int price;
	
	public int GetPrice()
	{
		return price;
	}

	public void test2()
	{
		super.test1();
		super.test3();
		super.test();
	}
	
	public Apple(int weight, String color, int price)
	{
		super(weight, color);
		this.price = price;
	}
}


