package Crete_new_String_problms;

import java.util.Scanner;

public class _2_swap_first_and_last_letter_in_each_word_sentence 
{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		/**
		 * @Word_processing_logic_u_must_add_space_at_end_of_the_String-s=s+" ";
		 */
		s+=" ";
		String word="";
		String newstr="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);

			if(ch!=' ')
			{
				word+=ch;
			}
			else
			{
				if(!isEmptys(word))
				{
				 String replace = replace(word);
				 newstr+=replace+" ";
				 count++;
				 word="";
				}
			}

		}
		System.out.println(newstr);
		System.out.println("number of words i  string "+count);
	}

	private static boolean isEmptys(String word) {
		if(word.length()==0)
		{
			return true;
		}
		
		return false;
	}

	private static String replace(String word)
	{
		
		char [] wr=word.toCharArray();
		char x=wr[0];
		 wr[0]=wr[wr.length-1];
		 wr[wr.length-1]=x;
		 
		 word=new String(wr);
		 return word;
		
	}
}
