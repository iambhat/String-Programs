package strings;


import java.util.Scanner;

public class removeDuplicate
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int s,ss;
		System.out.println("Enter the size of First Array");
		s=sc.nextInt();
		String s1[]=new String[s];
		System.out.println("Enter the values");
		for(int i=0;i<s;i++)
		{
			s1[i]=sc.next();
		}
		System.out.println("Enter the size of Second Array");
		ss=sc.nextInt();
		String s2[]=new String[ss];
		System.out.println("Enter the values");
		for(int i=0;i<ss;i++)
		{
			s2[i]=sc.next();
		}
		String s3[]=new String[s+ss];
		int k=0,flag=0;
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(s1[i].equalsIgnoreCase(s1[j]))
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				s3[k]=s1[i];
				k++;
			}
			flag=0;
		}
		for(int i=0;i<ss;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(s2[i].equalsIgnoreCase(s2[j]))
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				s3[k]=s2[i];
				k++;
			}
			flag=0;
		}
		try {
		for(int i=0;i<s3.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(s3[i].equalsIgnoreCase(s3[j]))
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(s3[i]);
				flag=0;
			}
			flag=0;
		}
		}
		catch(NullPointerException e)
		{
			
		}
		
	}
}
