package cavalier;

import force_Brute.ordre3;
import ecriture_fichier.Ecriture_fichier;

public class Impairement_Pair_Soumis {

	static int[][] ordreImpairementPairSoumis (int n) { //création de méthode pour les carrés d'ordre impair
		
		int carre[][] = new int[n][n];
		int sommeMagique;
	
		if (n==6){ //Si n=6
			
			double s = 84;
			
			int carre1[][] = ordre3.ordreTrois1(3*(int)s);
			int carre2[][] = ordre3.ordreTrois1(3*(int)s);
			int carre3[][] = ordre3.ordreTrois1(3*(int)s);
			int carre4[][] = ordre3.ordreTrois1(3*(int)s);
			
			
			//remplissage coté haut gauche du tableau
			for (int k=0; k<3; k++)
			{ 
				for ( int j=0; j<3;j++)
				{
					 carre[k][j]= carre1[k][j];
				}
			}
					
					
			for (int f=0; f<3; f++)
			{ //remplissage coté haut droit du tableau
				for ( int g=3; g<6;g++)
				{
					carre[f][g]= carre2[f][g-3];
				}
			}
								 
								
			for (int h=3; h<6; h++)
			{  //remplissage coté bas gauche du tableau
				for ( int b=0; b<3;b++)
				{
					carre[h][b]= carre3[h-3][b];
				}
			}
											 
											
			for (int q=3; q<6; q++)
			{   //remplissage coté bas droit du tableau
				for ( int w=3; w<6;w++)
				{
					carre[q][w]= carre4[q-3][w-3];
				}
			}
			
			sommeMagique = 2*3*(int)s;
											 
		}
		
		
		else 
		{
		
			int p = n/2;
			
			int [][]carre1 = Cavalier_impair.ordreImpair(p);
			int [][]carre2 = Cavalier_impair.ordreImpair(p);
			int [][]carre3 = Cavalier_impair.ordreImpair(p);
			int [][]carre4 = Cavalier_impair.ordreImpair(p);
			
			for (int k=0; k<n/2; k++)
			{ //remplissage coté haut gauche du tableau
				for ( int j=0; j<n/2;j++)
				{
					 carre[k][j]= carre1[k][j];
				}
			}
				
				
			for (int f=0; f<n/2; f++)
			{ //remplissage coté haut droit du tableau
				for ( int g=n/2; g<n;g++)
				{
					carre[f][g]= carre2[f][g-n/2];
				}
			}
							 
							
			for (int h=n/2; h<n; h++)
			{  //remplissage coté bas gauche du tableau
				for ( int s=0; s<n/2;s++)
				{
					carre[h][s]= carre3[h-n/2][s];
				}
			}
										 
										
			for (int q=n/2; q<n; q++)
			{   //remplissage coté bas droit du tableau
				for ( int w=n/2; w<n;w++)
				{
					carre[q][w]= carre4[q-n/2][w-n/2];
				}
			}
		
			sommeMagique = 	(p*p*p+p)/2*2;
		
		}
		
		Ecriture_fichier.ecrire_carre(n, carre, sommeMagique);
		
		return carre;
		
	}
	
}
