package Word_progrms;

import java.util.Scanner;

public class _5_print_word_that_ends_with_ED_char_in_String 
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
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch!=' ')
				word+=ch;
			else
			{
			    
				char x=word.charAt(word.length()-1);
				char y=word.charAt(word.length()-2);

			    if(y=='E'&& x=='D'|| y=='e'|| x=='d')
				System.out.println(word);
				

			word="";
			}
				
		}
	}

}
