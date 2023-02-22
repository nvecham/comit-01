package com.comit.course_04_strings;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] chars = {'C' , 'o', 'm' , 'I' , 'T'};
		
		String str0 = new String(chars);
		//System.out.println(str0);
		
		String str1 = "ComIT";
		//System.out.println(str1);
		
		//String length
		
		System.out.println(str1.length());
		
		//String concatenation or join strings
		
		String str2 = "Hello";
		
		String str3 = str2 + " " +str1;
		System.out.println(str3);
		
		String str4 = str2.concat(" ").concat(str1);
		System.out.println(str4);
		
		// String Trim
		
		String str5 = "  Hello ";
		System.out.println("-->"+str5+"<--");
		System.out.println(str5.trim());
		
		 // String comparison
		
		String str6 = "Hello";
		//System.out.println(str6.charAt(2));
		System.out.println(str6.contains("el")); //Checks if a string is a substring of another string.
		System.out.println(str6.equals("hello")); //Case sensitive. Hello is different from hello
		System.out.println(str6.equalsIgnoreCase("hello"));//ignores case conditions
		
		
		 //String replace
		 
		System.out.println(str6.replace("Hello", "ComIT, I love Java"));
		System.out.println(str6);
		
		str6 = str6.replace("Hello", "ComIT, I love Java");
		System.out.println(str6);
		
		//Substrings
		
		String str7 = "ComIT, I love Java";
		 // index      012345678901234567
		System.out.println(str7.substring(7));
		System.out.println(str7.substring(9,13));
		
	}

}
