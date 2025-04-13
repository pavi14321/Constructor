class School 
{
	String school_name;
	String school_grade;
	int school_strength;
	School(String a, String b, int c) 
	{
		school_name = a;
		school_grade = b;
		school_strength = c;
	}


	public static void main(String[] args) 
	{
		System.out.println("Main Starts");

		School s1 = new School("Jsp", "A", 200);
		System.out.println(s1.school_name);
		System.out.println(s1.school_grade);
		System.out.println(s1.school_strength);




		System.out.println("Main Starts");
	}
}
