package basics;
import java.util.Scanner;
public class Scanner_Assignment 
{
	static double pi=3.14; //by using global variable
	
	static void circle()
	{
		Scanner s2=new Scanner(System.in);
		System.out.println("enter new radius value");
		int r= s2.nextInt();
		double results = pi*r*r;
		System.out.println(results);
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of r");
		int r=s1.nextInt();
		double result=pi*r*r;
		System.out.println(result);
			
		circle();
		
		//area of rectangle//
		
		 System.out.println("enetr the length and breadth");
		 int length=s1.nextInt();
		 int breadth=s1.nextInt();
		 
		 int rectangleresult=length*breadth;
		 System.out.println(rectangleresult);
		 
		 //circumference of circle//
		  System.out.println("please enter area of circumference");
		  int radius=s1.nextInt();
		  double results=2*pi*radius;
		  System.out.println(results);
		  
		 
		}
	
		
		
	}


