package Word_progrms;

import java.util.Scanner;

public class _1_Print_WOrds_In_String_In_saparate_line 
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
			{
				word+=ch;
			}
			else
			{
				//word processing logic
				System.out.println(word);
				word="";
			}

		}
		
	}
}
