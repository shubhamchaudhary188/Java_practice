class ChangeCase
{
	static String changecase(String s)
	{
		StringBuffer sb=new StringBuffer();
		int assci; char character;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
				assci=s.charAt(i)-32;
				character=(char)assci;
				sb.append(character);
			}
			else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
				assci=s.charAt(i)+32;
				character=(char)assci;
				sb.append(character);
			}
			else
				sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String... s)
	{
		System.out.println(changecase("Shubham CHAUDHARY"));
	}
}