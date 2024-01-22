package Charactor_Programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1");
		
		String s1=sc.nextLine();
		System.out.println("Enter String2");
		String s2=sc.nextLine();
		int []char1=new int[128];
		int []char2=new int[128];
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			char1[ch]++;
		}
		
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			char2[ch]++;
		}
		
		boolean b=findanagram(char1,char2);
		
		if(b)
		{
			System.out.println("is Anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}
		
	}

	private static boolean findanagram(int[] char1, int[] char2) {
		for(int i=0;i<char1.length;i++)
		{
		if(char1[i]!=char2[i])
			return false;
		}
		return true;
		
	}
}
