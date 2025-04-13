class Emp
{
	int emp_id;
	int emp_sal;
	String emp_grade;
	Emp(int a, int b, String c) 
	{
		emp_id = a;
		emp_sal = b;
		emp_grade = c;
	}


	public static void main(String[] args) 
	{
		System.out.println("Main Starts");

		Emp s1 = new Emp(123,200000,"A");
		System.out.println(s1.emp_id);
		System.out.println(s1.emp_sal);
		System.out.println(s1.emp_grade);




		System.out.println("Main Starts");
	}
}
