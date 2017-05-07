package edu.ilstu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Skolem
{
	public static void main(String arg[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter Order of sequence: ");
		int m=Integer.parseInt(keyboard.nextLine());
		List<String> sequence = new ArrayList<String>();
		if (m%4 == 0 && m>=8)
		{
			int s=m/4;
			for(int r=1; r<=2*s; r++)
			{
				sequence.add("("+(4*s-2*r+2) +","+ (4*s+r-1+ (m))+"," + (8*s-r+1+(m)) + ")");
			}
			for(int r=1; r<=(s-2); r++)
			{
				sequence.add("(" + (4*s-2*r-1)+"," + (r+(m)) + ","+ (4*s-r-1+(m))+ ")"); 
				sequence.add("("+(2*s-2*r-1) + ","+ (s+r +1+(m)) + ","+ (3*s-r+(m)) + ")");
			}
			sequence.add("("+ (2*s+1) +"," + (s-1 +(m))+ ","+(3*s + (m))+ ")");
			sequence.add("(1,"+ (s+m)+ ","+(s+1+m)+ ")");
			sequence.add("(" +(2*s -1) + "," + (2*s+(m))+ ","+(4*s-1+(m))+ ")");
			sequence.add("(" +(4*s-1)+ "," +(2*s+1+(m))+ ","+(6*s+(m))+ ")");
			System.out.println(sequence);
		}
		else if (m%4 == 1)
		{
			int s=(m-1)/4;
			for(int r=1; r<=2*s; r++)
			{
				sequence.add("("+(4*s-2*r+2) +","+ (4*s+r+1+ m)+"," + (8*s-r+3+(m)) + ")");
			}
			for(int r=1; r<=(s); r++)
			{
				sequence.add("(" + (4*s-2*r+1)+"," + (r+(m)) + ","+ (4*s-r+1+(m))+ ")"); 
			}
			for(int r=1; r<=(s-2); r++)
			{
				sequence.add("("+(2*s-2*r-1) + ","+ (s+r +2+(m)) + ","+ (3*s-r+1+(m)) + ")");
			}
			sequence.add("(1,"+ (s+1+m)+ ","+(s+2+m)+ ")");
			sequence.add("(" +(4*s +1) + "," + (2*s+1+(m))+ ","+(6*s+2+(m))+ ")");
			sequence.add("(" +(2*s-1)+ "," +(2*s+2+(m))+ ","+(4*s+1+(m))+ ")");
			System.out.println(sequence);


		}

	}
}
