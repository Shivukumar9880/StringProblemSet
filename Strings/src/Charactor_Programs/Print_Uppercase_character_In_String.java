package Charactor_Programs;

public class Print_Uppercase_character_In_String 
{
	public static void main(String[] args) {

		String s="Shivu";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch>='A' && ch<='Z')
				System.out.println(ch);
		}
	}
}
