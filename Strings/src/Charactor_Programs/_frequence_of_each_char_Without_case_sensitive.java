package Charactor_Programs;

import java.util.Scanner;

public class _frequence_of_each_char_Without_case_sensitive {

	/**
	 * freq of char without case sensitive u  U are same for this pgm 
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		
		String s=sc.nextLine();
		int ele[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			
			char ch=s.charAt(i);
			if(ch>='A'&& ch<='Z')
			{
				ele[ch-65]++;
			}
			 else if(ch>='a'&& ch<='z')
			{
				 ele[ch-97]++;
			}

		}
		for(int i=0;i<ele.length;i++)
		{
			if(ele[i]!=0)
			System.out.println((char)(i+65)+" "+ele[i]);
		}
	}
}
