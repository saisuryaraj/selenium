package selenium;

public class CntOfVowelsInStr {
	public static void main(String[] args)
	{
		String str="SURYA";
		char[] c =str.toCharArray();
		
		int vowels=0;
		for(int i =0;i<str.length();i++)
		{
			if((str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u') || (str.charAt(i) =='A' || str.charAt(i) =='E' || str.charAt(i) =='I' || str.charAt(i) =='O' || str.charAt(i) =='U'))
			{
				vowels++;
			}
		}
		System.out.println(vowels);
	}
}
