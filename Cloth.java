class Cloth
{
	String dress_color;
	String dress_size;
	int dress_cost;
	Dress(String a, String b, int c) 
	{
		dress_color = a;
		dress_size = b;
		dress_cost = c;
	}


	public static void main(String[] args) 
	{
		System.out.println("Main Starts");

		Dress s1 = new Dress("Hotpink", "s", 2000);
		System.out.println(s1.dress_color);
		System.out.println(s1.dress_size);
		System.out.println(s1.dress_cost);




		System.out.println("Main Starts");
	}
}
