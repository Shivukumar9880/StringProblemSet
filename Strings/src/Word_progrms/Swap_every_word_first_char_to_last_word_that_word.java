package Word_progrms;

import java.util.Scanner;

public class Swap_every_word_first_char_to_last_word_that_word 
{
		

		
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		s=s+" ";
		String word="";
		String newStr="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
				word+=ch;
			else
			{
				if(!(word.length()==0))
				{
					char[] wr=word.toCharArray();
					char x=wr[0];
					wr[0]=wr[wr.length-1];
					wr[wr.length-1]=x;
					word=new String(wr);
					newStr+=word+" ";
					word="";
					count++;
				}
			}
		
		}
		System.out.println(newStr);
		System.out.println("no of words in str "+count);
	}
	
}
