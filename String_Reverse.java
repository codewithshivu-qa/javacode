//reverse a sting//
package stringclass;
public class String_Reverse 
{
	public static void main(String[] args) 
	{
		String input = "Andrew"; 
		System.out.println("My input is :"+input);
		String output="";  // Variable to store the reversed string
		
		for(int i=input.length()-1;i>=0;i--) // Loop through the string from last character to first
		{
			char c1 =input.charAt(i); //This line retrieves a single character from a String called input, at the position/index i, and stores it in a variable named c1 of type char.in reverse order//
			output=output+c1;   // Get the character at the current index
			
		}
		System.out.println("My output is :"+output);
		
	}

}
