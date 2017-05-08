package edu.ilstu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Skolem
{
	public static void main(String arg[])
	{
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;
		List<String> sequence = new ArrayList<String>();
		while(choice != 1 && choice != 2){
			System.out.println("Enter 1 to create a regular Skolem sequence. Enter 2 to create a split Skolem sequence.");
			choice = keyboard.nextInt();
		}
		
		
		if(choice == 1){
			System.out.print("Enter Order of regular Skolem sequence: ");
			int m= keyboard.nextInt();
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
		else{
			System.out.println("Enter order of split Skolem sequence:");
			int m = keyboard.nextInt();
			int s = 0;
			int u = 0;
			int v = 0;
			int diff = 0;
			if (m%4 == 0){
				s = m/4;
				for (int r = 1; r <= (s-1); r++){
					u = r;
					v = 4*s - r + 1;
					diff = v - u;
					sequence.add("(" + (u + m) + ", " + (v + m) + ", " + diff + ")");
				}
				for (int r = 1; r<= (s-1); r++){
					u = s + r - 1;
					v = 3*s - r;
					diff = v - u;
					sequence.add("(" + (u + m) + ", " + (v + m) + ", " + diff + ")");
				}
				for (int r = 1; r<= (s-1); r++){
					u = 4*s + r + 1;
					v = 8*s - r + 1;
					diff = v - u;
					sequence.add("(" + (u + m) + ", " + (v + m) + ", " + diff + ")");
				}
				for (int r = 1; r<= (s-1); r++){
					u = 5*s + r + 1;
					v = 7*s - r + 1; 
					diff = v - u;
					sequence.add("(" + (u + m) + ", " + (v + m) + ", " + diff + ")");
				}
				
				sequence.add("(" + (2*s - 1 + m) + ", " + (2*s + m) + ", " + "1" + ")");
				sequence.add("(" + (3*s + m) + ", " + (5*s + 1 + m) + ", " + (2*s + 1) + ")");
				sequence.add("(" + (3*s + 1 + m) + ", " + (7*s + 1 + m) + ", " + (4*s) + ")");
				sequence.add("(" + (6*s + 1 + m) + ", " + (8*s + 1 + m) + ", " + (2*s) + ")");
				System.out.println(sequence);
			}
			if(m%4 == 3){
				s = (m + 1)/ 4;
				for (int r = 1; r<= (2*s - 1); r++){
					u = r;
					v = 4*s - r;
					diff = v - u;
					sequence.add("(" + (u + m) + ", " + (v + m) + ", " + diff + ")");
				}
				for (int r = 1; r<=(s-2); r++){
					u = 4*s + r - 1;
					v = 8*s - r;
					diff = v - u;
					sequence.add("(" + (u + m) + ", " + (v + m) + ", " + diff + ")");
				}
				for (int r = 1; r <= (s - 2); r++){
					u = 5*s + r;
					v = 7*s - r - 1;
					diff = v - u;
					sequence.add("(" + (u + m) + ", " + (v + m) + ", " + diff + ")");
				}
				sequence.add("(" + (2*s + m) + ", " + (6*s - 1 + m) + ", " + (4*s - 1) + ")");
				sequence.add("(" + (5*s + m) + ", " + (7*s + 1 + m) + ", " + (2*s + 1) + ")");
				sequence.add("(" + (4*s + 1 + m) + ", " + (6*s + m) + ", " + (2*s - 1) + ")");
				sequence.add("(" + (7*s - 1 + m) + ", " + (7*s + m) + ", " + "1" + ")");
				System.out.println(sequence);
			}
		}

	}
}
