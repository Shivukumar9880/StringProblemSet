package Word_progrms;

import java.util.Scanner;

public class _2_print_1st_char_of_Each_word_in_String 
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
		int countWord=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch!=' ')
			{
				word+=ch;
			}
			else
			{
				
//					countWord++;
				System.out.println(word.charAt(0));
				
				word="";
			}
		}
//		System.out.println("number word in String is "+countWord);
	}

}
