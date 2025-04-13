class Car
{
	
	int cost;
	String type;
	String colour;
	

	Car(int a,String b, String c) 
	{
		cost = a;
		type = b;
		colour = c;
	}


	public static void main(String[] args) 
	{
		System.out.println("Main Starts");

		Car s1 = new Car(1000000,"Petrol","Black");
		System.out.println(s1.cost);
		System.out.println(s1.type);
		System.out.println(s1.colour);




		System.out.println("Main Starts");
	}
}
