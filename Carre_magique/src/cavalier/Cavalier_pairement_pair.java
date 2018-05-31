package cavalier;

import ecriture_fichier.Ecriture_fichier;
import force_Brute.ordre4; 


public class Cavalier_pairement_pair 
{

	public static int[][] ordrePairementPair (int n)
	{
		
		int carre[][] = new int[n][n];
		int sommeMagique;
		
		if (n==4)
		{
			
			double s = 25*n;
		
			carre = ordre4.ordreQuatre(4*(int)s, n);
			
			sommeMagique = 4*(int)s;
			
		}
		
        else 
        {
		
			if (n%8!=0 && n!=4)
			{
				//Impairement Pairement Pair
				
				int p = n/2;
				
				
				int [][] carre1 = Impairement_Pair_Soumis.ordreImpairementPairSoumis(p);
				int [][] carre2 = Impairement_Pair_Soumis.ordreImpairementPairSoumis(p);
				int [][] carre3 = Impairement_Pair_Soumis.ordreImpairementPairSoumis(p);
				int [][] carre4 = Impairement_Pair_Soumis.ordreImpairementPairSoumis(p);
				
				
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
				
				
				if (p==6)
				{
					sommeMagique = 12*p*14;
				}
				else
				{ 
					int y = p/2;
					sommeMagique = (y*y*y+y)/2*4;
				}
			}
			
			else 
			{
				
				if (n==8)
				{
					
		         // int p = n/2;
					int s = 100;
					
					int [][] carre1 = ordre4.ordreQuatre(s, n);
					int [][] carre2 = ordre4.ordreQuatre(s, n);
					int [][] carre3 = ordre4.ordreQuatre(s, n);
					int [][] carre4 = ordre4.ordreQuatre(s, n);
					
					
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
					
					sommeMagique = 2 * s;
														
				}
		
		
				else 
				{ 
					//n est pairement pairement pair
					
					System.out.println("Malheureusement, l'ordre demandé est "
							+ "pairement pairement pair (divisible par 8)\n"
							+ "Cela risque d'être un petit peu long...");
					
					double s = 5*n; 
					/* on détermine la somme que devra respecter les carré magiques d'ordre 4
		             * qui composeront notre grand carré magique d'ordre n (à multiplier par 4 
		             * car doit être congrue à 0[4] */
					
		            int d = n/4;
		            //on regarde le nombre de carré d'ordre n qu'il faudra utiliser pour couvrir un côté du carré
		
		
		           for (int j=0, l=0; j<d; j++, l=l+4)
		           {
		        	   //s'éxécute d fois (pour chaque ligne)
		
					/*à chaque itération, il faut remplir une nouvelle série de carré de 4*4 sur une ligne,
					 *  donc on incrémente la valeur la ligne de 4 pour sauter les lignes de carré remplis 
					 *  à l'itération k-1 */
		
		        	   for ( int u=0, c=0; u<d; u++, c=c+4)
		        	   { //s'éxécute d fois (pour chaque colonne)
		
		//à chaque itération, il faut remplir un nouveau carré de 4*4 sur une colonne, donc on incrémente la valeur
		//la colonne de 4 pour sauter les carrés remplis à l'itération k-1
		
		        		   int[][] carreVariant= ordre4.ordreQuatre(4*(int)s, n);//à chaque itération on crée un tableau de dimension 4 ayant pour somme 4*s
		           
		//maintenant qu'on a les cordonnées de la case en haut à gauche du tableau de dimension 4 à remplir
		//on remplit le carré de dimension 4 relativement à cette première case
				
				           carre[l][c]=carreVariant[0][0]; 
				           carre[l][c+1]=carreVariant[0][1];
				           carre[l][c+2]=carreVariant[0][2];
				           carre[l][c+3]=carreVariant[0][3];
				
				           carre[l+1][c]=carreVariant[1][0];
				           carre[l+1][c+1]=carreVariant[1][1];
				           carre[l+1][c+2]=carreVariant[1][2];
				           carre[l+1][c+3]=carreVariant[1][3];
				
				           carre[l+2][c]=carreVariant[2][0];
				           carre[l+2][c+1]=carreVariant[2][1];
				           carre[l+2][c+2]=carreVariant[2][2];
				           carre[l+2][c+3]=carreVariant[2][3];
				
				           carre[l+3][c]=carreVariant[3][0];
				           carre[l+3][c+1]=carreVariant[3][1];
				           carre[l+3][c+2]=carreVariant[3][2];
				           carre[l+3][c+3]=carreVariant[3][3];
		        	   }
	
	
		           }//Fin du remplissage du grand tableau
	           
		           int t = d*(int) s;
		           sommeMagique =  4*t;
	
	
				}// Fin si n pairement pairement pair
			
			}
		
        }
		
		Ecriture_fichier.ecrire_carre(n, carre, sommeMagique);
		return carre;
	}  // Fin de méthode

} // Fin de classe