package Charactor_Programs;


public class _11_Encoding_String_Where_Each_Lettre_Move_By_Each_Char 
{

	/**
	 * input->SIMPLY each character moves to 2 char forward and print it
	 * output->UKORNA
	 */
	
	public static void main(String[] args) {
		
		String s="SIMPLYZ";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='y' ||ch[i]=='Y' || ch[i]=='z' || ch[i]=='Z' )
				ch[i]=(char)(ch[i]-26);
			ch[i]=(char)(ch[i]+2);
			
		}
		s=new String(ch);
		System.out.println(s);
	}
}
