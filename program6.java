/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int yr;
		Scanner S=new Scanner(System.in);
		yr=S.nextInt();
		if(yr%4==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
