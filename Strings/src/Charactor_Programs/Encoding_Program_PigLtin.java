package Charactor_Programs;

public class Encoding_Program_PigLtin 
{
	public static void main(String[] args) 
	{

		String s="EAT";
String x="";
		for(int i=0;i<s.length();i++)
		{   
			if(i==0)
			{
				char ch=s.charAt(i);
				if(ch=='A'|| ch=='E'|| ch=='I'||ch=='O'||ch=='U')
					s=s+"WAY";
			}
			else
			{
				char ch=s.charAt(i);
				if(ch=='A'&& ch=='E'&& ch=='I'&&ch=='O'&&ch=='U')
					s=s+ch;
				else 
				{
					
					x+=ch;
				}
			}

		}
		System.out.println(s);
	}
}
