package Exceptionshandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling_1 
{
	public static void main(String[] args) 
	{
		try
		{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter your age"); //exception should always be in try block only//
		int age = s1.nextInt();
		}
		catch(InputMismatchException b1)//variable name we can give anything//
		{
			System.out.println("Sorry your entry is wrong please enter your age");
		}
	}

}

//in try if there is no exception then try block will execute//
//if there is an exception in try block then catch bloack will execute//
