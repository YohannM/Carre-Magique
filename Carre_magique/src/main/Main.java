package main;

import java.util.Scanner;

import cavalier.Cavalier_impair;
import cavalier.Cavalier_impairement_pair;
import cavalier.Cavalier_pairement_pair;

import java.io.*;




public class Main {

	public static void main(String[] args) throws IOException{
		
		
		System.out.println("Rentrez l'ordre du carr� :"); //On demande l'ordre du carr�
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		sc.close();
		
		if (m<3){ 
			System.out.println("Des carr�s de dimensions inf�rieures � 3 n'existent pas...");}
			else {
		
		if (m%2 !=0){ //ordre impair
			
	Cavalier_impair.ordreImpair(m);
	
	     }
		
		
		if (m%2==0){ //ordre pair
			
			if ((m/2)%2==0){ // ordre pairement pair
				
				Cavalier_pairement_pair.ordrePairementPair(m);
				
		}//Fin pairement pair
			
			
		else { //ordre impairement pair
				
	Cavalier_impairement_pair.ordreImpairementPair(m);
				
			}
			
			
		
	    	}
		} //Fin de if (n pair)
	
	}//fin public void main string args

} //Fin de classe
	


	




