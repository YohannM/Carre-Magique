package cavalier;

import ecriture_fichier.Ecriture_fichier;
import force_Brute.ordre3;

public class Cavalier_impairement_pair {

	public static int[][] ordreImpairementPair (int n) { 
		// carrés d'ordre impair
		
		int carre[][] = new int[6][6];
		int sommeMagique;
	
	
		if (n==6){ //Si n=6
			
			
			
			double s = Math.random()*25 + 5;
			
			int carre1[][] = ordre3.ordreTrois1(3*(int)s );
			int carre2[][] = ordre3.ordreTrois1(3*(int)s );
			int carre3[][] = ordre3.ordreTrois1(3*(int)s );
			int carre4[][] = ordre3.ordreTrois1(3*(int)s );
			
			//remplissage coté haut gauche du tableau
			for (int k=0; k<n/2; k++)
			{
				for ( int j=0; j<n/2;j++){
					 carre[k][j] = carre1[k][j];
				}
			}
					
						
			//remplissage coté bas gauche du tableau
			for (int f=0; f<n/2; f++)
			{
				for ( int g=n/2; g<n;g++)
				{
					carre[f][g] = carre2[f][g-n/2];
				}
			}
								 
			
			//remplissage coté bas gauche du tableau
			for (int h=n/2; h<n; h++)
			{  
				for ( int v=0; v<n/2;v++)
				{
					carre[h][v]= carre3[h-n/2][v];
				}
			}
			
			
			//remplissage coté bas droit du tableau
			for (int q=n/2; q<n; q++)
			{   
				for ( int w=n/2; w<n;w++)
				{
					carre[q][w]= carre4[q-n/2][w-n/2];
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
			
			//remplissage coté haut gauche du tableau
			for (int k=0; k<n/2; k++)
			{
				for ( int j=0; j<n/2;j++){
					 carre[k][j] = carre1[k][j];
				}
			}
					
						
			//remplissage coté bas gauche du tableau
			for (int f=0; f<n/2; f++)
			{
				for ( int g=n/2; g<n;g++)
				{
					carre[f][g] = carre2[f][g-n/2];
				}
			}
								 
			
			//remplissage coté bas gauche du tableau
			for (int h=n/2; h<n; h++)
			{  
				for ( int s=0; s<n/2;s++)
				{
					carre[h][s]= carre3[h-n/2][s];
				}
			}
			
			
			//remplissage coté bas droit du tableau
			for (int q=n/2; q<n; q++)
			{   
				for ( int w=n/2; w<n;w++)
				{
					carre[q][w]= carre4[q-n/2][w-n/2];
				}
			}
		
			sommeMagique = (p*p*p+p)/2*2;
		
		}//Fin else
		
		Ecriture_fichier.ecrire_carre(n, carre, sommeMagique);
		return carre;
		
	}// Fin de méthode
	
}
							 
						
