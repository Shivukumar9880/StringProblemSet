package Charactor_Programs;

import java.util.Scanner;

/**
 * frequence of each char without case of leter
 */
public class _frequency_of_each_char_in_string 
{
	
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		
		String s=sc.nextLine();
//		s=s+" ";
	    int ele[]=new int[128];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			ele[ch]++;
			
		}
		for(int i=0;i<ele.length;i++)
		{
			if(ele[i]!=0)
			{
				System.out.println((char)i+"  "+ele[i]);
			}
		}
		
    	
	}
}
