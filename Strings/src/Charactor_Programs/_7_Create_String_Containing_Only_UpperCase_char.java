package Charactor_Programs;

import java.util.Scanner;

public class _7_Create_String_Containing_Only_UpperCase_char {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		
		String upString="";
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			
			if(ch>='A' && ch<='Z')
				upString+=ch;
				
		}
		
		System.out.println("only UpperCase char in String : "+upString);
	}
}
