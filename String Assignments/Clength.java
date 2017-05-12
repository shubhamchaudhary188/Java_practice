class Clength
{
	static String length(String s)
	{
	StringBuffer sb=new StringBuffer();
	int start=0;
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)!=' '){
			start++;
		}
		else 
		continue;
	}
	System.out.println(start);
	return sb.toString();
	}
	public static void main(String... s)
	{
		length("shubham chaudhary");
	}
}