class CompareToIgnoreCase
{
	public static void main(String... s)
	{
		String str1="Strings are immutable";
		String str2="Strings are immutable";
		String str3="Integers are not immutable";
		int result1=str1.compareTo(str2);
		System.out.println("compareTo="+result1);
		int result2=str1.compareToIgnoreCase(str2);
		System.out.println("compareToignoreCase="+result2);
		int result3=str2.compareToIgnoreCase(str3);
		System.out.println(result3);
		int result4=str3.compareToIgnoreCase(str1);
		System.out.println(result4);
	}
}