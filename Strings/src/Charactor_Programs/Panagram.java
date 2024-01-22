package Charactor_Programs;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1");
		
		String s=sc.nextLine();
		s=s.toUpperCase();
		int ele[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			ele[ch-65]++;
		}
		boolean b=findPanagram(ele);
		if(b)
		{
			System.out.println("Is Panagram");
		}
		else
		{
			System.out.println("is not Panagram");
		}
	}

	private static boolean findPanagram(int[] ele) {
		for(int i=0;i<ele.length;i++)
		{
			if(ele[i]==0)
				return false;
				
		}
		return true;
		
	}
}
