package gitcmdpractice;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str="";
		System.out.println("Enter string name");
		str=sc.nextLine();
		String reverse ="";
		for(int i=str.length()-1;i>=0;i--)
		{
		 reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse string is "+"\t"+reverse);
		System.out.println("Reverse string is "+""+reverse);
	}

	}


