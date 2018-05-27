package ecriture_fichier;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Ecriture_fichier 
{
	public static void ecrire_carre(int ordre, int[][] carre, int sommeMagique)
	{
		String nomFic = "carre_" + ordre + ".txt"; 
		System.out.println("Fin du calcul, écriture du fichier "+ nomFic + "...");
		PrintWriter hFic;
		
		try {
			hFic = new PrintWriter(new BufferedWriter(new FileWriter(nomFic)));
		} 
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Ecriture du carré magique impossible.");
			return ;
		}

		// Impression du tableau
		hFic.println("Carre magique d'ordre " + ordre);
		
		for (int ligne=0; ligne<ordre; ligne++)
		{
			for (int colonne=0; colonne<ordre; colonne++)
			{
				hFic.print(carre[ligne][colonne] + " ");
			}
			hFic.println("") ;
		}
		
		hFic.println("La somme magique est " + sommeMagique);
		hFic.close();
		System.out.println("fin écriture, programme terminé.");
	}
}
