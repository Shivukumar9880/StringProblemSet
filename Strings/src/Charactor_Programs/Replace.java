package Charactor_Programs;

import java.util.Scanner;

public class Replace 
{
	public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter String");
      String s=sc.nextLine();
      String newStr="";
      String rev="";
      for(int i=0;i<s.length();i++)//deepak
      {
    	  char ch=s.charAt(i);
    	  if(i<s.length()/2)
    		  newStr+=ch;
    	  else
    		  rev=ch+rev;

      }
      System.out.println(newStr+rev);
	}
}
