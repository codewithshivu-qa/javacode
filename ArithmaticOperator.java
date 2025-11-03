//write a program for arithmetic operator//
package basics;

import java.util.Scanner;

public class ArithmaticOperator 
{
	public static void add() 
	{
		int a = 30;
		int b = 40;
		int result = a+b;
		System.out.println("addition: "+ result);
        
    }
	public static void sub()
	{
		int a = 30;
		int b = 40;
		int result = a-b;
		System.out.println("Substraction: " + result);
	}
	public static void mul()
	{
		int a = 30;
		int b = 40;
		int result = a*b;
		System.out.println("multiplication: "+ result);
	}
	public static void division()
	{
		int a = 30;
		int b = 40;
		int result = a/b;
		System.out.println("division: + result");
	}
	public static void modulus()
	{
        int a = 19;
        int b = 10;
        int result = a % b;
        System.out.println("Modulus: " + result);
      
    }
	public static void main(String[] args)
	{
		add();
		sub();
		mul();
		division();
		modulus();
		
		
	}
	
}
