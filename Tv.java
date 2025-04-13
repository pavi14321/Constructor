class Tv
{
	
	String brand;
	int cost;
	String type;

	Tv(String a, int b, String c) 
	{
		brand = a;
		cost = b;
		type = c;
	}


	public static void main(String[] args) 
	{
		System.out.println("Main Starts");

		Tv s1 = new Tv("Sony",20000000,"LED");
		System.out.println(s1.brand);
		System.out.println(s1.cost);
		System.out.println(s1.type);




		System.out.println("Main Starts");
	}
}
