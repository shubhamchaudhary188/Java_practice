import java.lang.Math.*;
class CBinaryToDecimal
{
	static int binarytodecimal(String s)
	{
	int decimalno=0;
	for(int i=s.length()-1;i>=0;i--)
		for(int j=0;;j++)
		   if(s.charAt(i)=='1')
            decimalno+=Math.pow(2,j);
		 return decimalno;  
}
public static void main(String[] args)
{
	System.out.print(binarytodecimal("10101010"));
}
}
