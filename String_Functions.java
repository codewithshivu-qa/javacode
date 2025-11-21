//String class Functions//
package stringclass;
public class String_Functions 
{
	public static void main(String[] args) 
	{
		String name = "Shiva Kumar"; //finding length of an String//
		int length= name.length();
		System.out.println(length);
		
		
		System.out.println(name.toLowerCase()); //toLowerCase() convert upper to lower//
		System.out.println(name.toUpperCase()); //toUpperCase() convert lower to upper//
		
		String s1 = "   I am a boy     ";
		System.out.println(s1.trim());//Trim remove the space beginning and end of the String//
		
		String s2 = "I am Shivakumar";
		System.out.println(s2.substring(1));//substring with 1 beginindex if you give 1 it will ignore first index value//

		String s3 ="Mourya";
		System.out.println(s3.substring(1, 5)); //This start index and end index start index will ignore 1st letter and end indext lastvalue -1//
		
		//equals string is used to comparing between two Strings//
		String s5 = "Harsha";
		String s6 = "vardhana";
		boolean b1=s5.equals(s6);
		System.out.println(b1);
		
		//equalsignorecase// this function will ignore the case either it is upper or lower//
		String s7 = "Raja";
		String s8 = "raja";
		boolean b2 = s7.equalsIgnoreCase(s8);
		System.out.println(b2);
		
		//concat// means adding the string with existing string value//
		String s9=name.concat(" ajjampura");
		System.out.println(s9);
		
		
		//replace// need to use replace(char, char)
		//Ques//in Shiva replace h with z//
		 String s10=name.replace('h', 'z');
		 System.out.println(s10);
		 
		 //replace// need to use replace(String,String)
		 //Ques// in a shivu mourya// replace mourya with kumar//
		 
		 String s11="Shivu Mourya";
		 String result=s11.replaceAll("Mourya", "kumar");
		 System.out.println(result);
		 
		 //Ques// In the given String remove all the alphabets used//
		 String s12="2nd cross 1st stage sarjapura signal 560094";
		 String result1= s12.replaceAll("[a-z]", "");
		 System.out.println(result1);
		 
		 //Ques// In the given String remover all the numerics involved//
		 String s13="2nd cross 1st stage sarjapura signal 560094";
		 String result2=s13.replaceAll("[0-9]", "");
		 System.out.println(result2);
		  
		 //Ques// In the given name Manish tiwari remove capital letters//
		 String s15 = "Manish Tiwari";
		 String result3=s15.replaceAll("[A-Z]", "");
		 System.out.println(result3);
		 
		 //Ques//In the given String Hardik Pandya remove all the space involved using replaceAll//
		 String s16="Hardik Pandya";
		 String s17= s16.replaceAll(" ","");
		 System.out.println(s17);
		 
		 //contains//functions// Checks if a substring exists in a string
		 //in the string = shivakumar does kumar contains//
		 String s18="Shiva kumar";
		 boolean result6=s18.contains("kumar");
		 System.out.println(result6);
		 
		 //matches//functions//
		 //ques//check if the given string ends with l//
		 String s19 = "School";
		 boolean result7=s19.matches("(.*)l"); //("(.*)l");/// this is the syntax is used to multicharacter search//
		 System.out.println(result7);
		
		 //ques//check if the given string starts with l//
		 String s20="lemon";
		 boolean result8 = s20.matches("l(.*)");
		 System.out.println(result8);
		 
		 //ques//check in the given String 'a' is present or not//
		 String s21 = "Kallappa";
		 boolean result9 = s21.matches("(.*)a(.*)");// this will focus whereever a starts with start or end or middle//
		 System.out.println(result9);
		 
		 //Ques//check in the given string have exact 4 letters or not//
		 String s22 = "Mallappa";
		 boolean result10 = s22.matches("........"); // . single dot means it will calculate single value//
		 System.out.println(result10);
		 
		 //charAt(index)//string function//
		 String s23 = "Aman";
		 char c1 = s23.charAt(2);
		 System.out.println(c1);
		 
		 //indexofchar//String function
		 String s24 = "splendor";
		 int result11 = s24.indexOf('a');
		 System.out.println(result11);
		
}
}
