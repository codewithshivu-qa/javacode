package oops1;
class University
{
	void kuvempu_university()
	{
		System.out.println("Located in Inida");
	}
}
class College extends University
{
    void First_grade_college()
	{
		System.out.println("Seats are available");
	}
}
class Student_Details extends College

{
    void admission()
	{
		System.out.println("Seats are available");
	}
}
class Classroom extends Student_Details
{
	void class_1(int a, int b)
	{
		int result= a + b;
		System.out.println(result);
	}
}

class Multi_Level_Inheritance 
{
	public static void main(String[] args)
	{
		Classroom c1 = new Classroom();
		c1.class_1(5 ,6);
		c1.admission();
		c1.kuvempu_university();
		c1.First_grade_college();
		
		
	}

}
