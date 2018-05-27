package main;

import java.util.Scanner;

import cavalier.Cavalier_impair;
import cavalier.Cavalier_impairement_pair;
import cavalier.Cavalier_pairement_pair;

import java.io.*;


public class Main 
{

	public static void main(String[] args) throws IOException
	{
		
		System.out.println("Rentrez l'ordre du carré :");
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		
		sc.close();
		
		if (m<3)
		{ 
			System.out.println("Des carrés valables de dimensions inférieures à 3 n'existent pas...");
		}
		
		else 
		{
			// ordre impair	
			if (m%2 !=0)
			{ 	
				Cavalier_impair.ordreImpair(m);
			}
		
			// ordre pair
			if (m%2==0)
			{
				
				// ordre pairement pair
				if ((m/2)%2==0)
				{ 
					Cavalier_pairement_pair.ordrePairementPair(m);
				}
				
				//ordre impairement pair
				else 
				{ 
					Cavalier_impairement_pair.ordreImpairementPair(m);
				}
			}
		}
	}
}
	


	




