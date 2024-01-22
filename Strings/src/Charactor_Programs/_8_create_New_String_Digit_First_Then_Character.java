package Charactor_Programs;

import java.util.Scanner;

public class _8_create_New_String_Digit_First_Then_Character 
{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		// input No26 Sound  ->output -26 No sound
		
		String digit="";
		String newStr="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch>='0'&& ch<='9')
				digit+=ch;
			if(ch>='A' && ch<='Z')
				newStr+=ch;
			if(ch>='a' && ch<='z')
				newStr+=ch;
			
			
		}
		System.out.println("new String is ->"+digit+" "+newStr);
		
	}
}
