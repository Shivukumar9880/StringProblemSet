package Crete_new_String_problms;

import java.util.Scanner;

public class _1_Replce_word_Another_word_In_String
{
	private static boolean isEmpty(String word) {
		if(word.length()==0)
			return true;
		return false;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		/**
		 * @Word_processing_logic_u_must_add_space_at_end_of_the_String-s=s+" ";
		 */
		s= s + " ";
		String rpl="Banglore";
		String rr="india";/// i am in Banglore 
		String word="";
		String newStr="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch!=' ')
				word+=ch;
			else
			{
				if(!isEmpty(word))
				{
					boolean b=check(word,rpl);
					if(b)
						newStr+=rr+" ";
					else
						newStr+=word+" ";
					word="";
				}
				
			}
		}
		System.out.println(newStr);
	}



	private static boolean check(String word, String rpl) {
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)!=rpl.charAt(i))
				return false;
		}
		return true;
	}
}
