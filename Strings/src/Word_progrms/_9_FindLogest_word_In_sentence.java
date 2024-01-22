package Word_progrms;
import java.util.Scanner;

public class _9_FindLogest_word_In_sentence 
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
		String lw="";
	
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);

			if(ch!=' ')
				word+=ch;
			else
			{

				if(word.length()>lw.length())
					lw=word;
				word="";
			}

		}
		System.out.println(lw);
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//
//			if(ch!=' ')
//				word+=ch;
//			else
//			{
//
//				if(word.length()==l)
//					System.out.println(word);
//				word="";
//
//			}
//		}

	}
}
